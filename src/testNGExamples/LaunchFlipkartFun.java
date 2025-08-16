package testNGExamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class LaunchFlipkartFun {
WebDriver driver;
	
	@Test
  public void searchProductFun() throws Exception {
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 15");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);

		
  }
  @BeforeSuite
  public void beforeSuite() throws Exception {
	  driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
  }

  @AfterSuite
  public void afterSuite() {
	  driver.quit();
  }

}
