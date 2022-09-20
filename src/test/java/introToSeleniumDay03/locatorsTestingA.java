package introToSeleniumDay03;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locatorsTestingA {

	WebDriver driver;

	@Test
	public void method1() throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Index.html");

		// entere email address
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");

		// clicked on submit button
		driver.findElement(By.id("enterimg")).click();

		// firstName
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Shafkat");

		// lastName
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Ali");

		// addressInputBox
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("12122 Hello Rd.");

		// email input box
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("abc@gmail.com");

		// phoneNumber*
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("222222222");

		// male/femal radioButton
		WebElement maleFemaleRadioButton = driver
				.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input"));
		maleFemaleRadioButton.click();

		// checkbox
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox2")).click();
		driver.findElement(By.id("checkbox3")).click();

		WebElement element = driver.findElement(By.id("msdd"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

		// language Drop Down
		driver.findElement(By.id("msdd")).click(); // opens the dropDown with options
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[1]")).click(); // chooses
																															// Arabic

		// click out of the language dropDown
		maleFemaleRadioButton.click();

		// Skills DropDown
		driver.findElement(By.id("Skills")).click();
		driver.findElement(By.xpath("//*[@id=\"Skills\"]/option[2]")).click();

		// click out of the skills dropDown
		maleFemaleRadioButton.click();

		Thread.sleep(3000);

		// Select Country dropdown
		//// has problem, doesn't populate with options

		// Country Dropdown
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[10]/div/span/span[1]/span")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Australia", Keys.ENTER);

		// Birthday DropDowns

		// years
		driver.findElement(By.id("yearbox")).click();
		driver.findElement(By.xpath("//*[@id=\"yearbox\"]/option[2]")).click();

		// month
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")).click();
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select/option[4]")).click();

		// days
		driver.findElement(By.id("daybox")).click();
		driver.findElement(By.xpath("//*[@id=\"daybox\"]/option[4]")).click();

		// first Password
		driver.findElement(By.id("firstpassword")).sendKeys("freedom123");

		// Second password
		driver.findElement(By.id("secondpassword")).sendKeys("freedom123");

		// clear out the fields
		driver.findElement(By.id("Button1")).click();

		driver.quit();

	}

}
