package TestNG_Tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Utilitiez.Driver;

public class testNGAssertions {

//	@Test
//	
//		public void test1() {
//		
//	
//		Driver.getDriver();
//		
//		String orignalTitle = Driver.getDriver().getTitle();
//		String expectedTitle = "UEFA Champions League";
//		// hard assertion
//		Assert.assertEquals(expectedTitle, orignalTitle,"UEFA Champions League");
//
//		System.out.println("this line of code ");
//		
//	}
//	@Test
//	
//	public void test2() {
//	
//
//	Driver.getDriver();
//	
//	String originalURL = Driver.getDriver().getCurrentUrl();
//	String expectedURL = "automationtesting";
//	
//	SoftAssert softassert = new SoftAssert();
//	
//	// hard assertion
//	softassert.assertEquals(originalURL, expectedURL);
//
//	System.out.println("Checking for this line of print ");
//	
//	softassert.assertAll();
//	System.out.println("Checking for this line of print after assertAll");
//	}
	@Test(enabled = false)
	public void test1() {

		Driver.getDriver();

		String originalTitle = Driver.getDriver().getTitle();
		String expectedTitle = "UEFA Champions League";

		// hard assertion
		AssertJUnit.assertEquals(expectedTitle, originalTitle, "Titles of the website do not match");
		System.out.println("this line of code");
	}

	@Test
	public void test2() {

		Driver.getDriver();

		String originalURL = Driver.getDriver().getCurrentUrl();
		String expectedURL = "automationtesting";

		// software assertion
		SoftAssert softassert = new SoftAssert();

		AssertJUnit.assertEquals(originalURL, expectedURL); // fail

		System.out.println("Checking for this line to print");

		softassert.assertAll();
//	        //object.assertAll() statement is required to 
//	        see the exceptions; otherwise, the tester won't 
//	        know what passed and what failed.

		System.out.println("Checking for this line to print after assertALL");

	}

	@Test(enabled = false, groups = "smokeTest")
	public void test3() {

		Driver.getDriver();

		String originalTitle = Driver.getDriver().getTitle();
		String expectedTitle = "UEFA Champions League";

		// hard assertion
		AssertJUnit.assertEquals(expectedTitle, originalTitle, "Titles of the website do not match");
		System.out.println("this line of code");
	}

	@Test(groups = { "smokeTest", "regressionSuite" })
	public void test4() {

		Driver.getDriver();

		String originalURL = Driver.getDriver().getCurrentUrl();
		String expectedURL = "automationtesting";

		// software assertion
		SoftAssert softassert = new SoftAssert();

		AssertJUnit.assertEquals(originalURL, expectedURL); // fail

		System.out.println("Checking for this line to print");

		Reporter.log("soft Assertion testing ");

		softassert.assertAll();
//        //object.assertAll() statement is required to 
//        see the exceptions; otherwise, the tester won't 
//        know what passed and what failed.

		System.out.println("Checking for this line to print after assertALL");

	}

}
