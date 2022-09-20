package SElenium10CaseProject;

//	public void setUp() {
////         * 1) Open the browser
////2) Enter the URL “http://practice.automationtesting.in/”
//		Driver.getDriver();
//
//	}
//
//	@Test
//	public void LogInWithValidUsernameAndPassword() {
//
//		homePageTest.clickTabMenu("My Account");
//
//		Driver.getDriver().findElement(By.id("username")).sendKeys(ConfigReader.getProperty("username"));
//
//		Driver.getDriver().findElement(By.id("password")).sendKeys(ConfigReader.getProperty("password"), Keys.ENTER);
//
//		String SignOutText = Driver.getDriver().findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/p[1]/a"))
//				.getText();
//
//		Assert.assertTrue(SignOutText.contains("Sign out"));
//
//	}

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;

import Pages.homePage;
import Pages.loginRegistrationPage;
import Pages.myAccountPage;
import Utilitiez.ConfigReader;
import Utilitiez.Driver;

public class myAccountLoginPageTest {

	homePage hp;
	loginRegistrationPage lrp;
	myAccountPage mAp;
 
	@Before
	public void setUp() {
//			 * 1) Open the browser
		// 2) Enter the URL “http://practice.automationtesting.in/”
		Driver.getDriver();
		hp = new homePage();
		lrp = new loginRegistrationPage();
		mAp = new myAccountPage();
	}

	/*
	 * 
	 * 3) Click on My Account Menu 4) Enter registered username in username textbox
	 * 5) Enter password in password textbox 6) Click on login button 7) User must
	 * successfully login to the web page
	 */

	@Test
	public void LogInWithValidUsernameAndPassword() {
		hp.clickTabMenu(ConfigReader.getProperty("myAccountText"));
		lrp.loginNameInputField.sendKeys(ConfigReader.getProperty("username"));
		lrp.loginPasswordInputField.sendKeys(ConfigReader.getProperty("password"), Keys.ENTER);
		Assert.assertTrue(mAp.signOutButton.getText().contains(ConfigReader.getProperty("signOutText")));
	}

}
