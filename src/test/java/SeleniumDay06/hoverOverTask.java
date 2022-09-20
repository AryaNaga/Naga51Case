package SeleniumDay06;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hoverOverTask {

	WebDriver driver;
	Actions act;

	@Before
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/hovers");

	}

//	@Test
//	public void hoveringoverElement() throws InterruptedException {
//
//		act = new Actions(driver);
//
//		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/img"))).build().perform();
//
//		Thread.sleep(3000);
//
//		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/img"))).build().perform();
//
//		Thread.sleep(3000);
//		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/img"))).build().perform();
//
//		Thread.sleep(3000);

//	}
	
	@Test
	public void actionClassInteractions() {
		WebElement source = driver.findElement(By.id("column-a"));
		WebElement target = driver.findElement(By.id("column-b"));
		
		
		act.dragAndDrop(source, target).build().perform();
	}
}
