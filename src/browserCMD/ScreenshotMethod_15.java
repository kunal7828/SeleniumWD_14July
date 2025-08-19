package browserCMD;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotMethod_15 {
	
	WebDriver driver;

	public void openBrowser(String Url) throws Exception {
		driver = new ChromeDriver();
		driver.get(Url);
		driver.manage().window().maximize();
		Thread.sleep(3000);

		String headerGetText = driver.findElement(By.xpath("//h5[text()='Login']")).getText();
		boolean headerFlag = driver.findElement(By.xpath("//h5[text()='Login']")).isDisplayed();

		System.out.println("Login Page Displayed Successfully-------> " + headerGetText);
		System.out.println("Login Page Displayed Successfully-------> " + headerFlag);

	}
	
	public void takeScreenshotMethod(String screenshotName) throws Exception
	{
		TakesScreenshot takesScreenshot=(TakesScreenshot) driver;		
		File src= takesScreenshot.getScreenshotAs(OutputType.FILE);
		File des=new File(screenshotName+".png");
		FileHandler.copy(src, des);
		
	}
	
	
	public void takeScreenshotOfWebElement(String screenshotName) throws Exception
	{
		WebElement username=driver.findElement(By.xpath("//input[@name='username' and @placeholder='Username']"));
		File src= username.getScreenshotAs(OutputType.FILE);
		File des=new File(screenshotName+".png");
		FileHandler.copy(src, des);
		
	}
	

}
