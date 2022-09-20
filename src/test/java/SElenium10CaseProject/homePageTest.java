package SElenium10CaseProject;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utilitiez.ConfigReader;
import Utilitiez.Driver;

public class homePageTest {

	@Before
	public void setUp() {
//	         * 1) Open the browser
		// 2) Enter the URL “http://practice.automationtesting.in/”
		Driver.getDriver();

	}

	@Test
	public void homePageWithThreeSlidersOnly() {

//	        3) Click on Shop Menu 
//	        
		clickTabMenu("Shop");
//
//	        // * 4) Now click on Home menu button
		Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("homeButton"))).click();
//	        
//	        
//	        // 5) test whether the Home page has Three Sliders only 

//	        //6) The Home page must contains only three
//	        // * sliders

		List<WebElement> sliders = Driver.getDriver().findElements(By.xpath("///*[@id='n2-ss-6']/div/div/div/div"));

		int sliderSize = sliders.size();
		int expSlider = 3;

		Assert.assertEquals(sliderSize, expSlider);

		System.out.println("pass");

//		for (WebElement eachSlider : expSlider) {

	}

	public static void clickTabMenu(String tabName) {

		List<WebElement> menuTabs = Driver.getDriver().findElements(By.xpath("//*[@id=\"main-nav\"]/li"));
//	        
		for (WebElement eachTab : menuTabs) {

			if (eachTab.getText().contains("tabName")) {
				eachTab.click();

				break;
			}

		}

	}
}
