package TestNG_Tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependent {

	@Test(dependsOnMethods = { "openBrowser", "openBrowser2" })

	public void SighIn() {
		System.out.println("This will execute second");
	}
 
	@Test

	public void openBrowser() {
		System.out.println("This will execute first");
		AssertJUnit.assertTrue(false);

	}

	@Test

	public void openBrowser2() {
		System.out.println("This will execute first");
		AssertJUnit.assertTrue(false);

	}

	@Test(dependsOnGroups = { "SmokeTest" })

	public void logOut() {
		System.out.println("depends on groups Smoke Test");
	}

}
