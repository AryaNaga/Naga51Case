package SeleniumDay07;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frameSwitchTo {

	WebDriver driver;
	Actions action;

	@Before
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://jqueryui.com/droppable//");

	}

	@Test
    public void dragAndDrop() {

        List<WebElement> interactionsSideBar = driver.findElements(By.xpath("//*[@id='sidebar']/aside/ul/li"));

		for (WebElement eachTab : interactionsSideBar) {

			if (eachTab.getText().contains("Droppable")) {

				eachTab.click();
				break;
			}
		}

		driver.switchTo().frame(0);

		WebElement draggble = driver.findElement(By.id("draggable"));

		WebElement droppable = driver.findElement(By.id("droppable"));

		
		action.dragAndDrop(draggble, droppable).build().perform();

	}

}
