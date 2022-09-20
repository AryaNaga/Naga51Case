package FiftyOneTestCaseProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import junit.framework.Assert;

public class HomePage {

	WebDriver driver;
	
	@Before
	public void beforeMethod() {
		
		// 1. Open browser
		driver = new ChromeDriver();
		// 2. Enter the URL "practice.automationtesting.in/"
		driver.get("https://practice.automationtesting.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	@Ignore
	@Test
	public void homePageWithThreeSlidersOnlyTest() {
		
		// 3. Click on Shop Menu
		WebElement elementShop = driver.findElement(By.xpath("// a[text()='Shop']"));
		elementShop.click();
		
		// 4. Now click on Home menu button
		
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		
		// 5. Test whether the Home page has Three Sliders only
		// 6. The Home Page must contains only three sliders
		List<WebElement> sliders = driver.findElements(By.xpath("//img[@class='n2-ss-slide-background-image"));
		
		System.out.println(sliders.size());
		
		Assert.assertEquals(3,sliders.size());
		
		System.out.println("passed");
		
		driver.close();
	}
	@Test
public void homePageWithThreeArrivalsOnly() {
		
		// 3. Click on Shop Menu
		WebElement elementShop = driver.findElement(By.xpath("// a[text()='Shop']"));
		elementShop.click();
		
		// 4. Now click on Home menu button
		
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		
		// 5. Test whether the Home page has Three Arrivals  only
		// 6. The Home Page must contains only three Arrivals
		List<WebElement> sliders = driver.findElements(By.xpath("//img[@class='attachment-shop_catalog size-shop_catalog"));
		
		System.out.println(sliders.size());
		
		Assert.assertEquals(3,sliders.size());
		
		System.out.println("passed");
		
		driver.close();
	}
}
