package introToSeleniumDay01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openBrowserTest {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/naga/Desktop/selenium-java-3.141.59/chromdriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		
				
	}

}
