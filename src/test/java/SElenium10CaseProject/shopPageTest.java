package SElenium10CaseProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.homePage;
import Pages.shopPage;
import Utilitiez.ConfigReader;
import Utilitiez.Driver;

public class shopPageTest {
	Actions action;
	homePage hp;
	shopPage sp;
 
	@BeforeMethod
	public void setUp() {
//		 * 1) Open the browser
//2) Enter the URL “http://practice.automationtesting.in/”
		Driver.getDriver();
		hp = new homePage();
		sp = new shopPage();
	}

	@Test
	public void ShopFilterByPriceFunctionality() {

		hp.clickTabMenu(ConfigReader.getProperty("myShopText"));
		Integer priceInteger = Integer.parseInt(sp.maxPriceText.toString().substring(1));
		System.out.println(priceInteger);

		while (priceInteger > 450) {
			sp.rightPriceToggle.sendKeys(Keys.ARROW_LEFT);
			priceInteger = Integer.parseInt(sp.maxPriceText.toString().substring(1));
		}

		sp.filterBtn.click();

		String priceNotOnSaleText;
		for (int i = 0; i < sp.itemsNoSale.size(); i++) {
			priceNotOnSaleText = sp.itemsNoSale.get(i).getText().substring(1);
			Assert.assertTrue(Double.valueOf(priceNotOnSaleText) <= 450);
			Assert.assertTrue(Double.valueOf(priceNotOnSaleText) >= 150);
		}

		String priceOnsaleText;
		for (int i = 0; i < sp.itemsAfterSale.size(); i++) {
			priceOnsaleText = sp.itemsAfterSale.get(i).getText().substring(1);
			Assert.assertTrue(Double.valueOf(priceOnsaleText) <= 450);
			Assert.assertTrue(Double.valueOf(priceOnsaleText) >= 150);
		}
	}
	/*
	 * 4) Adjust the filter by price between 150 to 450 rps 5) Now click on Filter
	 * button 6) User can view books only between 150 to 450 rps pric
	 */

}
