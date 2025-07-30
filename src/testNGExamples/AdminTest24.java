package testNGExamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class AdminTest24 {
	WebDriver driver;

	String validUsername = "Admin";
	String validPassword = "admin123";

	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

	// Username
	String username1 = "kunal175";
	String username2 = "kunal176";

	// Password
	String password1 = "Kunal@123";
	String password2 = "Kunal@321";

	// Employee Name --- a or b
	String employeeName1 = "a";
	String employeeName2 = "b";

	// Select UserRole --- Admin / ESS
	String userRole1 = "Admin";
	String userRole2 = "ESS";

	// Select Status --- Enabled / Disabled
	String status1 = "Enabled";
	String status2 = "Disabled";

	// locator left panel
	String tabName1 = "Admin";
	String headerName1 = "Admin";

	@BeforeMethod
	public void beforeMethod(Method method) {
		Reporter.log("*************Test Case Started**********" + method.getName());
		// System.out.println("*************Test Case Started**********"+ method.getName());
	}

	@Test(priority = 1, enabled = true)
	public void verifyAddUserFun() throws Exception {
		System.out.println("verifyAddUserFun");

		// public void clickOnLeftPanelTab(String tabName) throws Exception {

		driver.findElement(By.xpath("//span[text()='" + tabName1 + "']")).click();
		Thread.sleep(2000);
		System.out.println(tabName1 + " tab clicked successfully.");
		// }

		// public void validatePage(String headerName) throws Exception {
		String headerGetText = driver.findElement(By.xpath("//h6[text()='" + headerName1 + "']")).getText();
		Thread.sleep(1000);

		Boolean headerFlag = driver.findElement(By.xpath("//h6[text()='" + headerName1 + "']")).isDisplayed();
		Thread.sleep(1000);

		System.out.println(headerName1 + "Page Displayed Successfully." + headerGetText);
		System.out.println(headerName1 + " Page Displayed Successfully------>" + headerFlag);
		// }

		// ------------------------------------------------------------------------------------------------------------------------------
		// Verify Add User Functionality
		// click on add button
//			public void clickOnAddButton() throws Exception {
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		System.out.println("Add Button Clicked Successfully");
		Thread.sleep(3000);
		// }

		// select user role from drop down
		// public void selectUserRoleDD(String userRole) throws Exception {
		driver.findElement(By.xpath("//label[text()='User Role']//following::div[1]")).click();
		System.out.println("Clicked On Select User Role Dropdown");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[text()='User Role']//following::span[text()='" + userRole1 + "']"))
				.click();
//				driver.findElement(By.xpath("//label[text()='User Role']//following::span[text()='ESS']")).click();

		System.out.println(userRole1 + "User Role Selected Successfully From Dropdown------> " + userRole1);
		Thread.sleep(2000);
		// }

		// select Status from drop down
		// public void selectStatusDD(String status) throws Exception {

		driver.findElement(By.xpath("//label[text()='Status']//following::div[1]")).click();
		System.out.println("Clicked On Status Dropdown");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[text()='Status']//following::span[text()='" + status1 + "']")).click();
		// driver.findElement(By.xpath("//label[text()='Status']//following::span[text()='Disabled']")).click();
		System.out.println(status1 + "Status Selected Successfully From Dropdown----> " + status1);
		Thread.sleep(2000);
		// }

		// click on employee Name and select employee name from list.
		// public void selectEmployeeName(String employeeName1) throws Exception {

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

		// }
		// enter Username1

		// public void enterUsername1(String username1) throws Exception {

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

		// }
		// enter enterPassword1

		// public void enterPassword1(String password1) throws Exception {

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

		// }
		// enter enterConfirmPassword

		// public void enterConfirmPassword(String password1) throws Exception {

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

		// }
		// click On SaveButton

		// public void clickOnSaveButton() throws Exception {
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		System.out.println("Click On Save Button Successfully.");
		Thread.sleep(5000);

		// }

// ------------------------------------------------------------------------------------------------------------------------------	

	}

	@AfterMethod
	public void afterMethod(Method method) {
		Reporter.log("***********************Test Case Finished********************" + method.getName());
//		  System.out.println("********************Test Case Finished********************"+method.getName());
	}

	@Test(priority = 2, enabled = true, dependsOnMethods = "verifyAddUserFun") // , dependsOnMethods =
																				// "verifyAddUserFun"
	public void verifySearchUserFun() throws Exception {
		System.out.println("verifySearchUserFun");
		Thread.sleep(2000);

		// Verify Search User Functionality
		// enter user Name
		// public void searchUserName(String username1) throws Exception {

		WebElement input = driver.findElement(By.xpath("//label[text()='Username']//following::input[1]"));
		input.sendKeys(username1);

		// driver.findElement(By.xpath("//label[text()='Username']//following::input[1]")).sendKeys(username1);
		System.out.println("Enter Username In Search Field Successfully.----> " + username1);
		Thread.sleep(3000);
		// }

		// click on search button.
		// public void clickOnSearchButton() throws Exception {

		driver.findElement(By.xpath("//button[text()=' Search ']")).click();
		System.out.println("Click On Search Button Successfully.");
		Thread.sleep(3000);

		// Number of record check in the list
		String numberOfRecordGetText = driver.findElement(By.xpath("//button[text()=' Add ']//following::div[2]"))
				.getText();
		// Boolean headerFlag = driver.findElement(By.xpath("//h6[text()='" + headerName
		// + "']")).isDisplayed();
		System.out.println("Number of records found in the list. -----> " + numberOfRecordGetText);
		Thread.sleep(2000);

		// user name found in record check in the list
		String searchUserNameGetText = driver.findElement(By.xpath("//button[text()=' Add ']//following::div[29]"))
				.getText();
		// Boolean headerFlag = driver.findElement(By.xpath("//h6[text()='" + headerName
		// + "']")).isDisplayed();
		System.out.println("User Name Found in Records -----> " + searchUserNameGetText);
		Thread.sleep(3000);

		// }
	}

	@Test(priority = 3, enabled = true, dependsOnMethods = "verifySearchUserFun") // , dependsOnMethods =
																					// "verifySearchUserFun"
	public void verifyUpdateUserFun() throws Exception {
		System.out.println("verifyUpdateUserFun");

		// Verify Update User Functionality
		// click on edit icon

		// public void clickOnEditIcon() throws Exception {

		driver.findElement(By.xpath("//div[text()='Actions']//following::button[2]")).click();
		System.out.println("Edit icon clicked Successfully.");
		Thread.sleep(4000);

		// }

		//
		// select user role from drop down
		// public void selectUserRoleDD(String userRole) throws Exception {
		driver.findElement(By.xpath("//label[text()='User Role']//following::div[1]")).click();
		System.out.println("Clicked On Select User Role Dropdown");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[text()='User Role']//following::span[text()='" + userRole2 + "']"))
				.click();
//							driver.findElement(By.xpath("//label[text()='User Role']//following::span[text()='ESS']")).click();

		System.out.println(userRole2 + "User Role Selected Successfully From Dropdown------> " + userRole2);
		Thread.sleep(2000);
		// }

		// select Status from drop down
		// public void selectStatusDD(String status) throws Exception {

		driver.findElement(By.xpath("//label[text()='Status']//following::div[1]")).click();
		System.out.println("Clicked On Status Dropdown");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[text()='Status']//following::span[text()='" + status2 + "']")).click();
		// driver.findElement(By.xpath("//label[text()='Status']//following::span[text()='Disabled']")).click();
		System.out.println(status2 + "Status Selected Successfully From Dropdown----> " + status2);
		Thread.sleep(2000);
		// }

		// click on employee Name and select employee name from list.
		// public void selectEmployeeName(String employeeName1) throws Exception {

		// Select all data in this field.
		// element.sendKeys(Keys.CONTROL + "a");
		// element.sendKeys(Keys.DELETE);

		driver.findElement(By.xpath("//label[text()='Employee Name']//following::input[1]"))
				.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Employee Name']//following::input[1]")).sendKeys(Keys.DELETE);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[text()='Employee Name']//following::input[1]")).sendKeys(employeeName2);
		System.out.println("Type Employee Name ----> " + employeeName2);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[text()='Employee Name']//following::span[1]")).click();
		System.out.println("Employee Name Selected Successfully From List");
		Thread.sleep(2000);

		// }
		// enter Username1

		// public void enterUsername1(String username1) throws Exception {

		// Select all data in this field.
		// element.sendKeys(Keys.CONTROL + "a");
		// element.sendKeys(Keys.DELETE);

		driver.findElement(By.xpath("//label[text()='Username']//following::input[1]")).sendKeys(Keys.CONTROL + "a");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Username']//following::input[1]")).sendKeys(Keys.DELETE);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[text()='Username']//following::input[1]")).sendKeys(username2);
		System.out.println("Username Entered Successfully----> " + username2);
		Thread.sleep(4000);

		// }

		// Change Password ? confirmation checkbox
		// public void clickOnCheckBox() throws Exception {
		Thread.sleep(1000);

		driver.findElement(By.xpath("//label[text()='Username']//following::i[1]")).click();
		System.out.println("CheckBox icon clicked Successfully.");
		Thread.sleep(2000);

		// }

		// enter enterPassword1

		// public void enterPassword1(String password1) throws Exception {

		// Select all data in this field.
		// element.sendKeys(Keys.CONTROL + "a");
		// element.sendKeys(Keys.DELETE);

		driver.findElement(By.xpath("//label[text()='Password']//following::input[1]")).sendKeys(Keys.CONTROL + "a");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Password']//following::input[1]")).sendKeys(Keys.DELETE);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[text()='Password']//following::input[1]")).sendKeys(password2);
		System.out.println("Password Entered Successfully-----> " + password2);
		Thread.sleep(2000);

		// }
		// enter enterConfirmPassword

		// public void enterConfirmPassword(String password1) throws Exception {

		// Select all data in this field.
		// element.sendKeys(Keys.CONTROL + "a");
		// element.sendKeys(Keys.DELETE);

		driver.findElement(By.xpath("//label[text()='Confirm Password']//following::input[1]"))
				.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Confirm Password']//following::input[1]")).sendKeys(Keys.DELETE);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[text()='Confirm Password']//following::input[1]")).sendKeys(password2);
		System.out.println("Confirm Password Entered Successfully------> " + password2);
		Thread.sleep(2000);

		// }
		// click On SaveButton

		// public void clickOnSaveButton() throws Exception {
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		System.out.println("Click On Save Button Successfully.");
		Thread.sleep(5000);

		// }

	}
	
	
	

	@Test(priority = 4, enabled = true, dependsOnMethods = "verifyUpdateUserFun")
	public void verifyDeleteUserFun() throws Exception {
		System.out.println("verifyDeleteUserFun");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//label[text()='Username']//following::input[1]")).sendKeys(username2);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[text()=' Search ']")).click();
		System.out.println("search button clicked Successfully");
		Thread.sleep(3000);

		String UsernameInRecordFound = driver.findElement(By.xpath("//div[text()='Actions']//following::div[8]"))
				.getText();
		System.out.println("Username Found Successfully-------->" + UsernameInRecordFound);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[text()='Actions']//following::i[2]")).click();
		System.out.println("Delete icon clicked Successfully");

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
		
		
		
		

	/*
		// Verify Delete User Functionality
		driver.findElement(By.xpath("//span[text()='Admin']")).getText();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='Admin']")).isDisplayed();
		Thread.sleep(2000);

		
//	click on admin left panel
//		driver.findElement(By.xpath("//span[text()='Admin']")).click();

	driver.findElement(By.xpath("//span[text()='" + tabName1 + "']")).click();
//		Thread.sleep(2000);
	System.out.println(tabName1 + " tab clicked successfully.");

		// public void searchUserName(String username1) throws Exception {

		WebElement input = driver.findElement(By.xpath("//label[text()='Username']//following::input[1]"));
		input.sendKeys(username2);

		// driver.findElement(By.xpath("//label[text()='Username']//following::input[1]")).sendKeys(username1);
		System.out.println("Enter Username In Search Field Successfully.----> " + username2);
		Thread.sleep(3000);
		// }

		// click on search button.
		// public void clickOnSearchButton() throws Exception {

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

		// }

		// click on delete icon

		// public void clickOnDeleteIcon() throws Exception {

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

		// }
		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	@BeforeClass
	public void beforeClass() throws Exception {

//	  public void openBrowser(String Url) throws Exception {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(5000);

		String headerGetText = driver.findElement(By.xpath("//h5[text()='Login']")).getText();
		boolean headerFlag = driver.findElement(By.xpath("//h5[text()='Login']")).isDisplayed();

		System.out.println("Login Page Displayed Successfully. -------> " + headerGetText);
		System.out.println("Login Page Displayed Successfully. -------> " + headerFlag);

		// }

		// public void enterUserName(String userNameValue) throws Exception {

		driver.findElement(By.xpath("//input[@name='username' and @placeholder='Username']")).sendKeys(validUsername);
		Thread.sleep(1000);
		System.out.println("Username Entered . -------> " + validUsername);
		// }

		// public void enterPassword(String passwordValue) throws Exception {
		driver.findElement(By.xpath("//input[@type='password' or @name='password']")).sendKeys(validPassword);
		System.out.println("Password Entered Successfully. -------> " + validPassword);
		Thread.sleep(1000);

		// }

		// public void clickOnLogin() throws Exception {
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(5000);
		System.out.println("Click On Login Successfully. ");

		// }

		// public void validateLoginPage() throws Exception {

		Thread.sleep(2000);
		String headerGetText2 = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
		Boolean headerFlag2 = driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
		Thread.sleep(1000);

		System.out.println("Dashobard Page Displayed Successfully. ------> " + headerGetText2);
		System.out.println("Dashobard Page Displayed Successfully. ------> " + headerFlag2);
		String currentPageUrl = driver.getCurrentUrl();
		System.out.println("URL: " + currentPageUrl);

		// Get the page title and print it
		String pageTitle = driver.getTitle();
		System.out.println("Page Title: " + pageTitle);

		// }

	}

	@AfterClass
	public void afterClass() throws Exception {

		// public void verifyLogoutFunction() throws Exception {

		Thread.sleep(2000);

		driver.findElement(By.xpath("//img[@alt='profile picture']")).click();
		System.out.println("Clicked on profile icon");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//img[@alt='profile picture']//following::a[4]")).click();
		System.out.println("Clicked on logout link.");
		Thread.sleep(5000);

		String LoginPage = driver.findElement(By.xpath("//h5[text()='Login']")).getText();
		boolean VerifyLogout = driver.findElement(By.xpath("//h5[text()='Login']")).isDisplayed();
		System.out.println("Login Page Displayed-------------->" + VerifyLogout);

//		}

		// close browser
//		public void closeBrowser() throws Exception {

		driver.quit();
		System.out.println("Browser Closed successfully.");

//		}

	}

}
