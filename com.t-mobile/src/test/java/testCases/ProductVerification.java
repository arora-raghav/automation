package testCases;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import core.TestCore;
import pages.AddToCartSummary;
import pages.HomePage;
import pages.ProductDetails;
import pages.SearchResultPage;

public class ProductVerification extends TestCore{

	@Test
	public void verifyProductPrice() 
	{
		logger = LogManager.getLogger(ProductVerification.class);
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);;
		logger.info("Home Page Opened");
		SearchResultPage searchResultPage = homePage.searchProduct("tshirt");
		ProductDetails productDetails = searchResultPage.selectRandomProduct();
		String expectedPrice = productDetails.getProductPrice();
		AddToCartSummary addToCartSummary = productDetails.addToCart();
		String actualPrice = addToCartSummary.getProductPrice();
		Assert.assertEquals(actualPrice, expectedPrice);
	}

}
