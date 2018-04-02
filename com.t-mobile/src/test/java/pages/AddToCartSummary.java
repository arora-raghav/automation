package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartSummary {

	public WebDriver driver;
	public AddToCartSummary(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(xpath="//div[@id='hlb-subcart']//span[contains(@class,'price')]/span")
	WebElement productPrice;
	
	public String getProductPrice()
	{
		return productPrice.getText().trim();
	}
	
}
