package SeleniumDay06;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class moveYourMouseElement {
	

	WebDriver driver;
	Actions act;

	@Before
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.amazon.com//");

	}
	@Test
	public void hoveringoverElement() {
		
		act = new Actions(driver);
		
		act.moveToElement((WebElement) By.xpath("//*[@id='nav-link-accountLIst -nav-line-1']")).build().perform();
	}

}
