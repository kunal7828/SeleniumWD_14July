package tests;

import org.testng.annotations.Test;

import common.BaseSetup;
import pages.AdminPage;
import pages.LeftPanelPage;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AdminTest extends BaseSetup{
	
	// Select UserRole --- Admin / ESS
	String userRole1 = "Admin";
	String userRole2 = "ESS";
	
	// Select Status --- Enabled / Disabled
	String status1 = "Enabled";
	String status2 = "Disabled";
	
	
  @Test
  public void verifyAdddUserFun() throws Exception {
	  
	  LeftPanelPage leftPanelPage=new LeftPanelPage(driver);
	//  leftPanelPage.clickOnAdminTab();
	  leftPanelPage.clickOnLeftPanelTab("Admin");
	  
//	  AdminPage adminPage= new AdminPage(driver);
	  AdminPage adminPage= new AdminPage();

	  adminPage.clickOnAddButton();
	//  adminPage.clickOnUserRoleDD();
//	  adminPage.selectValueFromUserRoleDD(userRole1);
 
  }


}
