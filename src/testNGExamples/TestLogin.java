package testNGExamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class TestLogin {
  WebDriver driver;
	
	@Test
  public void verifyLoginFunctionality() throws Exception {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Kunal");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("sharma");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);


  }
  @BeforeSuite
  public void beforeSuite() throws Exception {
	  driver= new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
  }

  @AfterSuite
  public void afterSuite() {
	  
	  driver.quit();
  }

}
