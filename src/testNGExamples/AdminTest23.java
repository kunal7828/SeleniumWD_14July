package testNGExamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class AdminTest23 {
	WebDriver driver;
	
	
  @Test(priority = 1)
  public void verifyAddUserFun() throws Exception {
	  System.out.println("verifyAddUserFun");
	  
	  driver.findElement(By.xpath("//input[@name='username' and @placeholder='Username']")).sendKeys();
		Thread.sleep(1000);
		System.out.println("Username Entered . -------> " );
  }
  
  @Test(priority = 2)
  public void verifySearchUserFun() {
	  System.out.println("verifySearchUserFun");
  }
  
  @Test(priority = 3)
  public void verifyUpdateUserFun() {
	  System.out.println("verifyUpdateUserFun");
  }
  
  @Test(priority = 4)
  public void verifyDeleteUserFun() {
	  System.out.println("verifyDeleteUserFun");
  }
  @BeforeMethod
  public void beforeMethod(Method method) {
	  System.out.println("***********************Test Case Statrted********************"+ method.getName());
  }

  @AfterMethod
  public void afterMethod(Method method) {
	  System.out.println("********************Test Case Finished********************"+method.getName());
  }

  @BeforeClass
  public void openBrowserWithLogin() throws Exception {
	  
	  String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	  System.out.println("openBrowserWithLogin");
	  
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);

		String headerGetText = driver.findElement(By.xpath("//h5[text()='Login']")).getText();
		boolean headerFlag = driver.findElement(By.xpath("//h5[text()='Login']")).isDisplayed();

		System.out.println("Login Page Displayed Successfully. -------> " + headerGetText);
		System.out.println("Login Page Displayed Successfully. -------> " + headerFlag);
	 
  }

  @AfterClass
  public void closeBrowserWithLogout() {
	  System.out.println("closeBrowserWithLogout");
  }

}
