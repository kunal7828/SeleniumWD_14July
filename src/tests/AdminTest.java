package tests;

import org.testng.annotations.Test;

import common.BaseSetup;
import pages.AdminPage;
import pages.LeftPanelPage;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AdminTest extends BaseSetup{
	
	
  @Test
  public void verifyAdddUserFun() throws Exception {
	  LeftPanelPage leftPanelPage=new LeftPanelPage(driver);
	  leftPanelPage.clickOnAdminTab();
	  
	  AdminPage adminPage= new AdminPage(driver);
	  adminPage.clickOnAddButton();
	  
	  
  }
  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
