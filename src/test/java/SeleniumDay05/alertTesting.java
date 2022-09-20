package SeleniumDay05;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertTesting {

	WebDriver driver;
	Select select;

	@Before
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");

	}

	@Test
	public void selectValuesFromOptionalertTest() throws InterruptedException {

		driver.findElement(By.id("alertexamples")).click();

		Thread.sleep(3000);

		driver.switchTo().alert().accept();

	}

	@Test
	public void confirmeample() throws InterruptedException {
		driver.findElement(By.id("comfirmexamples")).click();

		Thread.sleep(3000);

		String alertText = driver.switchTo().alert().getText();

		Assert.assertEquals(" I am a confirm alert", alertText);

		driver.switchTo().alert().accept();

	}

	@Test
	public void promtexample() throws InterruptedException {

		driver.findElement(By.id("promptexample")).click();
		Thread.sleep(3000);
		String input = "Hello";
		driver.switchTo().alert().sendKeys(input);
		driver.switchTo().alert().accept();

		String output = driver.findElement(By.id("promptreturn")).getText();

		Assert.assertEquals(input, output);

		System.out.println("Passed");
	}
}