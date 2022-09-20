package Pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilitiez.Driver;

public class shopPage {

	public shopPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
 
	@FindBy(xpath = "//*[@id='content']/nav/a")
	public WebElement homeButton;

	@FindBy(xpath = "//*[@id='woocommerce_price_filter-2']/form/div/div[2]/div[1]/span[2]")
	public WebElement maxPriceText;

	@FindBy(xpath = "//*[@id='woocommerce_price_filter-2']/form/div/div[2]/div[1]/span[2]")
	public WebElement rightPriceToggle;

	@FindBy(xpath = "//*[@id='woocommerce_price_filter-2']/form/div/div[2]/button")
	public WebElement filterBtn;

	@FindBy(xpath = "//*[@id='content']/ul/li[1]/a[1]/span[2]/ins")
	public WebElement priceAfterSale;

	@FindBy(xpath = "//*[@id='content']/ul/li/a[1]/span/span")
	public List<WebElement> itemsAfterSale;

	@FindBy(xpath = "//*[@id='content']/ul/li/a[1]/span[2]/ins")
	public List<WebElement> itemsNoSale;

}
