package FiftyOneTestCaseProject;

import static org.junit.Assert.assertTrue;

import java.util.Locale;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyAccount_Registration {
	WebDriver driver;

	String validation;
	// WebDriverWait wait = new WebDriverWait(driver, 15);

	FakeValuesService fakerValue = new FakeValuesService(new Locale("en-GB"), new RandomService());

	String email = fakerValue.bothify("????@gmail.com");

	String password = "Fluffy#ISLife2022";

	@Before
	public void setBefore() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("http://practice.automationtesting.in/");

		driver.manage().window().maximize();

//	      wait = new WebDriverWait(driver, 15);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void setAfter() throws InterruptedException {
		Thread.sleep(3000);
//			driver.quit();

	}

//	@Test

	public void clickMyAccount() {
		// Method for clicking my account at the home page
		driver.findElement(By.id("menu-item-50")).click();
	}

	@Test
	public void RegistrationSignIn() {
//	1) Open the browser
//	2) Enter the URL “http://practice.automationtesting.in/”
//	3) Click on My Account Menu
		clickMyAccount();
//	4) Enter registered Email Address in Email-Address text box
		driver.findElement(By.id("reg_email")).sendKeys(email);
//	5) Enter your own password in password text box
		driver.findElement(By.id("reg_password")).sendKeys("Fluffy#ISLife2022");
//	6) Click on Register button

		driver.findElement(By.xpath("//*[@name='register']")).click();
//	7) User will be registered successfully and will be navigated to the Home page

		driver.findElement(By.id("driver.findElement(By.xpath(\"//a[text()='Home Page']\")).click();"));

		WebElement element = driver.findElement(By.xpath("//*[@id='page-36']/div/div[1]/div/p[1]/a"));
		
		Assert.assertTrue(element.isDisplayed());
		
		System.out.println("The sign out button is display");
		
		String expectMessage ="Sign out";
		
		String actualMessage = driver.findElement(By.xpath("//*[@id='page-36']/div/div[1]/div/p[1]/a")).getText();
		
		Assert.assertEquals(actualMessage, expectMessage);
		System.out.println("The Expected text is show as expected");
		
	}

}