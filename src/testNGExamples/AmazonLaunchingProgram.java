package testNGExamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class AmazonLaunchingProgram {
	WebDriver driver;
	
  @Test(priority=1 , description="verify search home appliances functionality")
  public void searchFunctionality() throws Exception {
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Home Appliances");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  Thread.sleep(3000);
  }
  @BeforeSuite
  public void beforeSuite() throws Exception {
	driver= new ChromeDriver();
	driver.get("https://www.amazon.in/ref=nav_logo");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	  
  }

  @AfterSuite
  public void afterSuite() {
	  
	  driver.quit();
  }

}
