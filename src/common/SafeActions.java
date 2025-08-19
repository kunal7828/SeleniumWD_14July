package common;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class SafeActions extends Sync {
	
	WebDriver driver;
	
	
	  public SafeActions() { 
	  this.driver=BaseSetup.driver; 
	  }
	 
	
	/*	 
	  public SafeActions(WebDriver driver) { 
	 
	 System.out.println("This is a constructor block of Safe Actions");
	  //static keyword directly class name se call ho jate h
	//  this.driver=driver;
	  //now we can write like this
	  
	 
	 this.driver=BaseSetup.driver;
	  }
	 */
	
	
	
	public void safeClick(String locator)
	{
		driver.findElement(By.xpath(locator)).click();
	}
	
	
	public void safeType(String locator, String value)
	{
		driver.findElement(By.xpath(locator)).sendKeys(value);
	}

	

	
	public boolean safeIsDisplayed(String locator) {
		
		return driver.findElement(By.xpath(locator)).isDisplayed();
		

	} 	

	
	public void safeGetText(String locator) {
		
		String flag = driver.findElement(By.xpath(locator)).getText();
		Reporter.log("Text visible successfully-->" + flag, true);
	}
	
	
	
	public void safeTakeScreenshot(String screenshotName) throws Exception
	{
		TakesScreenshot takesScreenshot=(TakesScreenshot) driver;
	    File src=	takesScreenshot.getScreenshotAs(OutputType.FILE);
	    File des=new File(screenshotName+".png");
	    FileHandler.copy(src, des);
	}
	
	public void safeSelectDropDownByIndex(String locator, int indexNumber)
	{
		new Select(driver.findElement(By.xpath(locator))).selectByIndex(indexNumber);
	}
	
	public void safeSelectDropDownByVisibleText(String locator, String visibleTextValue)
	{
		new Select(driver.findElement(By.xpath(locator))).selectByVisibleText(visibleTextValue);
	}
}
