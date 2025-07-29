package testNGExamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class AdminTest22 {
	WebDriver driver;
	
	
  @Test(priority = 1)
  public void verifyAddUserFun() {
	  System.out.println("verifyAddUserFun");
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
  public void openBrowserWithLogin() {
	  System.out.println("openBrowserWithLogin");
	 
  }

  @AfterClass
  public void closeBrowserWithLogout() {
	  System.out.println("closeBrowserWithLogout");
  }

}
