package FiftyOneTestCaseProject;


import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import SElenium10CaseProject.homePageTest;
import Utilitiez.Driver;

public class ShopPageTest {
	Actions action;

	
	@Before
	public void setUp() {
//			 * 1) Open the browser
		// 2) Enter the URL “http://practice.automationtesting.in/”
		Driver.getDriver();

	}

	@Test
	public void ShopFilterByPriceFunctionality() {
		
	Driver.driver.findElement(By.xpath("//*[@id='menu-item-40']/a")).click();

//		homePageTest.clickTabMenu("//*[@id='menu-item-40']/a"); 
		
//			action = new Actions(Driver.getDriver());
//			WebElement dragDot = Driver.getDriver().findElement(By.xpath("//*[@id='woocommerce_price_filter-2']/form/div/div[1]/span[2]"));			
//			action.dragAndDropBy(dragDot, -28, 0).build().perform();			
//			Driver.getDriver().findElement(By.xpath("//button[contains(text(),'Filter')]")).click();			
		// 4) Adjust the filter by price between 150 and 450 rps

		String maxPriceText = Driver.getDriver()
				.findElement(By.xpath("//*[@id='woocommerce_price_filter-2']/form/div/div[2]/div[1]/span[2]")).getText()
				.substring(1);

		Integer priceInteger = Integer.parseInt(maxPriceText);

		System.out.println(priceInteger);

		while (priceInteger > 450) {

			Driver.getDriver().findElement(By.xpath("//*[@id='woocommerce_price_filter-2']/form/div/div[1]/span[2]"))
					.sendKeys(Keys.ARROW_LEFT);

			maxPriceText = Driver.getDriver()
					.findElement(By.xpath("//*[@id='woocommerce_price_filter-2']/form/div/div[2]/div[1]/span[2]"))
					.getText().substring(1);

			priceInteger = Integer.parseInt(maxPriceText);
		}

		Driver.getDriver().findElement(By.xpath("//*[@id=\"woocommerce_price_filter-2\"]/form/div/div[2]/button"))
				.click();

		// 6) User can view books only between 150 and 450 rps price

		// Not on sale books have different xpath with On sale book

		String text = Driver.getDriver().findElement(By.xpath("//*[@id=\"content\"]/ul/li[1]/a[1]/span[2]/ins"))
				.getText();

		System.out.println(text);

		List<WebElement> NotOnSaleBooksList = Driver.getDriver()
				.findElements(By.xpath("//*[@id=\"content\"]/ul/li/a[1]/span[2]/ins"));

		String priceNotOnSaleText;

		for (int i = 0; i < NotOnSaleBooksList.size(); i++) {

			priceNotOnSaleText = NotOnSaleBooksList.get(i).getText().substring(1);

			Assert.assertTrue(Double.valueOf(priceNotOnSaleText) <= 450);
			Assert.assertTrue(Double.valueOf(priceNotOnSaleText) >= 150);

		}

		List<WebElement> onSaleBooksList = Driver.getDriver()
				.findElements(By.xpath("//*[@id=\"content\"]/ul/li/a[1]/span/span"));

		String priceOnsaleText;

		for (int i = 0; i < onSaleBooksList.size(); i++) {

			priceOnsaleText = onSaleBooksList.get(i).getText().substring(1);

			Assert.assertTrue(Double.valueOf(priceOnsaleText) <= 450);
			Assert.assertTrue(Double.valueOf(priceOnsaleText) >= 150);

		}

	}

	/* 
	 * 4) Adjust the filter by price between 150 to 450 rps 5) Now click on Filter
	 * button 6) User can view books only between 150 to 450 rps price
	 */

}
