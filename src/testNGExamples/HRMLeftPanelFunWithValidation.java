package testNGExamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class HRMLeftPanelFunWithValidation {
	
	WebDriver driver;
	 @Test(priority=1)
	  public void verifyAdminPageVisibility() throws Exception {
		 driver.findElement(By.xpath("//span[text()='Admin']")).click();
		 Reporter.log("Admin clicked successfully.", true);
		 Thread.sleep(5000);
		 
		 boolean flag=driver.findElement(By.xpath("//h6[text()='Admin']")).isDisplayed();
		 Reporter.log("Admin page visible Successfully--->"+flag,true);
		 Thread.sleep(5000);
		 Assert.assertEquals(flag, true);
	  }
	 @Test(priority=2)
	  public void verifyPIMPageVisibility() throws Exception {
		 driver.findElement(By.xpath("//span[text()='PIM']")).click();
		 Reporter.log("PIM clicked successfully.", true);
		 Thread.sleep(5000);
		 
		 boolean flag=driver.findElement(By.xpath("//h6[text()='PIM']")).isDisplayed();
		 Reporter.log("PIM page visible Successfully--->"+flag,true);
		 Thread.sleep(5000);
		 Assert.assertEquals(flag, true);
	  }
	 

	 @Test(priority=3)
	  public void verifyLeavePageVisibility()throws Exception {
		 driver.findElement(By.xpath("//span[text()='Leave']")).click();
		 Reporter.log("Leave clicked successfully.", true);
		 Thread.sleep(5000);
		 
		 boolean flag=driver.findElement(By.xpath("//h6[text()='Leave']")).isDisplayed();
		 Reporter.log("Leave page visible Successfully--->"+flag,true);
		 Thread.sleep(5000);
		 Assert.assertEquals(flag, true);
		  
	  }
	 

	 @Test(priority=4)
	  public void verifyTimePageVisibility() throws Exception{
		 driver.findElement(By.xpath("//span[text()='Time']")).click();
		 Reporter.log("Time clicked successfully.", true);
		 Thread.sleep(5000);
		 
		 boolean flag=driver.findElement(By.xpath("//h6[text()='Time']")).isDisplayed();
		 Reporter.log("Time page visible Successfully--->"+flag,true);
		 Thread.sleep(5000);
		 Assert.assertEquals(flag, true);
		  
	  }
	 @Test(priority=5)
	  public void verifyRecruitmentPageVisibility()throws Exception {
		 driver.findElement(By.xpath("//span[text()='Recruitment']")).click();
		 Reporter.log("Recruitment clicked successfully.", true);
		 Thread.sleep(5000);
		 
		 boolean flag=driver.findElement(By.xpath("//h6[text()='Recruitment']")).isDisplayed();
		 Reporter.log("Recruitment page visible Successfully--->"+flag,true);
		 Thread.sleep(5000);
		 Assert.assertEquals(flag, true);
		  
	  }
	 
	 @Test(priority=6)
	  public void verifyMyInfoPageVisibility() throws Exception{
		 driver.findElement(By.xpath("//span[text()='My Info']")).click();
		 Reporter.log("My Info clicked successfully.", true);
		 Thread.sleep(5000);
		 
		 boolean flag=driver.findElement(By.xpath("//h6[text()='PIM']")).isDisplayed();
		 Reporter.log("PIM page visible Successfully--->"+flag,true);
		 Thread.sleep(5000);
		 Assert.assertEquals(flag, true);
		  
	  }
	 
	 @Test(priority=7)
	  public void verifyPerformancePageVisibility()throws Exception {
		 driver.findElement(By.xpath("//span[text()='Performance']")).click();
		 Reporter.log("Performance clicked successfully.", true);
		 Thread.sleep(5000);
		 
		 boolean flag=driver.findElement(By.xpath("//h6[text()='Performance']")).isDisplayed();
		 Reporter.log("Performance page visible Successfully--->"+flag,true);
		 Thread.sleep(5000);
		 Assert.assertEquals(flag, true);
		  
	  }
	 
	 @Test(priority=8)
	  public void verifyDashboardPageVisibility()throws Exception {
		 driver.findElement(By.xpath("//span[text()='Dashboard']")).click();
		 Reporter.log("Dashboard clicked successfully.", true);
		 Thread.sleep(5000);
		 
		 boolean flag=driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
		 Reporter.log("Dashboard page visible Successfully--->"+flag,true);
		 Thread.sleep(5000);
		 Assert.assertEquals(flag, true);
		  
	  }
	 
	 @Test(priority=9)
	  public void verifyDirectoryPageVisibility()throws Exception {
		 driver.findElement(By.xpath("//span[text()='Directory']")).click();
		 Reporter.log("Directory clicked successfully.", true);
		 Thread.sleep(5000);
		 
		 boolean flag=driver.findElement(By.xpath("//h6[text()='Directory']")).isDisplayed();
		 Reporter.log("Directory page visible Successfully--->"+flag,true);
		 Thread.sleep(5000);
		 Assert.assertEquals(flag, true);
		  
	  }
	 
	 @Test(priority=10)
	  public void verifyMaintenancePageVisibility()throws Exception {
		 driver.findElement(By.xpath("//span[text()='Maintenance']")).click();
		 Reporter.log("Maintenance clicked successfully.", true);
		 Thread.sleep(5000);
		 
		 
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		 Reporter.log("enter password  successfully.", true);
		 Thread.sleep(5000);
		 
		 driver.findElement(By.xpath("//button[text()=' Confirm ']")).click();
		 Reporter.log("confirm clicked successfully.", true);
		 Thread.sleep(5000);
		 
		 
		/* driver.navigate().back();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//button[text()=' Cancel ']")).click();
		 Reporter.log("cancel button clicked successfully.", true);
		 Thread.sleep(5000);*/ 
		 
		 
		 boolean flag=driver.findElement(By.xpath("//h6[text()='Maintenance']")).isDisplayed();
		 Reporter.log("Maintenance page visible Successfully--->"+flag,true);
		 Thread.sleep(5000);
		 Assert.assertEquals(flag, true);
	  
		  
	 }
	 
	 @Test(priority=11)
	  public void verifyClaimPageVisibility()throws Exception {
		 driver.findElement(By.xpath("//span[text()='Claim']")).click();
		 Reporter.log("Claim clicked successfully.", true);
		 Thread.sleep(5000);
		 
		 boolean flag=driver.findElement(By.xpath("//h6[text()='Claim']")).isDisplayed();
		 Reporter.log("Claim page visible Successfully--->"+flag,true);
		 Thread.sleep(5000);
		 Assert.assertEquals(flag, true);
	  
		  
	  }
	 
	 @Test(priority=12)
	  public void verifyBuzzPageVisibility() throws Exception {
		 driver.findElement(By.xpath("//span[text()='Buzz']")).click();
		 Reporter.log("Buzz clicked successfully.", true);
		 Thread.sleep(5000);
		 
		 boolean flag=driver.findElement(By.xpath("//h6[text()='Buzz']")).isDisplayed();
		 Reporter.log("Buzz page visible Successfully--->"+flag,true);
		 Thread.sleep(5000);
		 Assert.assertEquals(flag, true);
	  
		  
	  }

	 
  @BeforeClass
  public void openBrowserWithLogin() throws Exception {
	  driver=new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/buzz/viewBuzz");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  Reporter.log("open Browser successfully." ,true);
	  
	  
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	  Thread.sleep(3000);
	  Reporter.log("Enter user name successfully.",true);
	  
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	  Thread.sleep(3000);
	  Reporter.log("Enter Password successfully.",true);
	  
	  driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	  Thread.sleep(3000);
	  Reporter.log("clicked on Login successfully.",true);
	 
  }

  @AfterClass
  public void CloseBrowserWithLogOut() throws Exception {
	  
	  driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
	  driver.findElement(By.xpath("//a[text()='Logout']")).click();
	  Reporter.log("browser logout successfully.",true);
	  Thread.sleep(5000);
	  
	  driver.quit();
	  
  }

}
