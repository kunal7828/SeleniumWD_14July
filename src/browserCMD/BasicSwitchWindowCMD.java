package browserCMD;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class BasicSwitchWindowCMD {
  @Test
  public void demo() throws Exception {
	  
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  Thread.sleep(5000);
/*	  driver.findElement(By.id("email")).sendKeys("MAP Quality Solutions");
	  Thread.sleep(5000);
	  
	  
	 String fbWindowName= driver.getWindowHandle();
	 System.out.println("fbWindowName------>"+fbWindowName);
	  
	  driver.switchTo().newWindow(WindowType.TAB);
	  
	  driver.navigate().to("https://www.google.com/");
	  Thread.sleep(5000);
	  driver.findElement(By.name("q")).sendKeys("Testing selenium vfhkfj gfhjkkl");
	  
	  Thread.sleep(5000);
	 String googleWindowName= driver.getWindowHandle();
	  

	  Thread.sleep(5000);
	  
	//  driver.quit();
	//  driver.close();
	//  Thread.sleep(5000);
	  
	  driver.switchTo().window(fbWindowName);
	  Thread.sleep(5000);
	  driver.findElement(By.id("pass")).sendKeys("Password123");
	  Thread.sleep(5000);
	  driver.findElement(By.name("login")).click();
	  Thread.sleep(5000);
	  
      driver.switchTo().window(googleWindowName);
	  Thread.sleep(5000);
	  
	  driver.findElement(By.name("btnK")).click();*/
	  
	//  driver.switchTo().frame(0);
	  
	  JavascriptExecutor javascriptExecutor=(JavascriptExecutor) driver;
	  javascriptExecutor.executeScript("window.open('https://workspace.google.com/intl/en-US/gmail/')");
	  
	  
  }
 

}
