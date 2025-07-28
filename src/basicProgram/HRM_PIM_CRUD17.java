package basicProgram;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class HRM_PIM_CRUD17 {

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

	// ------------------------------------------------------------------------------------------------------------------------------
	// Verify Add User Functionality
	// click on add button
	public void clickOnAddButton() throws Exception {
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		System.out.println("Add Button Clicked Successfully");
		Thread.sleep(3000);
	}

	public void enterLastName(String lastName) throws Exception {
		driver.findElement(By.xpath("//input[@name='lastName' or @placeholder='Last Name']")).sendKeys(lastName);
		System.out.println("First Name Entered Successfully----> " + lastName);
		Thread.sleep(3000);
	}

	public void enterFirstName(String firstName) throws Exception {
		driver.findElement(By.xpath("//input[@name='firstName' or @placeholder='First Name']")).sendKeys(firstName);
		System.out.println("First Name Entered Successfully----> " + firstName);
		Thread.sleep(3000);
	}

	public void clickOnCreateLoginDetails() throws Exception {
		driver.findElement(By.xpath("//p[text()='Create Login Details']//following::span[1]")).click();
		System.out.println("Toogle Button Clicked Successfully");
		Thread.sleep(3000);
	}

	// enter Username1

	public void enterUsername1(String username1) throws Exception {

		// Select all data in this field.
		// element.sendKeys(Keys.CONTROL + "a");
		// element.sendKeys(Keys.DELETE);

		driver.findElement(By.xpath("//label[text()='Username']//following::input[1]")).sendKeys(Keys.CONTROL + "a");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Username']//following::input[1]")).sendKeys(Keys.DELETE);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[text()='Username']//following::input[1]")).sendKeys(username1);
		System.out.println("Username Entered Successfully----> " + username1);
		Thread.sleep(2000);

	}
	// enter enterPassword1

	public void enterPassword1(String password1) throws Exception {

		// Select all data in this field.
		// element.sendKeys(Keys.CONTROL + "a");
		// element.sendKeys(Keys.DELETE);

		driver.findElement(By.xpath("//label[text()='Password']//following::input[1]")).sendKeys(Keys.CONTROL + "a");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Password']//following::input[1]")).sendKeys(Keys.DELETE);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[text()='Password']//following::input[1]")).sendKeys(password1);
		System.out.println("Password Entered Successfully-----> " + password1);
		Thread.sleep(2000);

	}
	// enter enterConfirmPassword

	public void enterConfirmPassword(String password1) throws Exception {

		// Select all data in this field.
		// element.sendKeys(Keys.CONTROL + "a");
		// element.sendKeys(Keys.DELETE);

		driver.findElement(By.xpath("//label[text()='Confirm Password']//following::input[1]"))
				.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Confirm Password']//following::input[1]")).sendKeys(Keys.DELETE);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[text()='Confirm Password']//following::input[1]")).sendKeys(password1);
		System.out.println("Confirm Password Entered Successfully------> " + password1);
		Thread.sleep(2000);

	}
	// click On SaveButton

	public void clickOnSaveButton() throws Exception {
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		System.out.println("Click On Save Button Successfully.");
		Thread.sleep(5000);

	}
	
	
	// Verify Search User Functionality
		// enter user Name
		public void searchUserName(String username1) throws Exception {

			WebElement input = driver.findElement(By.xpath("//label[text()='Username']//following::input[1]"));
			input.sendKeys(username1);

			// driver.findElement(By.xpath("//label[text()='Username']//following::input[1]")).sendKeys(username1);
			System.out.println("Enter Username In Search Field Successfully.----> " + username1);
			Thread.sleep(3000);
		}
	
	// click on search button.
		public void clickOnSearchButton() throws Exception {

			driver.findElement(By.xpath("//button[text()=' Search ']")).click();
			System.out.println("Click On Search Button Successfully.");
			Thread.sleep(3000);

			// Number of record check in the list
			String numberOfRecordGetText = driver.findElement(By.xpath("//button[text()=' Add ']//following::div[2]"))
					.getText();
			System.out.println("Number of records found in the list. -----> " + numberOfRecordGetText);
			Thread.sleep(2000);

			// user name found in record check in the list
			String searchUserNameGetText = driver.findElement(By.xpath("//button[text()=' Add ']//following::div[29]"))
					.getText();
			// Boolean headerFlag = driver.findElement(By.xpath("//h6[text()='" + headerName
			// + "']")).isDisplayed();

			System.out.println("User Name Found in Records -----> " + searchUserNameGetText);
			Thread.sleep(2000);

		}
	
	
	public void closeBrowser() throws Exception {
		Thread.sleep(2000);
		driver.quit();
		
	}

	// -------------------------------------------------------------------------------------------------------------------------------------------------
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String validUsername = "Admin";
		String validPassword = "admin123";
		String firstName = "Kunal";
		String lastName = "Sharma";
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

		// Username
		String username1 = "kunal151";
		String username2 = "kunal152";

		// Password
		String password1 = "Kunal@123";
		String password2 = "Kunal@321";

		HRM_PIM_CRUD17 obj = new HRM_PIM_CRUD17();
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

		obj.clickOnAddButton();
		obj.enterFirstName(firstName);
		obj.enterLastName(lastName);
		obj.clickOnCreateLoginDetails();
		obj.enterUsername1(username1);
		obj.enterPassword1(password1);
		obj.enterConfirmPassword(password1);
		obj.clickOnSaveButton();
		
		obj.searchUserName(username1);
		obj.clickOnSearchButton();
		
		
		obj.closeBrowser();

	}

}
