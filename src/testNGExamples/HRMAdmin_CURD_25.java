package testNGExamples;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class HRMAdmin_CURD_25 {

	WebDriver driver;

	String validUsername = "Admin";
	String validPassword = "admin123";

	String URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

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

	@Test(priority = 2, enabled = true, dependsOnMethods = "verifyAddUserFun") // , dependsOnMethods = "verifyAddUserFun"
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
//driver.findElement(By.xpath("//label[text()='User Role']//following::span[text()='ESS']")).click();

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

	public void verifyDeleteUserFunctionality() throws Exception {

//		click on admin left panel--------------------------------------------------
		driver.findElement(By.xpath("//span[text()='Admin']")).click();

		// Verify Delete User Functionality
		driver.findElement(By.xpath("//span[text()='Admin']")).getText();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='Admin']")).isDisplayed();
		Thread.sleep(2000);
//------------------------------------------------------------------------------------------------------------
		driver.findElement(By.xpath("//label[text()='Username']//following::input[1]")).sendKeys("kunal");
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

	}

	@BeforeSuite
	public void beforeSuite() throws Exception {

		Reporter.log("open Browser With Login", true);
//	  public void openBrowser(String Url) throws Exception {

		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String headerGetText = driver.findElement(By.xpath("//h5[text()='Login']")).getText();
		Reporter.log("Login Page Displayed Successfully. -------> " + headerGetText, true);
		Thread.sleep(1000);
		boolean headerFlag = driver.findElement(By.xpath("//h5[text()='Login']")).isDisplayed();
		Reporter.log("Login Page Displayed Successfully. -------> " + headerFlag, true);
		Thread.sleep(1000);
		// }

		// public void enterUserName(String userNameValue) throws Exception {
		driver.findElement(By.xpath("//input[@name='username' and @placeholder='Username']")).sendKeys(validUsername);
		Reporter.log("Username Entered Successfully. -------> " + validUsername, true);
		Thread.sleep(2000);
		// }

		// public void enterPassword(String passwordValue) throws Exception {
		driver.findElement(By.xpath("//input[@type='password' or @name='password']")).sendKeys(validPassword);
		Reporter.log("Password Entered Successfully. -------> " + validPassword, true);
		Thread.sleep(2000);

		// }

		// public void clickOnLogin() throws Exception {
		driver.findElement(By.tagName("button")).click();
		Reporter.log("Click On Login Successfully. -------> " + validPassword, true);
		Thread.sleep(5000);
		// }

		// public void validateLoginPage() throws Exception {

		String headerGetText2 = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
		Reporter.log("Dashobard Page Displayed Successfully. ------> " + headerGetText2, true);
		Thread.sleep(1000);

		Boolean headerFlag2 = driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
		Reporter.log("Dashobard Page Displayed Successfully. ------> " + headerFlag2, true);
		Thread.sleep(1000);

		String currentPageUrl = driver.getCurrentUrl();
		Reporter.log("Current Page URL: ------> " + currentPageUrl, true);
		Thread.sleep(1000);

		// Get the page title and print it
		String pageTitle = driver.getTitle();
		Reporter.log("Current Page Title: ------> " + pageTitle, true);
		Thread.sleep(3000);
		// }

	}

	@AfterSuite
	public void afterSuite() throws Exception {
		// public void verifyLogoutFunction() throws Exception {

		Thread.sleep(2000);

		driver.findElement(By.xpath("//img[@alt='profile picture']")).click();
		Reporter.log("Clicked on profile icon", true);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//img[@alt='profile picture']//following::a[4]")).click();
		Reporter.log("Clicked on logout link.", true);
		Thread.sleep(5000);

		String LoginPage = driver.findElement(By.xpath("//h5[text()='Login']")).getText();
		boolean VerifyLogout = driver.findElement(By.xpath("//h5[text()='Login']")).isDisplayed();
		Reporter.log("Login Page Displayed-------------->" + VerifyLogout, true);

//			}

		// close browser
//			public void closeBrowser() throws Exception {

		// driver.quit();
		Reporter.log("Browser Closed successfully.");

//			}

	}
}
