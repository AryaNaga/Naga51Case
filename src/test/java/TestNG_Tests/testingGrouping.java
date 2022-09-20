package TestNG_Tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class testingGrouping {

	@Test(dependsOnGroups = { "smokeTest" })
	public void logOut() {
		System.out.println("depends on groups Smoke Test");
	}

	@Test(groups = "smokeTest")
	public void WorkingOnThisTestCase() { // fourth
		System.out.println("this is line 29");
	}
//	@Test(groups="smokeTest")
//	public void WorkingOnThisTestCase2() {   //fourth
//		Assert.assertTrue(false);

//	}

}
