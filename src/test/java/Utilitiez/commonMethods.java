package Utilitiez;

import java.util.Locale;

import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

public class commonMethods {

	
	static FakeValuesService fakeValuesService;

	public static String randomUsername() {
		fakeValuesService = new FakeValuesService(new Locale("en-GB"), new RandomService());

		String email = fakeValuesService.bothify("????##@gmail.com");
		return email;
	}

	public static String randomPassword() {
		fakeValuesService = new FakeValuesService(new Locale("en-GB"), new RandomService());
		String password = fakeValuesService.regexify("[a-z1-9]{10}");;
		return password;
	}

}
