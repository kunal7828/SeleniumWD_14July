package common;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseSetup {
	public static WebDriver driver;
	//static keyword directly class name se call ho jate h
 
	
	@BeforeMethod
	public void navigateToHomePage()
	{
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
	}
	
	 @AfterMethod
	  public void afterMethod(Method method) throws Exception {
		  System.out.println("********************Test Case Finished********************"+method.getName());
		  Thread.sleep(3000);
		  TakesScreenshot takesScreenshot =(TakesScreenshot) driver;
		 File src= takesScreenshot.getScreenshotAs(OutputType.FILE);
		 File des=new File(method.getName()+".png");
		 FileHandler.copy(src, des);
		  
	  }

	  @BeforeSuite
	  public void openBrowserWithLogin() throws Exception{
		 driver = new ChromeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(3000);
		 driver.manage().window().maximize();
			/*
			 * driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(
			 * "Admin");
			 * driver.findElement(By.xpath("//input[@placeholder = 'Password']")).sendKeys(
			 * "admin123");
			 * driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
			 * Thread.sleep(3000);
			 * //driver.findElement(By.xpath("//button[@type='submit']")).click();
			 * //Thread.sleep(3000);
			 */	 
		 
		//  LoginPage loginPage= new LoginPage(driver);

		  LoginPage loginPage= new LoginPage();
		 loginPage.enterUserName("Admin");
		  loginPage.enterPassword("admin123");
		  loginPage.clickOnLogin();

		  //validate loginPage
	//	  HomePage homePage=new HomePage(driver); 
		  HomePage homePage=new HomePage(); 
		  homePage.validateDashboard(); 
		  Thread.sleep(3000);

	  }

	  @AfterSuite
	  public void closeBrowserWithLogout() throws Exception {
//		  driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
//		  Thread.sleep(3000);
//		  driver.findElement(By.xpath("//a[text()='Logout']")).click();
//		  HomePage homePage=new HomePage(driver);
		  HomePage homePage=new HomePage();
		  homePage.validateLogOut();
		
		  driver.quit();
		  Thread.sleep(3000);
		  System.out.println("closeBrowserWithLogout");
	  }


}
