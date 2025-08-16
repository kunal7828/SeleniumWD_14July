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

	/*
	 * public void clickOnAdminTab() throws Exception { Thread.sleep(3000);
	 * driver.findElement(By.xpath(adminTabLoc)).click(); Thread.sleep(2000);
	 * Reporter.log("Admin clicked successfully--> ", true); boolean flag =
	 * driver.findElement(By.xpath(adminHeaderLoc)).isDisplayed();
	 * Reporter.log("Admin Page visible successfully--> " + flag, true); }
	 */
	
	
	public void clickOnLeftPanelTab(String tabName) throws Exception {
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()= '"+tabName+"']")).click();
		Reporter.log(tabName+" tab clicked successfully.");
		Thread.sleep(3000);
}
	
	public void validatePageVisibility(String dashboardName)
	{
	boolean flag=	driver.findElement(By.xpath("//h6[text()='"+dashboardName+"']")).isDisplayed();
	Reporter.log(dashboardName+" page visible successfully: "+flag, true);
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


}
