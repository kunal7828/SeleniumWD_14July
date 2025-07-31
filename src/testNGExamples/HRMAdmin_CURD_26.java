package testNGExamples;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class HRMAdmin_CURD_26 {

	WebDriver driver;

	String urlLoc = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

	String loginPageHeaderLocator = "//h5[text()='Login']";

	String userNameLoginPageLoc = "//input[@name='username' and @placeholder='Username']";
	String validUsername = "Admin";

	String passwordLoginPageLoc = "//input[@type='password' or @name='password']";
	String validPassword = "admin123";

	String dashboardHeaderPageLoc = "//h6[text()='Dashboard']";

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
	String leftPaneltab1 = "Admin";
	String tabNameHeader1 = "Admin";

//Reporter.log("",true);
// ------------------------------------------------------------------------------------------------------------------------------	

	@Test(enabled = true, priority = 1, description = "clickOnAdminLeftPanel")
	public void clickOnAdminLeftPanel() throws Exception {

		driver.findElement(By.xpath("//span[text()='" + leftPaneltab1 + "']")).click();
		Reporter.log(leftPaneltab1 + "Tab clicked successfully------------> " + leftPaneltab1, true);
		Thread.sleep(3000);

		Boolean AdminPageVisibility = driver.findElement(By.xpath("//h6[text()='" + tabNameHeader1 + "']"))
				.isDisplayed();
		Reporter.log(tabNameHeader1 + "Page displayed successfully------------> " + AdminPageVisibility, true);
		Thread.sleep(1000);
		Assert.assertEquals(AdminPageVisibility, true);

		String headerGetText = driver.findElement(By.xpath("//h6[text()='" + tabNameHeader1 + "']")).getText();
		Reporter.log(headerGetText + "Page Displayed Successfully." + headerGetText, true);
		Thread.sleep(1000);

	}

	// Verify Add User Functionality------> click on add button
	@Test(enabled = true, priority = 2, description = "clickOnAddButton", dependsOnMethods = "clickOnAdminLeftPanel")
	public void clickOnAddButton() throws Exception {
		WebElement addbutton = driver.findElement(By.xpath("//button[text()=' Add ']"));
		addbutton.click();
		boolean addButtonVisibility=addbutton.isDisplayed();
		String addButtonGetText=addbutton.getText();
		Reporter.log(addbutton + "Add Button Clicked Successfully." + addbutton, true);
		Thread.sleep(3000);
	}

	// select user role from drop down
	@Test(enabled = true, priority = 3, description = "selectUserRoleDD", dependsOnMethods = "clickOnAddButton")
	public void selectUserRoleDD(String userRole1) throws Exception {
		driver.findElement(By.xpath("//label[text()='User Role']//following::div[1]")).click();
		System.out.println("Clicked On Select User Role Dropdown");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[text()='User Role']//following::span[text()='" + userRole1 + "']"))
				.click();
//			driver.findElement(By.xpath("//label[text()='User Role']//following::span[text()='ESS']")).click();

		System.out.println(userRole1 + "User Role Selected Successfully From Dropdown------> " + userRole1);
		Thread.sleep(2000);
	}

	// select Status from drop down
	public void selectStatusDD(String status) throws Exception {

		driver.findElement(By.xpath("//label[text()='Status']//following::div[1]")).click();
		System.out.println("Clicked On Status Dropdown");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[text()='Status']//following::span[text()='" + status1 + "']")).click();
		// driver.findElement(By.xpath("//label[text()='Status']//following::span[text()='Disabled']")).click();
		System.out.println(status1 + "Status Selected Successfully From Dropdown----> " + status1);
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

//------------------------------------------------------------------------------------------------------------------------------	

	@BeforeSuite
	public void beforeSuite() throws Exception {
		Reporter.log("open Browser With Login", true);
//	  public void openBrowser(String Url) throws Exception {

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
		driver.findElement(By.xpath(userNameLoginPageLoc)).sendKeys(validUsername);
		Reporter.log("Username Entered Successfully. -------> " + validUsername, true);
		Thread.sleep(2000);
		// }

		// public void enterPassword(String passwordValue) throws Exception {
		driver.findElement(By.xpath(passwordLoginPageLoc)).sendKeys(validPassword);
		Reporter.log("Password Entered Successfully. -------> " + validPassword, true);
		Thread.sleep(2000);
		// }

		// public void clickOnLogin() throws Exception {
		driver.findElement(By.tagName("button")).click();
		Reporter.log("Click On Login Successfully. -------> " + validPassword, true);
		Thread.sleep(5000);
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
		Thread.sleep(3000);
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
