package SeleniumDay08;

import org.junit.After;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import Utilitiez.ConfigReader;
import Utilitiez.Driver;


public class testingBaseClassDriver {

	@Before
	public void beforeMethod() {
		Driver.getDriver();

	}

	@After
	public void afterMethod() {
		Driver.tearDown();

	}

	@Test
	public void test1() {
		System.out.println(ConfigReader.getProperty("message"));
//		System.out.println(ConfigReader.getAmazonProperty("amazon"));

//		 Driver.getDriver().findElement(By.id(ConfigReader.getProperty("loginButtonID"))).click();
	}

}