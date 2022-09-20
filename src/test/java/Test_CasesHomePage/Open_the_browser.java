package Test_CasesHomePage;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Open_the_browser {

	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, 15);
	
	FakeValuesService fakerValue = new FakeValuesService(new Locale("en-GB"),new RandomService());
	

	    
	    String email = fakerValue.bothify("????@gmail.com");
	
	String password = "Fluffy#ISLIe2022";
	
	Select select;

	@Before
	public void setBefore() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://practice.automationtesting.in/");
		
//		driver.manage().window().maximize();
		
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
	
	}

	
	@After
	public void setAfeter()  throws InterruptedException{
		Thread.sleep(3000);
//        driver.quit();
		
	}
	
	public void clickMyAccount() {
		driver.findElement(By.id("menu-item-50")).click();
	}
	@Ignore
	@Test
	public void registrationWithValidInfo() {
		
		//click my account
		clickMyAccount();
		
		driver.findElement(By.xpath("//*[@id='reg_email']")).sendKeys(email);
		
		driver.findElement(By.xpath("//*[@id='reg_password']")).sendKeys(password);

		
		
		
	}
}
