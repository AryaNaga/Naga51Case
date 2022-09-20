package introToSeleniumDay01;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task1 {

	WebDriver driver;

	@Test
	public void main2() throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		// Open Browser

		// Enter URL

		driver.get("http://practice.automationtesting.in/");

		// click on account menu

		driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a")).click();

		// register email

		// enter new email

		driver.findElement(By.id("username")).sendKeys("DannyTest1@email.com");

		// enter new pass

		// click password because entering new pass manually doesn't work

		driver.findElement(By.id("password")).click(); // didn't work either, trying to give it a delay
		Thread.sleep(3000); // now works, should go back and see what exactly went wrong

		driver.findElement(By.id("password")).sendKeys("Pass!@#$%abc123");

		// click Login

		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div[1]/form/p[3]/input[3]"))
				.click();
		driver.quit();
	}

}
