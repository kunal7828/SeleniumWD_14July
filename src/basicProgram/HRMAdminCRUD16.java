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

import browserCMD.webElementExample;

public class HRMAdminCRUD16 {

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

	public void validateLoginPage() throws Exception {

		String headerGetText = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
		Thread.sleep(1000);

		Boolean headerFlag = driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
		Thread.sleep(1000);

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

	public void validatePage(String headerName) throws Exception {
		String headerGetText = driver.findElement(By.xpath("//h6[text()='" + headerName + "']")).getText();
		Thread.sleep(1000);

		Boolean headerFlag = driver.findElement(By.xpath("//h6[text()='" + headerName + "']")).isDisplayed();
		Thread.sleep(1000);

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

	// select user role from drop down
	public void selectUserRoleDD(String userRole) throws Exception {
		driver.findElement(By.xpath("//label[text()='User Role']//following::div[1]")).click();
		System.out.println("Clicked On Select User Role Dropdown");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[text()='User Role']//following::span[text()='" + userRole + "']")).click();
//		driver.findElement(By.xpath("//label[text()='User Role']//following::span[text()='ESS']")).click();

		System.out.println(userRole + "User Role Selected Successfully From Dropdown------> " + userRole);
		Thread.sleep(2000);
	}

	// select Status from drop down
	public void selectStatusDD(String status) throws Exception {

		driver.findElement(By.xpath("//label[text()='Status']//following::div[1]")).click();
		System.out.println("Clicked On Status Dropdown");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[text()='Status']//following::span[text()='" + status + "']")).click();
		// driver.findElement(By.xpath("//label[text()='Status']//following::span[text()='Disabled']")).click();
		System.out.println("Status Selected Successfully From Dropdown----> " + status);
		Thread.sleep(2000);
	}

	// click on employee Name and select employee name from list.
	public void selectEmployeeName(String employeeName1) throws Exception {

		// Select all data in this field.
		// element.sendKeys(Keys.CONTROL + "a");
		// element.sendKeys(Keys.DELETE);

		driver.findElement(By.xpath("//label[text()='Employee Name']//following::input[1]"))
				.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Employee Name']//following::input[1]")).sendKeys(Keys.DELETE);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[text()='Employee Name']//following::input[1]")).sendKeys(employeeName1);
		System.out.println("Type Employee Name ----> " + employeeName1);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[text()='Employee Name']//following::span[1]")).click();
		System.out.println("Employee Name Selected Successfully From List");
		Thread.sleep(2000);

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

	// ------------------------------------------------------------------------------------------------------------------------------
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

	// Verify Update User Functionality
	// click on edit icon

	public void clickOnEditIcon() throws Exception {

		driver.findElement(By.xpath("//div[text()='Actions']//following::button[2]")).click();
		System.out.println("Edit icon clicked Successfully.");
		Thread.sleep(4000);

	}

	public void clickOnCheckBox() throws Exception {

		driver.findElement(By.xpath("//label[text()='Username']//following::i[1]")).click();
		System.out.println("CheckBox icon clicked Successfully.");
		Thread.sleep(2000);

	}

	// Verify Delete User Functionality
	// click on delete icon

	public void clickOnDeleteIcon() throws Exception {

		driver.findElement(By.xpath("//div[text()='Actions']//following::button[1]")).click();
		System.out.println("Delete icon clicked Successfully");
		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[text()=' Yes, Delete ']")).click();
		System.out.println("clicked on yes button.");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//p[text()='Successfully Deleted']")).getText();
		Boolean userDeletedSuccessMsg = driver.findElement(By.xpath("//p[text()='Successfully Deleted']"))
				.isDisplayed();

		System.out.println("User is deleted Successfully--------------->" + userDeletedSuccessMsg);

		Boolean noRecordsFoundMsg = driver.findElement(By.xpath("//p[text()='Successfully Deleted']")).isDisplayed();
		System.out.println("User is deleted Successfully--------------->" + noRecordsFoundMsg);
		Thread.sleep(3000);

	}

	public void verifyLogoutFunction() throws Exception {

		driver.findElement(By.xpath("//img[@alt='profile picture']")).click();
		System.out.println("Clicked on profile icon");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//img[@alt='profile picture']//following::a[4]")).click();
		System.out.println("Clicked on logout link.");
		Thread.sleep(5000);

		String LoginPage = driver.findElement(By.xpath("//h5[text()='Login']")).getText();
		boolean VerifyLogout = driver.findElement(By.xpath("//h5[text()='Login']")).isDisplayed();
		System.out.println("Login Page Displayed-------------->" + VerifyLogout);

	}

//close browser	
	public void closeBrowser() throws Exception {

		driver.quit();
		System.out.println("Browser Closed successfully.");

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String validUsername = "Admin";
		String validPassword = "admin123";

		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

		// Username
		String username1 = "kunal144";
		String username2 = "kunal145";

		// Password
		String password1 = "Kunal@123";
		String password2 = "Kunal@321";

		// Employee Name --- a or b
		String employeeName1 = "a";
		String employeeName2 = "b";

		// Select UserRole --- Admin ESS
		String userRole1 = "Admin";
		String userRole2 = "ESS";

		// Select Status --- Enabled Disabled
		String status1 = "Enabled";
		String status2 = "Disabled";

		HRMAdminCRUD16 obj = new HRMAdminCRUD16();
		obj.openBrowser(url);

		obj.enterUserName(validUsername);
		obj.enterPassword(validPassword);
		obj.takeScreenshotOfWebElement("usernameWebElement");
		obj.clickOnLogin();

		obj.validateLoginPage();

		obj.clickOnLeftPanelTab("Admin");
		obj.validatePage("Admin");
		obj.takeScreenshotMethod("Admin");

		// /*
		// Add Operation - New user created Here
		obj.clickOnAddButton();
		obj.selectUserRoleDD(userRole1);
		obj.selectStatusDD(status1);
		obj.selectEmployeeName(employeeName1);
		obj.enterUsername1(username1);
		obj.enterPassword1(password1);
		obj.enterConfirmPassword(password1);
		obj.clickOnSaveButton();
		// */
		// Search operation - user name 1 search here
		obj.searchUserName(username1);
		obj.clickOnSearchButton();

		// Update Operation - user name 1 edit and update here
		// method code usability applied here used select user and status update method
		// here.
		obj.clickOnEditIcon();
		obj.selectUserRoleDD(userRole2);
		obj.selectStatusDD(status2);
		obj.selectEmployeeName(employeeName2);
		obj.clickOnCheckBox();
		obj.enterUsername1(username2);
		obj.enterPassword1(password2);
		obj.enterConfirmPassword(password2);
		obj.clickOnSaveButton();

		// Delete Operation --- Now Search user Name 2 and delete User
		obj.searchUserName(username2);
		obj.clickOnSearchButton();
		obj.clickOnDeleteIcon();

		obj.verifyLogoutFunction();
		obj.closeBrowser();

	}

}
