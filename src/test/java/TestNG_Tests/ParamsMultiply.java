package TestNG_Tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamsMultiply {
	@Test
	@Parameters({ "val1", "val2" })
	public void multiply(int num1, int num2) {

		int multiply = num1 * num2;

		System.out.println(multiply);

	}
}