package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {

	public WebDriver driver;
	public SearchResultPage(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(xpath="//ul[@id='s-results-list-atf']/li[2]")
	WebElement randomProduct;
	public ProductDetails selectRandomProduct()
	{
		randomProduct.click();
		return PageFactory.initElements(driver, ProductDetails.class);
	}
}
