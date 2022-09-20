package FiftyOneTestCaseProject;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myAccount_Login {

	WebDriver driver;

	@Before
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();

		// 1. Open the browser

		driver = new ChromeDriver();

//		2) Enter the URL “http://practice.automationtesting.in/”

		driver.get("practice.automationtesting.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//		3) Click on My Account Menu

		driver.findElement(By.xpath("//*[@id='menu-item-50']/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

//@Ignore
	@Test
	public void loginWithValidUsernameAndPassword() {
//		4) Enter registered user name in user name text box

		driver.findElement(By.xpath("//*[@name='username' and @id='username']")).sendKeys("????@gmail.com");

//		5) Enter password in password text box

		driver.findElement(By.xpath("//*[@name='password' and @id='password']")).sendKeys("Fluffy#ISLife2022");
//		6) Click on login button

		driver.findElement(By.xpath("//*[@name='login' and @value='Login'")).click();

//		7) User must successfully login to the web page

		driver.findElement(By.xpath("//*[text()= 'Sign out'")).click();

		System.out.println("passed");
	}

	@Ignore
	@Test
	public void loginWithIncorrectUserNameAndIncorrectPassword() {
		
//		1) Open the browser
//	2) Enter the URL “http://practice.automationtesting.in/”
//	3) Click on My Account Menu
//	4) Enter incorrect user name in user name text box
		WebElement eMail = driver.findElement(By.xpath("//*[@name='username' and @id='username']"));
		eMail.sendKeys("???@gmail.com");
				
//	5) Enter incorrect password in password textbox.
 	driver.findElement(By.xpath("//*[@name='password' and @id='password']")).sendKeys("Fluffy#ISLife20");
		
//	6) Click on login button
 	
 	driver.findElement(By.xpath("//*[@name='login' and @id='Login']"));
//	7) Proper error must be displayed(ie Invalid username) and prompt to enter login again
	
 	String actualMessage = driver.findElement(By.xpath("//*[@id='page-36']/div/div/ul/li")).getText();
 	
 	String expectedMesssage = "Error: Auser could not be found with this email adress.";
	
 	Assert.assertTrue(actualMessage.equals(expectedMesssage));
		
//		System.out.println("passed");
		
		
	}

	@Ignore
	@Test
	public void loginWithCorrectUserNameAndEmptyPassword() {

//    	4) Enter valid username in username textbox
		WebElement eMail = driver.findElement(By.xpath("//*[@name='username' and @id='username']"));
		eMail.sendKeys("????@gmail.com");

//    5) Now enter empty password in the password text box
		driver.findElement(By.xpath("//*[@name='login' and @id='Login']")).click();

//    6) Click on login button.

//    7) Proper error must be displayed(ie Invalid password) and prompt to enter login again
		String actualMessage = driver.findElement(By.xpath("//*[@id='page-36']/div/div/ul/li")).getText();

		String expectedMesssage = "Error: Password is required";

		Assert.assertTrue(actualMessage.equals(expectedMesssage));

		System.out.println("passed");

	}

	@Ignore
	@Test
	public void LoginWithEmptyUsernameAndPassword() {

//    	4) Enter empty user name in user name text box
		WebElement eMail = driver.findElement(By.xpath("//*[@name='username' and @id='username']"));
		eMail.sendKeys("");
//    5) Now enter valid password in the password text box
		driver.findElement(By.xpath("//*[@name='password' and @id='pasword']")).sendKeys("Fluffy#ISLife2022");

//    6) Click on login button.
		driver.findElement(By.xpath("//*[@name='login' and @value='Login']")).click();

//    7) Proper error must be displayed(ie Invalid username) and prompt to enter login again

		String actualMessage = driver.findElement(By.xpath("//*[@id='page-36']/div/div/ul/li")).getText();

		String expectedMesssage = "Error: User name is required";

		Assert.assertTrue(actualMessage.equals(expectedMesssage));

		System.out.println("passed");

	}
    @Ignore
	@Test
	public void LoginWithEmptyUsernameAndEmptyPassword() {
//		4) Enter empty username in username textbox
		WebElement eMail = driver.findElement(By.xpath("//*[@name='username' and @id='username']"));
		eMail.sendKeys("");
//	5) Now enter valid password in the password textbox
		driver.findElement(By.xpath("//*[@name='password' and @id='pasword']")).sendKeys("");

//	6) Click on login button.
		driver.findElement(By.xpath("//*[@name='login' and @value='Login']")).click();

//	7) Proper error must be displayed(ie required username) and prompt to enter login again
		String actualMessage = driver.findElement(By.xpath("//*[@id='page-36']/div/div/ul/li")).getText();

		String expectedMesssage = "Error: User name is required";

		Assert.assertTrue(actualMessage.equals(expectedMesssage));

		System.out.println("passed");

	}

}
