package basicProgram;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class HRM_Directory_CRUD23 {

	WebDriver driver;

	public void openBrowser(String Url) throws Exception {
		driver = new ChromeDriver();
		driver.get(Url);
		driver.manage().window().maximize();
		Thread.sleep(3000);

		String headerGetText = driver.findElement(By.xpath("//h5[text()='Login']")).getText();
		boolean headerFlag = driver.findElement(By.xpath("//h5[text()='Login']")).isDisplayed();

		System.out.println("Login Page Displayed Successfully. -------> " + headerGetText);
		System.out.println("Login Page Displayed Successfully. -------> " + headerFlag);

	}

	public void enterUserName(String userNameValue) throws Exception {

		driver.findElement(By.xpath("//input[@name='username' and @placeholder='Username']")).sendKeys(userNameValue);
		Thread.sleep(1000);
		System.out.println("Username Entered . -------> " + userNameValue);
	}

	public void enterPassword(String passwordValue) throws Exception {
		driver.findElement(By.xpath("//input[@type='password' or @name='password']")).sendKeys(passwordValue);
		System.out.println("Password Entered Successfully. -------> " + passwordValue);
		Thread.sleep(1000);

	}

	public void clickOnLogin() throws Exception {
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(5000);
		System.out.println("Click On Login Successfully. ");

	}


	public void validateLoginPage() {

		String headerGetText = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
		Boolean headerFlag = driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
		System.out.println("Dashobard Page Displayed Successfully. ------> " + headerGetText);
		System.out.println("Dashobard Page Displayed Successfully. ------>" + headerFlag);
		String currentPageUrl = driver.getCurrentUrl();
		System.out.println("URL: " + currentPageUrl);
		// Get the page title and print it
		String pageTitle = driver.getTitle();
		System.out.println("Page Title: " + pageTitle);

	}

	public void clickOnLeftPanelTab(String tabName) throws Exception {

		driver.findElement(By.xpath("//span[text()='" + tabName + "']")).click();
		Thread.sleep(2000);
		System.out.println(tabName + " tab clicked successfully.");
	}

	public void validatePage(String headerName) {
		String headerGetText = driver.findElement(By.xpath("//h6[text()='" + headerName + "']")).getText();
		Boolean headerFlag = driver.findElement(By.xpath("//h6[text()='" + headerName + "']")).isDisplayed();
		System.out.println(headerName + "Page Displayed Successfully." + headerGetText);
		System.out.println(headerName + " Page Displayed Successfully------>" + headerFlag);
	}

	public void takeScreenshotMethod(String screenshotName) throws Exception {
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;

		File src = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File des = new File(screenshotName + ".png");
		FileHandler.copy(src, des);

	}

	public void takeScreenshotOfWebElement(String screenshotName) throws Exception {
		WebElement username = driver.findElement(By.xpath("//input[@name='username' and @placeholder='Username']"));

		File src = username.getScreenshotAs(OutputType.FILE);
		File des = new File(screenshotName + ".png");
		FileHandler.copy(src, des);

	}

	
	public void closeBrowser() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
	
	
	public void clickOnMaintenance(String passwordValue) throws Exception {

		driver.findElement(By.xpath("//span[text()='Maintenance']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password' and @name='password']")).sendKeys(passwordValue);
		driver.findElement(By.xpath("//button[text()=' Confirm ' and @type='submit']")).click();
		Thread.sleep(3000);

	}
	
	
	public void validateMaintenancePage()
	{
		String Text1 = driver.findElement(By.xpath("//h6[text()='Maintenance']")).getText();
		Boolean Header1 = driver.findElement(By.xpath("//h6[text()='Maintenance']")).isDisplayed();
		System.out.println("Maintenance Page Displayed Successfully. " + Text1);
		System.out.println("Maintenance Page Displayed Successfully------> " + Header1);

	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------------		
	//Verify Add User Functionality
	

	
	
	
	
	
	
	
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String validUsername = "Admin";
		String validPassword = "admin123";
	//	String invalidUserName = "Kunal";
	//	String invalidPassword = "Sharma";
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

		HRM_Directory_CRUD23 obj = new HRM_Directory_CRUD23();
		obj.openBrowser(url);
		// obj.enterUserName(invalidUserName);
		// obj.enterPassword(invalidPassword);
		// obj.clickOnLogin();
		// obj.errorMsgValidate();
		// obj.hitURL(url);

		obj.enterUserName(validUsername);
		obj.enterPassword(validPassword);
		obj.takeScreenshotOfWebElement("usernameWebElement");
		obj.clickOnLogin();
		
		  obj.validateLoginPage(); 
		  
		  
		  obj.clickOnLeftPanelTab("PIM"); 
		  obj.validatePage("PIM"); 
		  obj.takeScreenshotMethod("PIM");
		  
		  obj.clickOnLeftPanelTab("Leave"); 
		  obj.validatePage("Leave"); 
		  obj.takeScreenshotMethod("Leave");
		  
		  obj.clickOnLeftPanelTab("Time"); 
		  obj.validatePage("Time"); 
		  obj.takeScreenshotMethod("Time");
		  
		  obj.clickOnLeftPanelTab("Recruitment"); 
		  obj.validatePage("Recruitment"); 
		  obj.takeScreenshotMethod("Recruitment");
		 
		  obj.clickOnLeftPanelTab("My Info"); 
		  obj.validatePage("PIM"); 
		  obj.takeScreenshotMethod("My Info");
		  
		  obj.clickOnLeftPanelTab("Performance"); 
		  obj.validatePage("Performance"); 
		  obj.takeScreenshotMethod("Performance");
		  
		  
		  obj.clickOnLeftPanelTab("Directory"); 
		  obj.validatePage("Directory"); 
		  obj.takeScreenshotMethod("Directory");
		  
		  
	//doubt for maintainace our single method not work for this.	  
	//	  obj.clickOnLeftPanelTab("Maintenance"); 
    	  obj.clickOnMaintenance(validPassword);
		  obj.validateMaintenancePage();		  
		  obj.takeScreenshotMethod("Maintenance");
		  
		  obj.clickOnLeftPanelTab("Claim"); 
		  obj.validatePage("Claim"); 
		  obj.takeScreenshotMethod("Claim");
		  
		  obj.clickOnLeftPanelTab("Buzz"); 
		  obj.validatePage("Buzz"); 
		  obj.takeScreenshotMethod("Buzz");
		 
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		 
		obj.closeBrowser();

	}

}
