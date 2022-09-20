package Utilitiez;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {
 
	public static WebDriver driver;

	public static WebDriver getDriver() {
 
		if (driver == null) {

			switch (ConfigReader.getProperty("browser")) {

			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();

				break;

			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();

				break;
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();

				break;

			case "safari":
				WebDriverManager.safaridriver().setup();
				driver = new SafariDriver();

				break;

			case "headless":
//	            WebDriverManager.
//	            driver = new ChromeDriver();
//	            driver.get("https://jqueryui.com");
				break;

			}

			driver.get(ConfigReader.getProperty("FiftyOneTestCaseProjectURL"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}

		return driver;

	}

	public static void tearDown() {

		if (driver != null) {
			driver.close();
			driver.quit();
		}

	}
}
