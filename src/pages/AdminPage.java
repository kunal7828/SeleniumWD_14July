package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import common.SafeActions;

public class AdminPage extends SafeActions {

	/*
	 * WebDriver driver;
	 * 
	 * public AdminPage(WebDriver driver) { // TODO Auto-generated constructor stub
	 * System.out.println("This is a costructor block of AdminPage"); this.driver =
	 * driver; }
	 */
	String addButtonLoc="//button[text()=' Add ']";
	
	String userRoleLoc="//label[text()='User Role']//following::div[1]";

	

	


	public void clickOnAddButton()  {
//		driver.findElement(By.xpath(addButtonLoc)).click();
		
		safeClick(addButtonLoc);
		Reporter.log("Click on add button successfully.",true);
	}
	
	public void selectUserRoleDD(String userRole1) throws Exception {
		
//		driver.findElement(By.xpath(userRoleLoc)).click();
		Reporter.log("Clicked On Select User Role Dropdown.", true );
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//label[text()='User Role']//following::span[text()='" + userRole1 + "']")).click();
//				driver.findElement(By.xpath("//label[text()='User Role']//following::span[text()='ESS']")).click();
		Reporter.log(userRole1 + "User Role Selected Successfully --> " + userRole1, true);
		Thread.sleep(2000);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
