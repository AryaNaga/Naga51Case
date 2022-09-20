package SeleniumDay07;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_Elenora {

	WebDriver driver;
	Actions action;

	@Before
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		action = new Actions(driver);
		// 1) Open the browser
		// 2) Enter the URL “http://practice.automationtesting.in/”
		driver.get("https://practice.automationtesting.in/");
	}

	@Test
	public void loginWithCorrectUsernameAndEmptyPassword() {

		// 3) Click on My Account Menu
		driver.findElement(By.xpath("//*[@id='menu-item-50']")).click();

		// 4) Enter valid userName in userName textBox
		WebElement eMail = driver.findElement(By.xpath("//*[@name='username' and @id='username']"));
		eMail.sendKeys("yfuh0496@gmail.com");

		// 5) Now enter empty password in the password textBox
		driver.findElement(By.xpath("//*[@name='password' and @id='password']")).sendKeys("");

		// 6) Click on login button
		driver.findElement(By.xpath("//*[@name='login' and @value='Login']")).click();

		// 7) Proper error must be displayed( Invalid password) and prompt to enter
		// login again
		String actualMessage = driver.findElement(By.xpath("//*[@id='page-36']/div/div/ul/li")).getText();

		String expectedMessage = "Error: Password is required.";

		Assert.assertTrue(actualMessage.equals(expectedMessage));

	}
}
