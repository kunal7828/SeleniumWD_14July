package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class SafeActions {
	
	WebDriver driver;
	
	public SafeActions(WebDriver driver) {
		// TODO Auto-generated constructor stub
		System.out.println("This is a constructor block of Safe Actions");
		//static keyword directly class name se call ho jate h 
	//	this.driver=driver;  //now we can write like this

		this.driver=BaseSetup.driver;
	}
	
	

	public void safeClick(String locator) {
		driver.findElement(By.xpath(locator)).click();
	}
	
	public void safeType(String locator, String value) {
		driver.findElement(By.xpath(locator)).sendKeys(value);
	}
	
	public boolean safeIsDisplayed(String locator) {
	
		return driver.findElement(By.xpath(locator)).isDisplayed();
		

	} 	

	
	public void safeGetText(String locator) {
		
		String flag = driver.findElement(By.xpath(locator)).getText();
		Reporter.log("Text visible successfully-->" + flag, true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
