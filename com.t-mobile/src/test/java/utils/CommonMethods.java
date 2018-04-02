package utils;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CommonMethods {

	public static void mouseHover(WebDriver driver, WebElement ele1, WebElement ele2, WebElement ele3)
	{
		Actions action = new Actions(driver);
		action.moveToElement(ele1).perform();
		action.moveToElement(ele2).perform();
		action.moveToElement(ele3).click().perform();
	}
	public void mouseHover(WebDriver driver, WebElement ele1, WebElement ele2)
	{
		Actions action = new Actions(driver);
		action.moveToElement(ele1).perform();
		action.moveToElement(ele2).click().perform();
	}
	public static void captureScreenshot(WebDriver driver, String name)
	{
		File file=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("./screenshots/"+name+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void windowHandling(WebDriver driver, WebElement ele)
	{
		Set<String> windows= driver.getWindowHandles();
		for(String window : windows)
		{
			driver.switchTo().window(window);
			try
			{
				ele.isDisplayed();
				
			}catch(Exception e)
			{
				break;
			}
		}
	}
	
	
}
