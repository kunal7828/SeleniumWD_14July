package testNGExamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class RetryExample2 {
	static int count=0;
  @Test(retryAnalyzer = retryAnalyzerJavaClsImplement.class)
  public void fverifyLoginFunctionality() {
	  System.out.println("Test Case 1");
	  count++;
	  System.out.println("Count Value--->"+count);
	  if (count==2) {
		  Assert.assertEquals(false, false);
		
	} else {
	   Assert.fail();

	}
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("@AfterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("@BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("@AfterClass");
  }

}
