package SeleniumDay05;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practiceFindElements {

	WebDriver driver;
	Select select;

	@Before
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/");

	}

	@Test
	public void printList() {
		List<WebElement> shoppingItems = (List<WebElement>) driver.findElement(By.xpath("//*[@id='homefeatured']/li"));

		for (WebElement eachItem : shoppingItems) {
			System.out.println(eachItem.getText());
		}
	}

	@Test
	public void printList1() {

		List<WebElement> list = driver.findElements(By.xpath("//*[@id='content']/ul"));

		for (WebElement eachList : list) {
			System.out.println(eachList.getText());

		}
	}
}

