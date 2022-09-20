package SeleniumDay04;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxTest {

	WebDriver driver;

	@Before
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("http://test.rubywatir.com/checkboxes.php");

	}

	@Test
	public void radioButton() {

//		String checkbox = driver.findElement(By.xpath("(//input[@name='sports'])[1]")).getAttribute("value");
//		
//		System.out.println(checkbox);

		Boolean soccerCheckboxButton = driver.findElement(By.xpath("(//input[@name='sports'])[1]")).isSelected();
		Boolean FootballCheckboxButton = driver.findElement(By.xpath("(//input[@name='sports'])[2]")).isSelected();
		Boolean BaseballCheckboxButton = driver.findElement(By.xpath("(//input[@name='sports'])[3]")).isSelected();
		Boolean BasketballCheckboxButton = driver.findElement(By.xpath("(//input[@name='sports'])[4]")).isSelected();
		Boolean snookerCheckboxButton = driver.findElement(By.xpath("(//input[@name='sports'])[5]")).isSelected();
		Boolean RugbyCheckboxButton = driver.findElement(By.xpath("(//input[@name='sports'])[6]")).isSelected();
		Boolean GolfCheckboxButton = driver.findElement(By.xpath("(//input[@name='sports'])[7]")).isSelected();
		Boolean NetballCheckboxButton = driver.findElement(By.xpath("(//input[@name='sports'])[8]")).isSelected();

		System.out.println("soccer is: " + soccerCheckboxButton);
		System.out.println("Football is: " + FootballCheckboxButton);
		System.out.println("Baseball is: " + BaseballCheckboxButton);
		System.out.println("Basketball is: " + BasketballCheckboxButton);
		System.out.println("Snooker is: " + snookerCheckboxButton);
		System.out.println("Rugby is: " + RugbyCheckboxButton);
		System.out.println("Golf is: " + GolfCheckboxButton);
		System.out.println("Netball is: " + NetballCheckboxButton);

		driver.findElement(By.xpath("(//input[@name='sports'])[8]")).click();
	}

}