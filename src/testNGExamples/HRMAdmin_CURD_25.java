package testNGExamples;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class HRMAdmin_CURD_25 {
  
	
	@Test
	public void verifyDeleteUserFunctionality() throws Exception {

		driver.findElement(By.xpath("//label[text()='Username']//following::input[1]")).sendKeys(username1);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[text()=' Search ']")).click();
		System.out.println("search button clicked Successfully");
		Thread.sleep(3000);

		String UsernameInRecordFound = driver.findElement(By.xpath("//div[text()='Actions']//following::div[8]"))
				.getText();
		System.out.println("Username Found Successfully-------->" + UsernameInRecordFound);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[text()='Actions']//following::i[2]")).click();
		System.out.println("Delete icon clicked Successfully");

		driver.findElement(By.xpath("//button[text()=' Yes, Delete ']")).click();
		System.out.println("clicked on yes button.");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//p[text()='Successfully Deleted']")).getText();
		Boolean userDeletedSuccessMsg = driver.findElement(By.xpath("//p[text()='Successfully Deleted']"))
				.isDisplayed();
		System.out.println("User is deleted Successfully--------------->" + userDeletedSuccessMsg);

		Boolean noRecordsFoundMsg = driver.findElement(By.xpath("//p[text()='Successfully Deleted']")).isDisplayed();
		System.out.println("User is deleted Successfully--------------->" + noRecordsFoundMsg);
		Thread.sleep(3000);

	}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
