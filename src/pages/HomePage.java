package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import common.SafeActions;

public class HomePage extends SafeActions {
	/*
	 * WebDriver driver;
	 * 
	 * 
	 * public HomePage(WebDriver driver) { //page me banayege constructor
	 * parameterized System.out.println("This is constructor block of HomePage");
	 * this.driver=driver; //jese hi ye banayege test cls me error ayegi test case
	 * ke object me driver pass karo }
	 */
	String dashboardLoc = "//h6[text()='Dashboard']";
	String profilePicLoc = "//img[@alt='profile picture']";
	String logOutLinkLoc = "//img[@alt='profile picture']//following::a[4]";
	String loginPageHeaderLoc = "//h5[text()='Login']";

	public void validateDashboard() {
//		boolean flag= driver.findElement(By.xpath(dashboardLoc)).isDisplayed();
		boolean flag= safeIsDisplayed(dashboardLoc);
		Reporter.log("Home page is visible successfully" +flag , true);
	}

	public void validateLogOut() throws Exception {
		// driver.findElement(By.xpath(profilePicLoc)).click();

		safeClick(profilePicLoc);
		Reporter.log("Clicked on profile icon", true);
		Thread.sleep(2000);

		// driver.findElement(By.xpath(logOutLinkLoc)).click();
		safeClick(logOutLinkLoc);
		Reporter.log("Clicked on logout link.", true);
		Thread.sleep(5000);

		safeGetText(loginPageHeaderLoc);

		safeIsDisplayed(loginPageHeaderLoc);
//		boolean VerifyLogout = driver.findElement(By.xpath("//h5[text()='Login']")).isDisplayed();
		Reporter.log("Login Page Displayed-------------->", true);
	}

}
