package testNGExamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestNG1stProgram21 {
	WebDriver driver;
  @Test
  public void verifyLoginFunWithValidData() throws Exception {
	  System.out.println("verifyLoginFunWithValidData");
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  Thread.sleep(3000);
	//  driver.findElement(By.xpath("")).isDisplayed()
  }
  
  
  @Test
  public void verifyLoginFunWithInvalidData() throws Exception {
	  System.out.println("verifyLoginFunWithInvalidData");
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("MAP");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("MAp1234");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  Thread.sleep(3000);
	
	 // Assert.fail();
  }
  @BeforeClass
  public void openBrowser() throws Exception {
	  System.out.println("openBrowser");
	  driver=new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
  }

  @AfterClass
  public void closeBrowser() {
	  System.out.println("closeBrowser");
	  driver.quit();
  }

}
