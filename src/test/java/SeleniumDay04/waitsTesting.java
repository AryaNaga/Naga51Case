package SeleniumDay04;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waitsTesting {

	WebDriver driver;

	WebDriverWait wait;
	@Before
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.tumblr.com/explore/trending?source=login_wall&redirect_to=%2Fexplore%2Ftrending");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		wait = new WebDriverWait(driver, 30);
		
		

	}

	@Test
	public void verifyInvalidCredentialMessage() {
		driver.findElement(By.xpath("//*[text()='Log in']")).click();

		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");

		driver.findElement(By.name("password")).sendKeys("abc1k2", Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[text()='Your email or password were incorrect.']"))));


		Boolean errorText = driver.findElement(By.xpath("//*[text()='Your email or password were incorrect.']"))
				.isDisplayed();

		System.out.println(errorText);

	}

}