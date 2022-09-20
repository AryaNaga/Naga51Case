package SElenium10CaseProject;

import java.util.Locale;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

import Utilitiez.Driver;

public class myAccountRegistrationPageTest {

	WebDriver driver;

	String validation;
	// WebDriverWait wait = new WebDriverWait(driver, 15);

	FakeValuesService fakerValue = new FakeValuesService(new Locale("en-GB"), new RandomService());

	String email = fakerValue.bothify("mirano@techcircle.com");

	String password = "TechCircle123";

	@Before

	public void setUp() {
//         * 1) Open the browser
//2) Enter the URL “http://practice.automationtesting.in/”
		Driver.getDriver();

	}

	@Test
	public void RegistrationSignIn() throws InterruptedException {

		homePageTest.clickTabMenu("My Account");

		FakeValuesService fakeValuesService = new FakeValuesService(new Locale("en-GB"), new RandomService());

		String email = fakeValuesService.bothify("mirano@techcircle.com\n"
				+ "");
		String password = "TechCircle123";

		Driver.getDriver().findElement(By.id("reg_email")).sendKeys(email);
		Driver.getDriver().findElement(By.id("reg_password")).sendKeys(password, Keys.ENTER);

		Thread.sleep(3000);

		String SignOutText = Driver.getDriver().findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/p[1]/a"))
				.getText();

		Assert.assertTrue(SignOutText.contains("Sign out"));
		// not consistent with chrome testing

	}

	/*
	 * Enter Email Address to be registred Email-Address textbox 5) Enter your own
	 * password in password textbox 6) Click on Register button 7) User will be
	 * registered successfully and will be navigated to the Home page
	 */
	
}