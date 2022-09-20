package TestNG_Tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class params {

	@Test
	@Parameters({ "val1", "val2" })
	public void sum(int num1, int num2) {

		int sumNums = num1 + num2;

		System.out.println(sumNums);
	}

	@Test
	@Parameters({ "val1", "val2" })
	public void multiply(int num1, int num2) {

		int sumNums = num1 * num2;

		System.out.println(sumNums);

	}

}
