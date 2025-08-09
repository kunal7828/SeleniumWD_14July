package testNGExamples;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class HRMLoginDataProvider {

	WebDriver driver;
	
	@Test(priority=1)
	public void verifyLoginFunwithInvalidpassword() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test(priority=2)
	public void verifyLoginFunwithInvaliUsername() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin123");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	
	@Test(priority=3)
	public void verifyLoginFunwithInvaliUsernameInvalidPassowrd() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin321");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin321");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	
	@Test(priority=4)
	    public void verifyLoginFun() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

@AfterMethod
public void refreshPage() throws Exception {
	Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(3000);

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
