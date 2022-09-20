package SeleniumDay04;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class taskBeBee {

	WebDriver driver;

	// 1) Open the browser
	@Test
	public void method1() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		// 2) Enter the URL “http://practice.automationtesting.in/”
		driver.get("https://practice.automationtesting.in/");

		// 3) Click on My Account Menu
		// Register if do not have username/password
		driver.findElement(By.id("menu-item-50")).click();

		// 4) Enter registered username in username textbox
		driver.findElement(By.id("username")).sendKeys("bybbeek@gmail.com");

		// 5) Enter password in password textbox
		driver.findElement(By.id("password")).sendKeys("PrincessNo1!!!");

		// 6) Click on login button
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/p[1]/a")).click();

	}

}
