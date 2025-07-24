package basicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLoginUsingMethodUsingXpath13 {
	
	WebDriver driver;
	
	public void openBrowser(String url) throws Exception {
		
	driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	Thread.sleep(3000);	
	}
	
	//Navigation cmd1
	//what is the difference between get url and navigate to?
	public void hitUrl(String Url) throws Exception {
		driver.navigate().to(Url);
		Thread.sleep(2000);
	}
	
	//Navigation cmd2
	public void backCMD() throws Exception {
		driver.navigate().back();
		Thread.sleep(2000);
	}
	
	//Navigation cmd2
	public void forwardCMD() throws Exception   {
		driver.navigate().forward();
		Thread.sleep(2000);
	}
	
	//Navigation cmd2
		public void refreshCMD() throws Exception {
			driver.navigate().forward();
			Thread.sleep(2000);
		}
		
		public void enterUsername(String userNameValue) throws Exception {
			driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys(userNameValue);
			Thread.sleep(2000);
		}
		
		public void enterPassword(String passwordValue) throws Exception {
			driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys(passwordValue);
			
			Thread.sleep(2000);
		}
		
		public void clickOnLoginButton() throws Exception {
			//now click on login button
			driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
			Thread.sleep(2000);

		}
		
		public void closeBrowser() throws Exception {
			Thread.sleep(2000);
			driver.quit();	
		}
	
	
	
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FBLoginUsingMethodUsingXpath13 obj =new FBLoginUsingMethodUsingXpath13();
		obj.openBrowser("https://www.facebook.com/login/");
		obj.enterUsername("kunal1");
		obj.enterPassword("Kunal@123");
		obj.clickOnLoginButton();

		obj.hitUrl("https://www.facebook.com/login/");
		obj.enterUsername("Abhishek1");
		obj.enterPassword("Kunal@123"); 
		obj.clickOnLoginButton();
		
		obj.backCMD();
		obj.hitUrl("https://www.facebook.com/login/");

		obj.forwardCMD();
		obj.refreshCMD();
		
		
		obj.closeBrowser();
		

	}

}
