package testNGExamples;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class HRMLoginDataProvider2 {

	WebDriver driver;
	
	@Test(priority=1, dataProvider = "loginData")
	public void verifyLoginFunwithInvalidpassword(String username, String password) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
@DataProvider
public Object[][] loginData(){
	return new Object[][] {
		{"Admin","dfsfsf32"},
		{"Admin12","admin123"},
		{"Admsds","AdJWKJWJWKJ"},
		{"Admin","admin123"},
		};
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
