package TestNG_Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class orderOfExecutionTestNG {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before Suite");

	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("before Test");

	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("before Class");

	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before Method");

	}

	@Test
	public void Test1() {
		System.out.println("Test1");

	}

	@Test
	public void Test2() {
		System.out.println("Test2");

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");

	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");

	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");

	}

}
