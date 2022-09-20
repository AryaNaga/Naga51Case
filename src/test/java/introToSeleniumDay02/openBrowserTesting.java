package introToSeleniumDay02;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class openBrowserTesting {

	WebDriver driver;

	@Before
	public void setup() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.youtube.com/watch?v=YdlnEWC-7Wo");
		driver.manage().window().maximize();
	}

	@Test
	public void test() {
		String title = driver.getTitle();
		System.out.println(title);
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);

		driver.getTitle();
		title = driver.getTitle();
		System.out.println("Original Site title --> " + title);

		currentURL = driver.getCurrentUrl();
		System.out.println("Original Site URL --> " + currentURL);

		driver.navigate().to("https://www.techcircleschool.com/");

		title = driver.getTitle();
		System.out.println("TechCircle Site title --> " + title);

		currentURL = driver.getCurrentUrl();
		System.out.println("TechCircle Site URL --> " + currentURL);

		driver.navigate().back();

		title = driver.getTitle();
		System.out.println("Youtube Site title --> " + title);

		currentURL = driver.getCurrentUrl();
		System.out.println("Youtube Site URL --> " + currentURL);

		driver.quit();

	}
}
