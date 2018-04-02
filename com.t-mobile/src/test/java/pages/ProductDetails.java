package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetails {

	public WebDriver driver;
	public ProductDetails(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(id="productTitle")
	WebElement productTitle;
	
	@FindAll(
	{	@FindBy(id="priceblock_saleprice"),
		@FindBy(css="span[id='priceblock_ourprice']")
	})
	WebElement productPrice;
	
	@FindBy(id="add-to-cart-button")
	WebElement addToCart;
	public String getProductPrice()
	{
		return productPrice.getText().trim();
	}
	
	public String getProductTitle()
	{
		return productTitle.getText().trim();
	}
	public String getRating()
	{
		return "";
	}
	public AddToCartSummary addToCart()
	{
		addToCart.click();
		
		return PageFactory.initElements(driver, AddToCartSummary.class);
	}
	
}
