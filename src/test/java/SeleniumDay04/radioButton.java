package SeleniumDay04;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class radioButton {

	WebDriver driver;

	// http://test.rubywatir.com/radios.php

	@Before
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("http://test.rubywatir.com/radios.php");

	}
	@Ignore
	@Test
	public void radio() {

		Boolean RadioSelected = driver.findElement(By.xpath("(//input[@name='likeit'])[1]")).isSelected();

		if (RadioSelected) {

			System.out.println("First radio button is selected by default");

			driver.findElement(By.xpath("(//input[@name='likeit'])[6]")).click();
		} else {

			System.out.println("default isn't selected, please go home");
		}

	}

	@Ignore
	@Test
	public void radio1() throws InterruptedException {

		driver.findElement(By.xpath("(//input[@name='likeit'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='likeit'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='likeit'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='likeit'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='likeit'])[5]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='likeit'])[6]")).click();

	}

	@Test
	public void verifyRadioButtonText() {

		String allRadioButtonText = driver.findElement(By.xpath("//*[text()=' Radio1']")).getText();
		// System.out.println(allRadioButtonText);
//		String radioButtonString2 = driver.findElement(By.xpath("(//input[@name='likeit'])[2]")).getText();
//		String radioButtonString3 = driver.findElement(By.xpath("(//input[@name='likeit'])[3]")).getText();
//		String radioButtonString4 = driver.findElement(By.xpath("(//input[@name='likeit'])[4]")).getText();
//		String radioButtonString5 = driver.findElement(By.xpath("(//input[@name='likeit'])[5]")).getText();
//		String radioButtonString6 = driver.findElement(By.xpath("(//input[@name='likeit'])[6]")).getText();
//		
		String expectedRadioText1 = "Radio1";
		String expectedRadioText2 = "Radio2";
		String expectedRadioText3 = "Radio3";
		String expectedRadioText4 = "Radio4";
		String expectedRadioText5 = "Radio5";
		String expectedRadioText6 = "Radio6";

		if (allRadioButtonText.contains(expectedRadioText1)) {
			System.out.println("Radio button  1 is named as expected");
		} else {
			System.out.println("Radio button  is not numbered as 1");
		}

		if (allRadioButtonText.contains(expectedRadioText2)) {
			System.out.println("Radio button  2 is named as expected");
		} else {
			System.out.println("Radio button  is not numbered as 2");
		}
		if (allRadioButtonText.contains(expectedRadioText3)) {
			System.out.println("Radio button  3 is named as expected");
		} else {
			System.out.println("Radio button  is not numbered as 3");
		}
		if (allRadioButtonText.contains(expectedRadioText4)) {
			System.out.println("Radio button  4 is named as expected");
		} else {
			System.out.println("Radio button  is not numbered as 4");
		}
		if (allRadioButtonText.contains(expectedRadioText5)) {
			System.out.println("Radio button  5 is named as expected");
		} else {
			System.out.println("Radio button  is not numbered as 5");
		}
		if (allRadioButtonText.contains(expectedRadioText6)) {
			System.out.println("Radio button  6 is named as expected");
		} else {
			System.out.println("Radio button  is not numbered as 6");
		}

		driver.quit();
	}

}
