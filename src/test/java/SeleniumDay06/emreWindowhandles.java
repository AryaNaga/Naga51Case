package SeleniumDay06;

import java.util.Set;



import java.util.Iterator;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class emreWindowhandles {

	WebDriver driver;

	@Before
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://demoqa.com/browser-windows");
	}

	@Test
	public void test() throws InterruptedException {

		driver.findElement(By.xpath("//*[@id='tabButton']")).click();
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentID = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		driver.findElement(By.xpath("//*[@id='sampleHeading']")).getText();
		Thread.sleep(2000);
		driver.close();

		driver.findElement(By.xpath("//*[@id='windowButton']")).click();
		Set<String> idss = driver.getWindowHandles();
		Iterator<String> itt = idss.iterator();
		String parentIDD = it.next();
		String childIDD = it.next();
		driver.switchTo().window(childId);
		driver.findElement(By.xpath("//*[@id='sampleHeading']")).getText();
		Thread.sleep(2000);
		driver.close();

	}

}