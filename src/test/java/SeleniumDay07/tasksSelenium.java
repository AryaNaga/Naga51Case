package SeleniumDay07;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tasksSelenium {

	WebDriver driver;
	Actions action;

	@Before
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://jqueryui.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Ignore
	@Test
	public void assertingTitleTrue() {

		String expectedTitleAsString = "j Query BackEnd";

//	 driver.getTitle

		Assert.assertTrue(expectedTitleAsString.equals(driver.getTitle()));

	}

	@Test
	public void assertingTextFalse() {

		WebElement paragraphSection = driver.findElement(By.xpath("//*[@id='banner-secondary'"));

		try {

			driver.findElement(By.xpath("//*[@id=\"menu-top\"]/li[3]")).click();
			Assert.assertFalse(paragraphSection.isDisplayed());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
