package TestNG_Tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class testPrioritize {

	@Test(priority = 7)

	public void testunGoogleHomePage() {
		System.out.println("this is line 11"); // fourth

	}

	@Test(priority = 4)
	public void testingLoginValidEmailAndValidPassword() {
		System.out.println("this is line 16");
	}

	@Test(priority = -1)
	public void testingLoginValidEmailAndValid() {
		System.out.println("this is line 22"); // First

	}

	@Test(priority = 0, enabled = true)
	public void HelloLoginValidEmailAndValid() {
		System.out.println("this is line 29");
	}

	@Test(groups = "smokeTest", priority = 1)
	public void testinGoogleHomePage() {
		System.out.println("this is line 11"); // third
	}

	@Test(groups = "regressionSuite", priority = 2)
	public void testingLoginWithValidEmailAndValidPassword() { // first
		System.out.println("this is line 16");

	}

	@Test(groups = { "smokeTest", "regressionSuite" })
	public void testingWithValidEmailAndValid() { // second
		System.out.println("this is line 22");

	}

	@Test(enabled = true)
	public void HelloWithValidEmailAndValid() { // fourth
		System.out.println("this is line 29");

	}

}