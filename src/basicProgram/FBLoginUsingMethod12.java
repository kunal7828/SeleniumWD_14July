package basicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLoginUsingMethod12 {
	
	WebDriver driver;
	
	public void openBrowser(String url) throws Exception {
		
	driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	Thread.sleep(3000);
		
	}
	
	//Navigation cmd1
	//what is the difference between get url and navigate to?
	public void hitUrl() throws Exception {
		driver.navigate().to("https://www.facebook.com/");
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
			
			driver.findElement(By.id("email")).sendKeys(userNameValue);
			Thread.sleep(2000);

			
			
		}
		
		public void enterPassword(String passwordValue) throws Exception {
			
			driver.findElement(By.name("pass")).sendKeys(passwordValue);
			Thread.sleep(2000);
		}
		
		public void clickOnLoginButton() {
			//now click on login button
			driver.findElement(By.tagName("button")).click();
			
		}
		
		
		public void clearEmailPassword() throws Exception {
			
			driver.findElement(By.id("email")).clear();
			Thread.sleep(1000);
			driver.findElement(By.name("pass")).clear();
			Thread.sleep(1000);
			
		}
		
		
		public void closeBrowser() throws Exception {
			Thread.sleep(1000);
			driver.quit();
			
		}
	
	
	
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FBLoginUsingMethod12 obj =new FBLoginUsingMethod12();
		obj.openBrowser("https://www.facebook.com/");
		obj.enterUsername("kunal1@mailinator.com");
		obj.enterPassword("Kunal@123");
		obj.clickOnLoginButton();
	//	obj.clearEmailPassword();
	
		obj.backCMD();
		obj.forwardCMD();
		obj.refreshCMD();
		obj.hitUrl();
		obj.enterUsername("Abhishek1@mailinator.com");
		obj.enterPassword("Kunal@123");
		obj.clickOnLoginButton();
		obj.closeBrowser();
		

	}

}
