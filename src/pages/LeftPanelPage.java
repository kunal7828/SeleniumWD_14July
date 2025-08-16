package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LeftPanelPage {

	WebDriver driver;

	public LeftPanelPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		System.out.println("This is constructor block of LeftPanelPage");
	}

	String adminTabLoc = "//span[text()='Admin']";
	String adminHeaderLoc = "//h6[text()='Admin']";

	String pimTabLoc = "//span[text()='PIM']";
	String pimHeaderLoc = "//h6[text()='PIM']";

	String leaveTabLoc = "//span[text()='Leave']";
	String leaveHeaderLoc = "//h6[text()='Leave']";

	String timeTabLoc = "//span[text()='Time']";
	String timeHeaderLoc = "//h6[text()='Time']";

	String recruitmentTabLoc = "//span[text()='Recruitment']";
	String recruitmentHeaderLoc = "//h6[text()='Recruitment']";

	String myInfoTabLoc = "//span[text()='My Info']";
	String myInfoHeaderLoc = "//h6[text()='PIM']";

	String performanceTabLoc = "//span[text()='Performance']";
	String performanceHeaderLoc = "//h6[text()='Performance']";

	String dashboardTabLoc = "//span[text()='Dashboard']";
	String dashboardHeaderLoc = "//h6[text()='Dashboard']";

	String directoryTabLoc = "//span[text()='Directory']";
	String directoryHeaderLoc = "//h6[text()='Directory']";

	String maintenanceTabLoc = "//span[text()='Maintenance']";
	String maintenanceHeaderLoc = "//h6[text()='Maintenance']";
	String passwordFieldLoc = "//input[@name='password']";
	String passwordValue = "admin123";
	String submitButtonLoc = "//button[text()=' Confirm ']";

	String claimTabLoc = "//span[text()='Claim']";
	String claimHeaderLoc = "//h6[text()='Claim']";

	String buzzTabLoc = "//span[text()='Buzz']";
	String buzzHeaderLoc = "//h6[text()='Buzz']";

	public void clickOnAdminTab() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.xpath(adminTabLoc)).click();
		Thread.sleep(2000);
		Reporter.log("Admin clicked successfully--> ", true);
		boolean flag = driver.findElement(By.xpath(adminHeaderLoc)).isDisplayed();
		Reporter.log("Admin Page visible successfully--> " + flag, true);
	}

	public void clickOnPIMTab() throws Exception {
		driver.findElement(By.xpath(pimTabLoc)).click();
		Reporter.log("PIM clicked successfully--> ", true);
		Thread.sleep(5000);
		boolean flag = driver.findElement(By.xpath(pimHeaderLoc)).isDisplayed();
		Reporter.log("PIM Page visible successfully--> " + flag, true);
		Assert.assertEquals(flag, true);
	}

	public void clickOnLeaveTab() throws Exception {
		driver.findElement(By.xpath(leaveTabLoc)).click();
		Reporter.log("Leave clicked successfully--> ", true);
		Thread.sleep(5000);
		boolean flag = driver.findElement(By.xpath(leaveTabLoc)).isDisplayed();
		Reporter.log("Leave Page visible successfully--> " + flag, true);
		Assert.assertEquals(flag, true);
	}

	public void clickOnTimeTab() throws Exception {
		driver.findElement(By.xpath(timeTabLoc)).click();
		Reporter.log("Time clicked successfully--> ", true);
		Thread.sleep(5000);
		boolean flag = driver.findElement(By.xpath(timeHeaderLoc)).isDisplayed();
		Reporter.log("Time Page visible successfully--> " + flag, true);
		Assert.assertEquals(flag, true);
	}

	public void clickOnRecruitmentTab() throws Exception {
		driver.findElement(By.xpath(recruitmentTabLoc)).click();
		Reporter.log("Recruitment clicked successfully--> ", true);
		Thread.sleep(5000);
		boolean flag = driver.findElement(By.xpath(recruitmentHeaderLoc)).isDisplayed();
		Reporter.log("Recruitment Page visible successfully--> " + flag, true);
		Assert.assertEquals(flag, true);
	}

	public void clickOnMyInfoTab() throws Exception {
		driver.findElement(By.xpath(myInfoTabLoc)).click();
		Reporter.log("MyInfo clicked successfully--> ", true);
		Thread.sleep(5000);
		boolean flag = driver.findElement(By.xpath(myInfoHeaderLoc)).isDisplayed();
		Reporter.log("PIM Page visible successfully--> " + flag, true);
		Assert.assertEquals(flag, true);
	}

	public void clickOnPerformanceTab() throws Exception {
		driver.findElement(By.xpath(performanceTabLoc)).click();
		Reporter.log("Performance clicked successfully--> ", true);
		Thread.sleep(5000);
		boolean flag = driver.findElement(By.xpath(performanceHeaderLoc)).isDisplayed();
		Reporter.log("Performance Page visible successfully--> " + flag, true);
		Assert.assertEquals(flag, true);
	}

	public void clickOnDashboardTab() throws Exception {
		driver.findElement(By.xpath(dashboardTabLoc)).click();
		Reporter.log("Dashboard clicked successfully--> ", true);
		Thread.sleep(5000);
		boolean flag = driver.findElement(By.xpath(dashboardHeaderLoc)).isDisplayed();
		Reporter.log("Dashboard Page visible successfully--> " + flag, true);
		Assert.assertEquals(flag, true);
	}

	public void clickOnDirectoryTab() throws Exception {
		driver.findElement(By.xpath(directoryTabLoc)).click();
		Reporter.log("Directory clicked successfully--> ", true);
		Thread.sleep(5000);
		boolean flag = driver.findElement(By.xpath(directoryHeaderLoc)).isDisplayed();
		Reporter.log("Directory Page visible successfully--> " + flag, true);
		Assert.assertEquals(flag, true);
	}

	public void clickOnMaintenanceTab() throws Exception {
		driver.findElement(By.xpath(maintenanceTabLoc)).click();
		Reporter.log("Maintenance clicked successfully--> ", true);
		Thread.sleep(5000);

		driver.findElement(By.xpath(passwordFieldLoc)).sendKeys(passwordValue);
		Reporter.log("Enter password  successfully.", true);
		Thread.sleep(5000);

		driver.findElement(By.xpath(submitButtonLoc)).click();
		Reporter.log("Confirm button clicked successfully.", true);
		Thread.sleep(5000);

		/*
		 * driver.navigate().back(); Thread.sleep(2000);
		 * 
		 * driver.findElement(By.xpath("//button[text()=' Cancel ']")).click();
		 * Reporter.log("cancel button clicked successfully.", true);
		 * Thread.sleep(5000);
		 */

		boolean flag = driver.findElement(By.xpath(maintenanceHeaderLoc)).isDisplayed();
		Reporter.log("Maintenance Page visible successfully--> " + flag, true);
		Assert.assertEquals(flag, true);
	}

	public void clickOnClaimTab() throws Exception {
		driver.findElement(By.xpath(claimTabLoc)).click();
		Reporter.log("Claim clicked successfully--> ", true);
		Thread.sleep(5000);
		boolean flag = driver.findElement(By.xpath(claimHeaderLoc)).isDisplayed();
		Reporter.log("Claim Page visible successfully--> " + flag, true);
		Assert.assertEquals(flag, true);
	}

	public void clickOnBuzzTab() throws Exception {

		driver.findElement(By.xpath(buzzTabLoc)).click();
		Reporter.log("Buzz clicked successfully--> ", true);
		Thread.sleep(5000);
		boolean flag = driver.findElement(By.xpath(buzzHeaderLoc)).isDisplayed();
		Reporter.log("Buzz Page visible successfully--> " + flag, true);
		Assert.assertEquals(flag, true);
	}

}
