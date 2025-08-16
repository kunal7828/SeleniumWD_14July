package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import common.BaseSetup;

public class LoginPage {
	
	WebDriver driver;

	
	public LoginPage(WebDriver driver) {  //page me banayege constructor parameterized
		System.out.println("This is constructor block of LoginPage");
		this.driver=driver;  //jese  hi ye banayege test cls me error ayegi test case ke object me driver pass karo
	}

	
	


	
	String userNameLoc="//input[contains(@name,'user')]";
	String passWordLoc="//input[contains(@name,'pass')]";
	String loginButtonLoc="//button[contains(@type,'sub')]";
	

	public void enterUserName(String userNameValue)  //username value runtime par testng class se call karege
	{
		driver.findElement(By.xpath(userNameLoc)).sendKeys(userNameValue);
		Reporter.log("User name entered successfully. "+userNameValue, true);
	
	}
	
	public void enterPassword(String passwordValue) //Password value runtime par testng class se call karege
	{		driver.findElement(By.xpath(passWordLoc)).sendKeys(passwordValue);

	Reporter.log("Password entered successfully. "+passwordValue, true);

	}

	public void clickOnLogin() throws Exception
	{
		driver.findElement(By.xpath(loginButtonLoc)).click();

		Reporter.log("Login clicked successfully ", true);
		Thread.sleep(3000);

		
	}

}
