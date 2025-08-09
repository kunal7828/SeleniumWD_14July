package testNGExamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class DataProviderExample1 {
  @Test(dataProvider = "loginData")
  public void verifyLoginFunctionality(String username, String password) {
	  System.out.println("Username Value---->  "+  username  + "  Password Value---->  "+ password );
  }
  
  @Test(invocationCount = 5)
  public void test2(){
	  System.out.println("test2");
  }
  
  @Test(dataProvider = "adminRegistrationData")
  public void verifyAdminRegistration(String name, boolean roundTrip, int mobileNumber){
	  System.out.println(name+" "+roundTrip+" "+mobileNumber);
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("---------------------@BeforeMethod-------------------");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("---------------------@AfterMethod-------------------");
  }


  @DataProvider
  public Object[][] loginData() {
    return new Object[][] {
       { "admin", "admin123" },
       { "MAP", "MAP123" },
       { "MAP2", "MAP1234" },
       { "MAP3", "MAP12345" },
       { "MAP4", "MAP123456" },
    };
  }
  
  @DataProvider
  public Object[][] adminRegistrationData(){
	  return new Object[][] {
	       { "MAP", false, 123 },

	       { "Gaurav", false, 214 },
	       
	       { "Kunal", false, 215 },


		  
	  };
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("---------------------@BeforeClass-------------------");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("---------------------@AfterClass-------------------");
  }

}
