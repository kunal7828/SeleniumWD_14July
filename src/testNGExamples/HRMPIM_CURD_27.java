package testNGExamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HRMPIM_CURD_27 {

	WebDriver driver;

	String urlLoc = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

	String loginPageHeaderLocator = "//h5[text()='Login']";

//	String userNameLoginPageLoc = "//input[@name='username' and @placeholder='Username']";                //or
	String userNameLoginPageLoc = "//input[@name='username']";
	String validUsername = "Admin";

//	String passwordLoginPageLoc = "//input[@type='password' or @name='password']";                        //or
	String passwordLoginPageLoc = "//input[@type='password']";

	String validPassword = "admin123";

	String dashboardHeaderPageLoc = "//h6[text()='Dashboard']";

	// Select UserRole --- Admin / ESS
	String userRole1 = "Admin";
	String userRole2 = "ESS";

	// Select Status --- Enabled / Disabled
	String status1 = "Enabled";
	String status2 = "Disabled";

	// locator left panel
	String leftPaneltab1 = "PIM";
	String tabNameHeader1 = "PIM";

	// --------------------------------------------------------------------

	// tabName
	String tabName = "PIM";

	// Employee Details
	String firstName = "Kunal";
	String lastName = "Sharma";

	// Username
	String username1 = "kunal187";
	String username2 = "kunal188";

	// Password
	String password1 = "Kunal@123";
	String password2 = "Kunal@321";

	// Employee Name --- a or b
	String employeeName1 = "Kunal";
	String employeeName2 = "l";

	String drivingLicence = "ABCD1235";

//Reporter.log("",true);

	/*
	 * 
	 * @Test public void waitForElementToBeClickableTest() {
	 * 
	 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); //
	 * Locator of the clickable element By buttonLocator = By.id("submitButton"); //
	 * Wait until the element is clickable WebElement clickableElement =
	 * wait.until(ExpectedConditions.elementToBeClickable(buttonLocator)); // Now
	 * click the element clickableElement.click(); }
	 * 
	 */
// ------------------------------------------------------------------------------------------------------------------------------	

	@Test(enabled = true, priority = 1, description = "clickOnAdminLeftPanel")
	public void clickOnPIMLeftPanel() throws Exception {

		// driver.findElement(By.xpath("//span[text()='" + leftPaneltab1
		// +"']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		By buttonLocator = By.xpath("//span[text()='" + leftPaneltab1 + "']");
		WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(buttonLocator));
		clickableElement.click();

		// Thread.sleep(4000);
		Reporter.log(leftPaneltab1 + "Tab clicked successfully------------> ", true);

		// WebElement element1 =
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[text()='"
		// + tabNameHeader1 + "']")));
		// element1.getText();

		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		By buttonLocator2 = By.xpath("//h6[text()='" + tabNameHeader1 + "']");
		WebElement clickableElement2 = wait.until(ExpectedConditions.elementToBeClickable(buttonLocator2));
		clickableElement2.click();

		String headerGetText = driver.findElement(By.xpath("//h6[text()='" + tabNameHeader1 + "']")).getText();
		Reporter.log(headerGetText + "Page Get Text Verify Displayed Successfully." + headerGetText, true);

		Boolean AdminPageVisibility = driver.findElement(By.xpath("//h6[text()='" + tabNameHeader1 + "']"))
				.isDisplayed();
		Reporter.log(tabNameHeader1 + "Page Boolean Verify Displayed successfully------------> " + AdminPageVisibility,
				true);

	}

	// Verify Add User Functionality------> click on add button
	@Test(enabled = true, priority = 2, description = "clickOnLeftPanelTab") // , dependsOnMethods =
	public void clickOnLeftPanelTab() throws Exception {

		driver.findElement(By.xpath("//span[text()='" + tabName + "']")).click();
		Thread.sleep(2000);
		System.out.println(tabName + " tab clicked successfully.");
	}
	// -----------------------------------------------------------------------------------------------------------------------------------------

	// Verify Add User Functionality------> click on add button
	@Test(enabled = true, priority = 3, description = "clickOnAddButton") // , dependsOnMethods = //
																			// "clickOnAdminLeftPanel"
	public void clickOnAddButton() throws Exception {
		WebElement addbutton = driver.findElement(By.xpath("//button[text()=' Add ']"));
		addbutton.click();
		Reporter.log("Add Button Clicked Successfully.", true);
		Thread.sleep(2000);
	}
	// -----------------------------------------------------------------------------------------------------------------------------------------

	// select Status from drop down
	@Test(enabled = true, priority = 4, description = "enterEmployeeDetails") // , dependsOnMethods =
																				// "selectUserRoleDD"
	public void enterEmployeeDetails() throws Exception {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstName);
		Reporter.log("Enter First Name", true);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lastName);
		Reporter.log("Enter Last Name", true);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//p[text()='Create Login Details']//following::label[1]")).click();
		Reporter.log("Click On Toogle Button", true);
		Thread.sleep(2000);

		// enter Username1
		driver.findElement(By.xpath("//label[text()='Username']//following::input[1]")).sendKeys(Keys.CONTROL + "a");
		Thread.sleep(2000);
		Reporter.log("Select All Text----> ", true);
		driver.findElement(By.xpath("//label[text()='Username']//following::input[1]")).sendKeys(Keys.DELETE);
		Reporter.log("Remove All Text----> ", true);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Username']//following::input[1]")).sendKeys(username1);
		Reporter.log("Username Entered Successfully----> " + username1, true);
		Thread.sleep(2000);

		// enter enterPassword1
		driver.findElement(By.xpath("//label[text()='Password']//following::input[1]")).sendKeys(Keys.CONTROL + "a");
		Thread.sleep(2000);
		Reporter.log("Select All Text----> ", true);
		driver.findElement(By.xpath("//label[text()='Password']//following::input[1]")).sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		Reporter.log("Remove All Text----> ", true);
		driver.findElement(By.xpath("//label[text()='Password']//following::input[1]")).sendKeys(password1);
		Reporter.log("Password Entered Successfully----> " + password1, true);
		Thread.sleep(2000);

		// enter enterConfirmPassword

		driver.findElement(By.xpath("//label[text()='Confirm Password']//following::input[1]"))
				.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(2000);
		Reporter.log("Select All Text----> ", true);
		driver.findElement(By.xpath("//label[text()='Confirm Password']//following::input[1]")).sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		Reporter.log("Remove All Text----> ", true);
		driver.findElement(By.xpath("//label[text()='Confirm Password']//following::input[1]")).sendKeys(password1);
		Reporter.log("Confirm Password Entered Successfully----> " + password1, true);
		Thread.sleep(2000);

		// click On SaveButton
		WebDriverWait input = new WebDriverWait(driver, Duration.ofSeconds(10));
		By buttonLocator2 = By.xpath("//button[text()=' Save ']");
		WebElement clickableElement2 = input.until(ExpectedConditions.elementToBeClickable(buttonLocator2));
		clickableElement2.click();
		// driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		Reporter.log("Click On Save Button Successfully.", true);
		Thread.sleep(3000);

	}

	// Verify Search User Functionality
	// enter user Name
	@Test(enabled = true, priority = 5, description = "navigateToPIMDashboard") // , dependsOnMethods =
																				// "clickOnSaveButton"
	public void navigateToPIMDashboard() throws Exception {
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		Thread.sleep(3000);

	}

	// Verify Search User Functionality
	// enter user Name
	@Test(enabled = true, priority = 6, description = "searchUserName") // , dependsOnMethods = "clickOnSaveButton"
	public void searchUserName() throws Exception {

		WebDriverWait input = new WebDriverWait(driver, Duration.ofSeconds(10));
		By buttonLocator2 = By.xpath("//label[text()='Employee Name']//following::input[1]");
		WebElement clickableElement2 = input.until(ExpectedConditions.elementToBeClickable(buttonLocator2));
		Reporter.log("Element is clickable.", true);

		driver.findElement(By.xpath("//label[text()='Employee Name']//following::input[1]"))
				.sendKeys(Keys.CONTROL + "a");
		Reporter.log("Select All Text----> ", true);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Employee Name']//following::input[1]")).sendKeys(Keys.DELETE);
		Reporter.log("Remove All Text ", true);
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//label[text()='Employee
		// Name']//following::input[1]")).sendKeys(employeeName1);
		clickableElement2.sendKeys(firstName + " " + lastName); // space ke sath text kese enter kare same field me.

		Reporter.log("Type Employee Name ----> " + firstName + " " + lastName, true);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Employee Name']//following::span[1]")).click();
		Reporter.log("Employee Name Entered Successfully From List ----> " + firstName + " " + lastName, true);
		Thread.sleep(2000);

		// WebElement input =
		// driver.findElement(By.xpath("//label[text()='Username']//following::input[1]"));
		// input.sendKeys(username1);
		// driver.findElement(By.xpath("//label[text()='Username']//following::input[1]")).sendKeys(username1);
		Reporter.log("Enter Username In Search Field Successfully.----> " + firstName + " " + lastName, true);
		Thread.sleep(4000);

//		}

		// click on search button
		driver.findElement(By.xpath("//button[text()=' Search ']")).click();
		Reporter.log("Click On Search Button Successfully.", true);
		Thread.sleep(3000);
		// Number of record check in the list
		String numberOfRecordGetText = driver.findElement(By.xpath("//button[text()=' Add ']//following::div[2]"))
				.getText();
		Reporter.log("Number of records found in the list. -----> " + numberOfRecordGetText, true);
		Thread.sleep(1000);
		// user name found in record check in the list
		String searchUserNameGetText = driver.findElement(By.xpath("//button[text()=' Add ']//following::div[29]"))
				.getText();
		Reporter.log("User Name Found in Records -----> " + searchUserNameGetText, true);
		Thread.sleep(1000);
	}

	// Verify Update User Functionality
	// click on edit icon

	@Test(enabled = true, priority = 7, description = "clickOnEditIcon") // , dependsOnMethods = "clickOnSearchButton"
	public void clickOnEditIcon() throws Exception {
		driver.findElement(By.xpath("//div[text()='Actions']//following::button[1]")).click();
		Reporter.log("Edit icon clicked Successfully.", true);
		Thread.sleep(4000);

		// @Test(enabled = true, priority = 8, description = "enterDrivingLicence") // ,
		// dependsOnMethods = "clickOnSearchButton"
		// public void enterDrivingLicence() throws Exception {
		driver.findElement(By.xpath("//label[text()='License Expiry Date']//preceding::input[1]"))
				.sendKeys(drivingLicence);
		Reporter.log("Edit icon clicked Successfully.", true);
		Thread.sleep(4000);

		/*
		 * // @Test(enabled = true, priority = 8, description = "enterDrivingLicence")
		 * // , dependsOnMethods = "clickOnSearchButton" // public void
		 * enterDrivingLicence() throws Exception { String nationality1 = "Indian";
		 * 
		 * driver.findElement(By.xpath(
		 * "//label[text()='Nationality']//following::div[1]")).click();
		 * Reporter.log("Clicked On Nationality Dropdown", true); Thread.sleep(2000);
		 * driver.findElement(By.xpath("//span[text()='" + nationality1 +
		 * "']")).click(); Reporter.log(nationality1 + "Selected Successfully----> " +
		 * status1, true); Thread.sleep(2000);
		 */
		String maritalStatus = "Single";

		driver.findElement(By.xpath("//label[text()='Marital Status']//following::div[1]")).click();
		Reporter.log("Clicked On Nationality Dropdown", true);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='" + maritalStatus + "']")).click();
		Reporter.log(maritalStatus + "Selected Successfully----> " + status1, true);
		Thread.sleep(2000);

		WebDriverWait input = new WebDriverWait(driver, Duration.ofSeconds(10));
		By buttonLocator2 = By.xpath("//label[text()='Gender']//following::button[1]");
		WebElement clickableElement2 = input.until(ExpectedConditions.elementToBeClickable(buttonLocator2));
		clickableElement2.click();
		// driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		Reporter.log("Click On Save Button Successfully.", true);
		Thread.sleep(5000);
