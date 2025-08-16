package tests;

import org.testng.annotations.Test;

import common.BaseSetup;
import pages.HomePage;
import pages.LoginPage;

import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.lang.reflect.Method;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

public class LoginTest extends BaseSetup {
	
//	WebDriver driver;

  @Test
  public void verifyLoginFunctionality() throws Exception {
	//  LoginPage loginPage= new LoginPage(driver);  
	  LoginPage loginPage= new LoginPage();  //ab driver ko initialize karne ki need nhi h safe action se page me extend kardiya h base setup driver static 
	  loginPage.enterUserName("Admin");
	  loginPage.enterPassword("admin123");
	  loginPage.clickOnLogin();
	  
	  //validate loginPage
	  //HomePage homePage=new HomePage(driver);
	  HomePage homePage=new HomePage();
	  homePage.validateDashboard();
  }
  
  @AfterMethod
	public void takeScreenshot(Method method) throws Exception { //method ka object banayege for printing name with screenshot
		
		System.out.println("Test Case Name------------->"+method.getName());
		Thread.sleep(3000);  //manage synchronization here other wise it will take blank picture
		TakesScreenshot takeScreenshot=(TakesScreenshot) driver; //takesScreenshot object reference variable aur //driver ko typecast kiya
		File src= takeScreenshot.getScreenshotAs(OutputType.FILE);
		File des= new File(method.getName()+".png");  //destination
		FileHandler.copy(src, des); //file handler org openqa selenium io ki use karna hai
		
		
	}
  
  @BeforeSuite
	public void openBrowser() throws Exception
	{
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
  @AfterSuite
  public void closeBrowser() throws Exception {
		Thread.sleep(3000);

	  driver.quit();
	  
  }

}
