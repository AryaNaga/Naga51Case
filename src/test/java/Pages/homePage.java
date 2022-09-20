package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilitiez.Driver;

public class homePage {

	public homePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
 
	@FindBy(xpath = "//*[@id='main-nav']/li")
	public List<WebElement> menuTabz;

	@FindBy(xpath = "//*[@id='n2-ss-6']/div/div/div/div")
	public List<WebElement> sliders;

	public int sizeOfSliders() {

		int sliderSize = sliders.size();

		return sliderSize;
	}

	public void clickTabMenu(String tabName) {

		// List<WebElement> menuTabs = menuTabz;

		for (WebElement eachTab : menuTabz) {

			if (eachTab.getText().contains(tabName)) {
				eachTab.click();

				break;
			}

		}

	}

}