//					}

	}

	@Test(enabled = true, priority = 9, description = "navigateToPIMDashboard2") // , dependsOnMethods =
	// "clickOnSaveButton"
	public void navigateToPIMDashboard2() throws Exception {
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		Thread.sleep(3000);

	}

	// Verify Search recently updated user for delete from records.
	@Test(enabled = true, priority = 10, description = "searchUserName_2") // , dependsOnMethods = "clickOnSaveButton_2"
	public void searchUserName_2() throws Exception {
		WebDriverWait input = new WebDriverWait(driver, Duration.ofSeconds(10));
		By buttonLocator2 = By.xpath("//label[text()='Employee Name']//following::input[1]");
		WebElement clickableElement2 = input.until(ExpectedConditions.elementToBeClickable(buttonLocator2));
		Reporter.log("Element is clickable.", true);

		driver.findElement(By.xpath("//label[text()='Employee Name']//following::input[1]"))
				.sendKeys(Keys.CONTROL + "a");
		Reporter.log("Select All Text----> ", true);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Employee Name']//following::input[1]")).sendKeys(Keys.DELETE);
		Reporter.log("Remove All Text ", true);
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//label[text()='Employee
		// Name']//following::input[1]")).sendKeys(employeeName1);
		clickableElement2.sendKeys(firstName + " " + lastName); // space ke sath text kese enter kare same field me.

		Reporter.log("Type Employee Name ----> " + firstName + " " + lastName, true);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Employee Name']//following::span[1]")).click();
		Reporter.log("Employee Name Entered Successfully From List ----> " + firstName + " " + lastName, true);
		Thread.sleep(2000);

		// WebElement input =
		// driver.findElement(By.xpath("//label[text()='Username']//following::input[1]"));
		// input.sendKeys(username1);
		// driver.findElement(By.xpath("//label[text()='Username']//following::input[1]")).sendKeys(username1);
		Reporter.log("Enter Username In Search Field Successfully.----> " + firstName + " " + lastName, true);
		Thread.sleep(4000);

	}


	// Verify Delete User Functionality
	// click on delete icon
	@Test(enabled = true, priority = 10, description = "clickOnDeleteIcon") // , dependsOnMethods = //
																			// "clickOnSearchButton_2"
	public void clickOnDeleteIcon() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		By DeleteIcon = By.xpath("//div[text()='Actions']//following::button[2]");
		WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(DeleteIcon));
		clickableElement.click();
		// driver.findElement(By.xpath("//div[text()='Actions']//following::button[1]")).click();
		Reporter.log("Delete icon clicked Successfully", true);
		Thread.sleep(2000);
		// ----------------------------------------------------------------------------------------------------//
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		// Locator of the clickable element
		By confirmationButton = By.xpath("//button[text()=' Yes, Delete ']");
		// Wait until the element is clickable
		WebElement clickableElement2 = wait2.until(ExpectedConditions.elementToBeClickable(confirmationButton));
		// Now click the element
		clickableElement2.click();
		// driver.findElement(By.xpath("//button[text()=' Yes, Delete ']")).click();
		Reporter.log("clicked on yes button.", true);
		Thread.sleep(3000);
		// ----------------------------------------------------------------------------------------------------//
		driver.findElement(By.xpath("//p[text()='Successfully Deleted']")).getText();
		Boolean userDeletedSuccessMsg = driver.findElement(By.xpath("//p[text()='Successfully Deleted']"))
				.isDisplayed();
		Reporter.log("User is deleted Successfully--------------->" + userDeletedSuccessMsg, true);
		Boolean noRecordsFoundMsg = driver.findElement(By.xpath("//p[text()='Successfully Deleted']")).isDisplayed();
		Reporter.log("User is deleted Successfully--------------->" + noRecordsFoundMsg, true);
		Thread.sleep(3000);
	}

	@BeforeSuite
	public void beforeSuite() throws Exception {
		Reporter.log("open Browser With Login", true);
//	  public void openBrowser(String Url) throws Exception {
		/*
		 * // ChromeOptions object to set headless mode ChromeOptions options = new
		 * ChromeOptions(); options.addArguments("--headless"); // Run in headless mode
		 * options.addArguments("--disable-gpu"); // Recommended for headless
		 * options.addArguments("--window-size=1920,1080"); // Optional but good for
		 * consistency // Initialize driver with headless options driver = new
		 * ChromeDriver(options); //
		 */
		driver = new ChromeDriver();
		driver.get(urlLoc);
		driver.manage().window().maximize();
		Thread.sleep(3000);

		String headerGetText = driver.findElement(By.xpath(loginPageHeaderLocator)).getText();
		Reporter.log("Login Page Displayed Successfully. -------> " + headerGetText, true);
		Thread.sleep(1000);

		boolean headerFlag = driver.findElement(By.xpath(loginPageHeaderLocator)).isDisplayed();
		Reporter.log("Login Page Displayed Successfully. -------> " + headerFlag, true);
		Thread.sleep(1000);
		// }

		// public void enterUserName(String userNameValue) throws Exception {

		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		By usernameLocator = By.xpath(userNameLoginPageLoc);
		WebElement clickableElement = wait1.until(ExpectedConditions.elementToBeClickable(usernameLocator));
		clickableElement.sendKeys(validUsername);

//  	driver.findElement(By.xpath(userNameLoginPageLoc)).sendKeys(validUsername);
		// Thread.sleep(2000);
		Reporter.log("Username Entered Successfully. -------> " + validUsername, true);

		// }

		// public void enterPassword(String passwordValue) throws Exception {

		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		By passwordLocator = By.xpath(passwordLoginPageLoc);
		WebElement clickableElement2 = wait2.until(ExpectedConditions.elementToBeClickable(passwordLocator));
		clickableElement2.sendKeys(validPassword);

		// driver.findElement(By.xpath(passwordLoginPageLoc)).sendKeys(validPassword);
		Reporter.log("Password Entered Successfully. -------> " + validPassword, true);
		Thread.sleep(2000);
		// }

		// public void clickOnLogin() throws Exception {

		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
		By buttonLoc = By.tagName("button");
		WebElement clickableElement3 = wait3.until(ExpectedConditions.elementToBeClickable(buttonLoc));
		clickableElement3.click();

		// driver.findElement(By.tagName("button")).click();
		Reporter.log("Click On Login Successfully. -------> " + validPassword, true);
		Thread.sleep(4000);
		// }
		// ------------------------------------------------------------------------------------------------------------------------------

		// public void validateLoginPage() throws Exception {

		String headerGetText2 = driver.findElement(By.xpath(dashboardHeaderPageLoc)).getText();
		Reporter.log("Dashobard Page Displayed Successfully. ------> " + headerGetText2, true);
		Thread.sleep(1000);

		Boolean headerFlag2 = driver.findElement(By.xpath(dashboardHeaderPageLoc)).isDisplayed();
		Reporter.log("Dashobard Page Displayed Successfully. ------> " + headerFlag2, true);
		Thread.sleep(1000);

		String currentPageUrl = driver.getCurrentUrl();
		Reporter.log("Current Page URL: ------> " + currentPageUrl, true);
		Thread.sleep(1000);

		// Get the page title and print it
		String pageTitle = driver.getTitle();
		Reporter.log("Current Page Title: ------> " + pageTitle, true);
		// Thread.sleep(3000);
		// }

	}

	@AfterSuite
	public void afterSuite() throws Exception {
		// public void verifyLogoutFunction() throws Exception {
		driver.findElement(By.xpath("//img[@alt='profile picture']")).click();
		Reporter.log("Clicked on profile icon", true);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//img[@alt='profile picture']//following::a[4]")).click();
		Reporter.log("Clicked on logout link.", true);
		Thread.sleep(5000);

		String LoginPage = driver.findElement(By.xpath("//h5[text()='Login']")).getText();
		boolean VerifyLogout = driver.findElement(By.xpath("//h5[text()='Login']")).isDisplayed();
		Reporter.log("Login Page Displayed-------------->" + VerifyLogout, true);
		// }

		// close browser
		// public void closeBrowser() throws Exception {

		driver.quit();
		Reporter.log("Browser Closed successfully.");
		// }

	}
}