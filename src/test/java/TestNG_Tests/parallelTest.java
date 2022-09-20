package TestNG_Tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallelTest {

	public WebDriver driver;

	@Test
	public void safariTest() {
		System.out.println("The thread ID for safari is " + Thread.currentThread().getId());

		WebDriverManager.safaridriver().setup();
		driver = new SafariDriver();

		driver.get("https://demoqa.com");

	}

	@Test
	public void chromeTest() {
		System.out.println("The thread ID for chrome is " + Thread.currentThread().getId());

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://demoqa.com");

	}

}