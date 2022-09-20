package SeleniumDay06;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementTask {


	private static final WebDriver Item = null;
	WebDriver driver;


	@Before
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com//");

	}

	@Test
//	
    public void printList() {

        List<WebElement> items = driver.findElements(By.xpath("//*[@id='content']/ul/li"));
//            for (WebElement eachItem: items) {
//                System.out.println(eachItem.getText());
//            }

        for (int i = 0; i < items.size(); i++) {

            System.out.println((i + 1) + " -- " + items.get(i).getText());

			
		}
	}

}
