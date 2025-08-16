package tests;

import org.testng.annotations.Test;

import common.BaseSetup;
import pages.LeftPanelPage;

public class LeftPanelTest extends BaseSetup {
  @Test(priority=1)
  public void verifyAdminPageVisiblity() throws Exception {
	  
	  LeftPanelPage leftPanelPage= new LeftPanelPage(driver);
	  leftPanelPage.clickOnLeftPanelTab("Admin");
	  leftPanelPage.validatePageVisibility("Admin");
  }
  
  @Test(priority=2)
 public void verifyPIMPageVisiblity() throws Exception {
	  
	  LeftPanelPage leftPanelPage= new LeftPanelPage(driver);
	  leftPanelPage.clickOnLeftPanelTab("PIM");
	  leftPanelPage.validatePageVisibility("PIM");
  }
  
  @Test(priority=3)
 public void verifyLeavePageVisiblity() throws Exception {
	  
	  LeftPanelPage leftPanelPage= new LeftPanelPage(driver);
	  leftPanelPage.clickOnLeftPanelTab("Leave");
	  leftPanelPage.validatePageVisibility("Leave");
 }
  
  @Test(priority=4)
 public void verifyTimePageVisiblity() throws Exception {
	  
	  LeftPanelPage leftPanelPage= new LeftPanelPage(driver);
	  leftPanelPage.clickOnLeftPanelTab("Leave");
	  leftPanelPage.validatePageVisibility("Leave");
} 
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
