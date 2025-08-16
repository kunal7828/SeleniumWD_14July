package testNGExamples;

import org.testng.annotations.Test;

import java.io.File;
import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

public class HRMLoginForScreenshotExample {

	WebDriver driver;
	
	@Test(priority=1, description = "loginwithInvalidData")
	public void verifyLoginFunwithInvalidpassword() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("asdfsdf");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sdfsdfsfsf");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test(priority=2, description = "loginwithValidData")
	public void verifyLoginFunwithValidpassword() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	/*
	 * @AfterMethod public void takeScreenshot() throws Exception {
	 * Thread.sleep(3000); //manage synchronization here other wise it will take
	 * blank picture TakesScreenshot takeScreenshot=(TakesScreenshot) driver;
	 * //takesScreenshot object reference variable aur //driver ko typecast kiya
	 * File src= takeScreenshot.getScreenshotAs(OutputType.FILE); File des= new
	 * File("KunalMapTestScreenshot.png"); //destination FileHandler.copy(src, des);
	 * //file handler org openqa selenium io ki use karna hai
	 * 
	 * 
	 * }
	 */
	

	@AfterMethod
	public void takeScreenshot(Method method) throws Exception { //method ka object banayege for printing name with screenshot
		
		System.out.println("Test Case Name------------->"+method.getName());
		Thread.sleep(3000);  //manage synchronization here other wise it will take blank picture
		TakesScreenshot takeScreenshot=(TakesScreenshot) driver; //takesScreenshot object reference variable aur //driver ko typecast kiya
		File src= takeScreenshot.getScreenshotAs(OutputType.FILE);
		File des= new File(method.getName()+".png");  //destination
		FileHandler.copy(src, des); //file handler org openqa selenium io ki use karna hai
		
		
	}
	  @BeforeClass
	  public void beforeClass() throws Exception {
	  driver= new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
		}
	  @AfterClass
	  public void afterClass() {
		  
		  driver.quit();
	  }


}
