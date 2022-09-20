package TestNG_Tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SafariTesting {

	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		WebDriverManager.safaridriver().setup();
		driver = new SafariDriver();

		driver.get("https://demoqa.com");
	}

	@Test
	public void safariTestMethod() {
		System.out.println("SafariTitle is " + driver.getTitle());
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}