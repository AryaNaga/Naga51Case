package introToSeleniumDay03;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task1 {

	WebDriver driver;

	@Test
	public void test1() {

//		 1) Open the browser
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://practice.automationtesting.in/my-account/");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://practice.automationtesting.in/");

		driver.findElement(By.xpath("//*[@id=\"menu-item-50\"]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[3]/input[3]")).click();

		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("austin.budws@gmail.com");

		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Mustang&123456");

		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();

		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/p[1]/a")).click();

	}

}

//2) Enter the URL “http://practice.automationtesting.in/”

//3) Click on My Account Menu

//Register if do not have username/password
//4) Enter registered username in username textbox
//5) Enter password in password textbox
//6) Click on login button
//7) User must successfully login to the web page 
//		
//		
