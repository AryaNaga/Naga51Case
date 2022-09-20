package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilitiez.Driver;

public class loginRegistrationPage {

	public loginRegistrationPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
 
	@FindBy(id = "username")
	public WebElement loginNameInputField;

	@FindBy(id = "password")
	public WebElement loginPasswordInputField;

	@FindBy(id = "reg_email")
	public WebElement regNameInputField;

	@FindBy(id = "reg_password")
	public WebElement regPasswordInputField;

}
