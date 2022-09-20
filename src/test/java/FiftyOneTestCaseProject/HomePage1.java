package FiftyOneTestCaseProject;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utilitiez.Driver;

public class HomePage1 {

	public static void clickTabmenu(String tabName) {
		List<WebElement> menuTabs = Driver.getDriver().findElements(By.xpath("//*[@id='main-nav']/li"));
		for (WebElement eachTab : menuTabs) {
			if (eachTab.getText().contains(tabName)) {
				eachTab.click();
				break;
			}

		}
	}

	public List<WebElement> elements(String xpath) {
		return Driver.getDriver().findElements(By.xpath(xpath));
	}

	public WebElement element(String xpath) {
		return Driver.getDriver().findElement(By.xpath(xpath));

	}

	@Before
	public void setBefore() {
		Driver.getDriver();
		// Open browser and open Web URL
	}

	@Test
	public void threeSlider() {
		clickTabmenu("Shop");
		element("//*[@id='site-logo']/a").click();
		int expectSlide = 3;
		int slide = elements("//*[@id='n2-ss-6']/div").size();
		Assert.assertEquals(expectSlide, slide);

	}

}
