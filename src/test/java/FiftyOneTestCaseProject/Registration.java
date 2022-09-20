package FiftyOneTestCaseProject;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration {

	WebDriver driver;
    
	String validation;
//  WebDriverWait wait = new WebDriverWait(driver, 15);

	FakeValuesService fakerValue = new FakeValuesService(new Locale("en-GB"), new RandomService());

	String email = fakerValue.bothify("????@gmail.com");

	String password = "Fluffy#ISLife2022";

	@Before
	public void setBefore() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("http://practice.automationtesting.in/");

		driver.manage().window().maximize();

//      wait = new WebDriverWait(driver, 15);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void setAfter() throws InterruptedException {
		Thread.sleep(3000);
//		driver.quit();

	}
	@Test

	public void clickMyAccount() {
		// Method for clicking myaccount at the homepage
		driver.findElement(By.id("menu-item-50")).click();
	}
//	@Ignore
	@Test
    public void validationInsert(String expect) {
    	 validation = driver.findElement(By.xpath("//*[@class='woocommerce-error'/li")).getText();
    	 Assert.assertTrue(validation.equals(expect));
    	
    	System.out.println("Test Pass");
    	
    }
	@Ignore
	@Test
	public void registrationSignIn() throws InterruptedException {

		// My Account
		clickMyAccount();

		Thread.sleep(3000);
		
		// Insert Email
//      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name = 'register']")));

		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='reg_email']")).sendKeys(email);

		// Insert Password
		driver.findElement(By.xpath("//*[@id='reg_password']")).sendKeys(password);

		// Click Register
		driver.findElement(By.xpath("//input[@name = 'register']")).click();
	}
//	String text =	driver.switchTo().alert().getText();
		
//		System.out.println(text);
		@Ignore
	@Test
	
	public void registrationWithInvalidEmail_ID() throws InterruptedException {
	
		String password = "agsgh@3345";
		
	}

}
