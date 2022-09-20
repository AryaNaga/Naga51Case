package TestNG_Tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

	@BeforeMethod
	@Test(priority = 1, description = "This is a login test")
	public void bloginTest() {
		System.out.println("Login is succesfull");
	}

	@Test(priority = 2, description = "This is a logout test")
	public void alogoutTest() {
		System.out.println("Logout is succesfull");
	}

}
