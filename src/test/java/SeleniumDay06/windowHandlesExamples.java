package SeleniumDay06;

import java.util.Iterator;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowHandlesExamples {

	WebDriver driver;
	Actions act;

	@Before
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/windows");
	}

	@Test
	public void test() {

		String initialTitle = driver.getTitle();
		System.out.println("Title before switchin over window handle : " + initialTitle);

		// clicking on the link that opens up another tab

		driver.findElement(By.xpath("//*[@id='content']/div/a")).click();

		Set<String> ids = driver.getWindowHandles();

		Iterator<String> it = ids.iterator();

		String parentID = it.next();
		String childId = it.next();

		driver.switchTo().window(childId);

		// will try to get the text on the child tab
		String textFromChildID = driver.findElement(By.xpath("/html/body/div/h3")).getText();

		System.out.println("Text from Child Window : " + textFromChildID);

		System.out.println("Title after switching over to child window: " + driver.getTitle());

		driver.switchTo().window(parentID);

		// try to get the text from parent window
		driver.findElement(By.xpath("//*[@id='content']/div/h3")).getText();
	}

}