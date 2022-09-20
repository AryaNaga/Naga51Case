package TestNG_Tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderTest {

	@DataProvider(name = "emre")
	public Object[][] dpMethod() {

		return new Object[][] { { "Shoping" }, { "HomePage" }, { "AccountPage" } };
	}
 
	@DataProvider(name = "Gulfire")
	public Object[][] anotherDataProvider() {

		return new Object[][] { { "Shoping" }, { "HomePage" }, { "AccountPage" } };
	}

	@Test(dataProvider = "emre")
	public void myTest(String val) {

		System.out.println("This method should be using EMRE = " + val);
	}

	@Test(dataProvider = "Gulfire")
	public void myTest2(String val) {

		System.out.println("This method should be using GULIRE = " + val);
	}

	@Test(enabled = false)
	public void myTest3(String val) {

		System.out.println(val);
	}

	@DataProvider(name = "miran")
	public Object[][] providerForValidation() {

		return new Object[][] { { 2, 4, 6 }, { 4, 6, 10 }, { 10, 20, 30 } };
	}

	@Test(dataProvider = "miran")
	public void validatinSum(int a, int b, int sum) {

		int result = a + b;

		AssertJUnit.assertEquals(sum, result);

	}

}
