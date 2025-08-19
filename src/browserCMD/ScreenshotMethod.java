package browserCMD;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;

public class ScreenshotMethod {
WebDriver driver;
	
	@Test(enabled = true)
	public void takeElementScreenshot() throws Exception {
		
	      WebElement elementLogo = driver.findElement(By.name("q"));

	      File source = elementLogo.getScreenshotAs(OutputType.FILE);
	      
	      File dest = new File("elementLogo.png");
	      FileHandler.copy(source, dest);

	    
	}
	
	
	@Test(enabled = true)
	public void captureSectionScreenshot() throws Exception {
	WebElement elementLogo = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]"));

	      File source = elementLogo.getScreenshotAs(OutputType.FILE);
	      
	      File dest = new File(".\\Screenshot\\captureSectionScreenshot.png");
	  	FileHandler.copy(source, dest);

	   
	}
	
	@Test(enabled = true)
	public void captureFullPageScreenshot() throws IOException {
	     File src = ((ChromeDriver)driver).getScreenshotAs(OutputType.FILE);
	     File des=new File("FullPageScreenshot.png");
	     FileHandler.copy(src,des );
	}

	
	
	
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://google.com/");
	  Thread.sleep(5000);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.close();
  }


}
