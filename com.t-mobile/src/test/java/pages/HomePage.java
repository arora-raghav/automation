package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	// It uses and condition where both locators should be present in the page, 
/*	@FindBys(
				{
					@FindBy(id="twotabsearchtextbox"),
					@FindBy(id="Test")
				}
			)
	WebElement search;

	@FindAll(
			{
				@FindBy(id="twotabsearchtextbox"),
				@FindBy(id="twotabsearch")
			}
			)
	WebElement price;*/
	public WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(id="twotabsearchtextbox")
	WebElement searchBox;

	@FindBy(tagName="a")
	List<WebElement> links;

	@FindBy(xpath="//input[@value='Go']")
	WebElement searchButton;

	public SearchResultPage searchProduct(String productName)
	{
		searchBox.sendKeys(productName);
		searchButton.click();
		
		return PageFactory.initElements(driver, SearchResultPage.class);
	}
}
