package SeleniumDay05;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassTesting {

	WebDriver driver;
	Select select;

	@Before
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");

	}

	@Test
	public void selectValuesFromOptions() {

		// click on dresses tab
		driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[2]")).click();

		WebElement selectDropDown = driver.findElement(By.id("selectProductSort"));

		select = new Select(selectDropDown);

	//	select.selectByValue("quantity:desc");

		// select by index
		
	//	select.selectByIndex(3);
		
		// select by visible text

		select.selectByVisibleText("Reference: Lowest first");
	}

}

