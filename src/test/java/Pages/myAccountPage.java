package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilitiez.Driver;

public class myAccountPage {

	public myAccountPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
 
	@FindBy(xpath = "//*[@id='page-36']/div/div[1]/div/p[1]/a")
	public WebElement signOutButton;

}
