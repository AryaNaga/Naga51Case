package TestNG_Tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeTesting {

	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://demoqa.com");
	}

	@Test
	public void chromeTestMethod() {
		System.out.println("ChromeTitle is " + driver.getTitle());
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}