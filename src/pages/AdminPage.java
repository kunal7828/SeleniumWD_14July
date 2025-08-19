package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import common.BaseSetup;
import common.SafeActions;

public class AdminPage extends SafeActions {

	/*
	 * WebDriver driver;
	 * 
	 * public AdminPage(WebDriver driver) { // TODO Auto-generated constructor stub
	 * System.out.println("This is a costructor block of AdminPage"); this.driver =
	 * driver; }
	 */
	//add button
	String addButtonLoc="//button[text()=' Add ']";
	
	
	
	// Select UserRole --- Admin / ESS
		String userRole1 = "Admin";
		String userRole2 = "ESS";

		//user role dropdown
		String userRoleLoc="//label[text()='User Role']//following::span[text()='" + userRole1 +"']";
		
		
		
		
		
		String userRoleSelectDDLoc="//label[text()='User Role']//following::span[1]";
	
	String employeeNameLoc="//label[text()='Employee Name']";
	
	String enterEmployeeNameLoc="//input[@placeholder='Type for hints...']";
	String selectEmployeeNameDropDownLoc="//input[@placeholder='Type for hints...']//following::span[1]";
	
	

	
	// Select Status --- Enabled / Disabled
	String status1 = "Enabled";
	String status2 = "Disabled";
	
	String statuSelectLoc="//label[text()='Status']//following::div[1]";
	String statusSelectDropDownLoc="//label[text()='Status']//following::span[1]";

	
	String enterUserNameLoc="//label[text()='Username']//following::input[1]";
	String enterPasswordLoc="//label[text()='Password']//following::input[1]";
	String enterConfirmpasswordLoc="//label[text()='Confirm Password']//following::input[1]";
	String clickOnSaveButtonLoc="//button[text()=' Save ']";
	
	String enterUserName2Loc="//label[text()='Username']//following::input[1]";
	String clickSearchButtonLoc="//button[text()=' Search ']";
	
	String clickOnEditButtonLoc="//div[text()='vaishali12']//following::i[2]";
	String userRoleLoc2="//label[text()='User Role']";
	String userRoleSelectLoc2="//label[text()='User Role']//following::div[1]";
	String userRoleSelectDropDronLoc2="//label[text()='User Role']//following::span[2]";
	String clickOnSaveButton2Loc="//button[text()=' Save ']";
	
	String deleteButtonLoc="//div[text()='vaishali12']//following::i[1]";
	String clickOnYesDeleteButtonLoc="//button[text()=' Yes, Delete ']";
	
	
	String adminTabL = "//span[text()='Admin']";

	String userRoleDropDownL = "//label[text()='User Role']//following::i[1]";
	String userRoleForFirstValueOfDDL = "//label[text()='User Role']//following::span[1]";

	String employeeNameL = "//input[@placeholder='Type for hints...']";
	String emplyeeSelectL = "//div[@role='option'and@class='oxd-autocomplete-option'][1]";
	
	String statusClickL = "//div[text()='-- Select --']";
	String enabledStatusL = "//span[text()='Enabled']";
	String usernameL = "//label[text()='Username']//following::input[1]";
	String passwordL = "//label[text()='Password']//following::input[1]";
	String confirmPasswordL = "//label[text()='Password']//following::input[2]";
	String saveButtonL = "//button[text()=' Save ']";
	String toasterMessageL = "div[class='oxd-toast-container oxd-toast-container--bottom']";
	String searchBarL = "//h5[text()='System Users']//following::input[1]";
	String searchButtonL = "//button[@type='submit']";
	String validateSearchL = "//div[text()='Actions']//following::div[8]";
	String updateButtonL = "//div[text()='Username']//following::button[2]";
	String deleteButtonL = "//div[text()='Username']//following::button[1]";
	String yesDeleteButtonL = "//button[text()=' Yes, Delete ']";
	String validateDeleteL = "//span[text()='No Records Found']";
	String userContainerL = "//div[@class='orangehrm-paper-container']";

	



	public void clickOnAddButton() throws Exception
	{			
		safeExplicitWaitForvisibilityOfElementLocated(addButtonLoc, 60);
		safeClick(addButtonLoc);
		Reporter.log("Add Button clicked Successfully.",true);
		
		/*driver.findElement(By.xpath(addButtonLoc)).click();
		Reporter.log("Add button clicked successfully.", true);
		Thread.sleep(5000);*/
	}
	
	
	  public void clickOnUserRoleDD() throws Exception {
	  
	  //driver.findElement(By.xpath(userRoleLoc)).click();
	  safeExplicitWaitForvisibilityOfElementLocated(userRoleLoc, 10);
	  safeClick(userRoleLoc);
	  Reporter.log("Clicked On Select User Role Dropdown.", true );
	  }
	 
	  public void selectValueFromUserRoleDD(String userRole) {
		  safeExplicitWaitForvisibilityOfElementLocated(userRoleSelectDDLoc, 10);
		  safeClick(userRoleSelectDDLoc);
		//  driver.findElement(By.xpath(userRoleSelectDDLoc)).click();
			  Reporter.log(userRole + "User Role Selected Successfully --> " + userRole,true); 
		  
		// driver.findElement(By.xpath("//label[text()='User Role']//following::span[text()='" + userRole +"']")).click(); 
		//  driver.findElement(By.xpath("//label[text()='User Role']//following::span[text()='ESS']")).click();  
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
