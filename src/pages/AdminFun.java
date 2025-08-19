package pages;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class AdminFun {
	WebDriver driver;

	@Test(enabled= false, priority = 1, description="To Verify Add User Functionality")
	public void verifyAddUserFun() throws Exception {

		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(5000);
		boolean flag = driver.findElement(By.xpath("//h6[text()='Admin']")).isDisplayed();
		Reporter.log("Admin page displayed successfully---->" + flag, true);
		driver.findElement(By.xpath("//button[text()=' Add ']")).click(); // Clicked On Admin Button
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[text()='User Role']//following::div[1]")).click(); // Select User role from
																								// drop down
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[text()='User Role']//following::div[8]")).click(); // Select Admin role
																								// value from user role
																								// drop down
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("a"); // Type value to search
																									// user
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']//following::span[1]")).click();// select
																												// username
																												// from
																												// suggestions
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[text()='Status']//following::div[1]")).click();// Clicked on status drop
																							// down
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[text()='Status']//following::div[8]")).click(); // select status from
																								// dropdown enabled
		Thread.sleep(5000);

		driver.findElement(By.xpath("//label[text()='Username']//following::input[1]")).sendKeys("Kunal19"); // enter
																												// username
		Thread.sleep(5000);

		driver.findElement(By.xpath("//label[text()='Password']//following::input[1]")).sendKeys("Kunal@123"); // enter
																												// password
		driver.findElement(By.xpath("//label[text()='Confirm Password']//following::input[1]")).sendKeys("Kunal@123"); // enter
																														// confirm
																														// password
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()=' Save ']")).click(); // click on save button
		Thread.sleep(5000);
		System.out.println("User Added succesfully");
		// Assert.fail();

	}

	@Test(enabled= true, priority = 1)
	//, dependsOnMethods = "verifyAddUserFun"
	public void verifySearchUserFun() throws Exception {
		
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//label[text()='Username']//following::input[1]")).sendKeys("Kunal19"); // search
																												// username
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()=' Search ']")).click(); // Clicked On search Button
		Thread.sleep(5000);

		System.out.println("User search successfully");
	}

	@Test(priority = 2)
	//, dependsOnMethods = "verifySearchUserFun"
	public void verifyUpdateUserFun() throws Exception {

		driver.findElement(By.xpath("//div[text()='Actions']//following::i[3]")).click(); // Clicked On edit icon
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[text()='User Role']//following::div[1]")).click(); // Edit User role from
																								// drop down
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[text()='User Role']//following::div[9]")).click(); // Update Admin role
																								// value from user role
																								// drop down
		
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).clear(); //Clear employee name field values
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("z"); // Type different value to search user
																									
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']//following::span[1]")).click();// Update
																												// username
																												// from
																												// suggestions
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[text()='Status']//following::div[1]")).click();// Edit status drop down
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[text()='Status']//following::div[9]")).click(); // Update status from
																								// dropdown disabed
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[text()='Username']//following::input[1]")).clear(); //clear old user name value
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[text()='Username']//following::input[1]")).sendKeys("kunal20"); // enter
																												// username
		Thread.sleep(5000);
		
	

		driver.findElement(By.xpath("//label[text()='Change Password ?']//following::i[1]")).click(); // click on change
																										// password
																										// checkbox
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[text()='Password']//following::input[1]")).clear(); //clear old password value
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[text()='Password']//following::input[1]")).sendKeys("Kunal123"); // enter password
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[text()='Confirm Password']//following::input[1]")).clear(); //clear Confirm Password value
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[text()='Confirm Password']//following::input[1]")).sendKeys("Kunal123"); // enter
																														// confirm
																														// password
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();

		System.out.println("User updated successfully");
		// Assert.fail();
	}

	@Test(priority = 4, dependsOnMethods = "verifyUpdateUserFun")
	public void verifyDeleteUserFun() throws Exception {

		driver.findElement(By.xpath("//label[text()='Username']//following::input[1]")).sendKeys("kunal321"); // search
																												// username
		driver.findElement(By.xpath("//button[text()=' Search ']")).click(); // Clicked On search Button
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Actions']//following::i[2]")).click(); // Clicked On delete icon

		driver.findElement(By.xpath("//button[text()=' Yes, Delete ']")).click(); // Clicked On delete Button

		System.out.println("User deleted successfully");
	}

	@BeforeClass
	public void openBrowserWithLogin() throws Exception {

		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);

		boolean flag = driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
		Reporter.log("Dashboard page displayed successfully---->" + flag, true);
		Thread.sleep(3000);
	}

	@AfterClass
	public void closeBrowserWithLogout() throws Exception {

		driver.findElement(By.xpath("//img[@alt='profile picture']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(5000);

		boolean flag = driver.findElement(By.xpath("//h5[text()='Login']")).isDisplayed();
		Reporter.log("Logout clicked successfully anb back to Login page---->" + flag, true);
		Thread.sleep(5000);

		driver.quit();

	}

}