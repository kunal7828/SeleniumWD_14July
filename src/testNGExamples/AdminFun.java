package testNGExamples;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class AdminFun {
	
	WebDriver driver;
  @Test (priority = 1, enabled = true, description = "Verify login fun with valid data, Data set: Admin: admin123.")

  public void verifyLogin() throws Exception   {

		// Login page data
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		WebElement dashboardElement= driver.findElement(By.xpath("//h6[text()='Dashboard']"));
		System.out.println(dashboardElement.isDisplayed()); 
		System.out.println(dashboardElement.getText());
		System.out.println("Admin link on left drawer clicked successfully.");
		Thread.sleep(1000);	
     	System.out.println("verifyLoginFun");
     	   	 	 
  }
  


  
  
  
  
  @Test (priority = 2, enabled = true, description = "Verify Add User functionality with valid datat, Data set: Admin: admin123.")
  public void verifyAddUserFun() {
	  
	  System.out.println("verifyAddUserFun");
  }
  
  @Test (priority = 3, enabled = true, description = "Verify Add User functionality with valid datat, Data set: Admin: admin123.")
  public void verifyUpdateUserFun() {
	  System.out.println("verifyUpdateUserFun");
  }
  
  
  
  @Test (priority = 4, enabled = true, description = "Verify Add User functionality with valid datat, Data set: Admin: admin123.")
  public void verifySearchUserFun() {
	  System.out.println("verifySearchUserFun");
  }
 
  @Test (priority = 5, enabled = true, description = "Verify Add User functionality with valid datat, Data set: Admin: admin123.")
  public void verifyDeleteUserFun() {
	  System.out.println("verifyDeleteUserFun");
  }
  
  
  
  @BeforeClass   
  public void openBrowser()throws Exception
  {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();		
		Thread.sleep(5000);
	  System.out.println("openBrowser");
  }
	

  @AfterClass
  public void closeBrowser() {
	  driver.close();	  
	  System.out.println("closeBrowser");
	
  }

}




/*

//-------------------------------------------------------------------------------------------------------------------------------------------------		
//Verify Add User Functionality


//--------------------------------------------------------------------------------------------------------------------------------------------------		


//-------------------------------------------------------------------------------------------------------------------------------------------------		

		// 
public void verifyAdmin() throws Exception {

	driver.findElement(By.xpath("//span[text()='Admin']")).click();
	Thread.sleep(2000);
	WebElement adminElement= driver.findElement(By.xpath("//h6[text()='Admin']"));
	System.out.println(adminElement.isDisplayed()); 
	System.out.println(adminElement.getText());
	System.out.println("Admin/User Management page on top of the page is displayed.");
}

//-------------------------------------------------------------------------------------------------------------------------------------------------		
//Verify Add User Functionality


    public void clickOnAddUserButton() throws Exception {
    Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()=' Add ']")).click();
	Thread.sleep(1000);
	WebElement adminElement= driver.findElement(By.xpath("//h6[text()='Admin']"));
	System.out.println(adminElement.isDisplayed()); 
	System.out.println(adminElement.getText());
	System.out.println("Admin Add user role form page displayed.");
	//click on select role drop down
	driver.findElement(By.xpath("//label[text()='User Role']//following::div[1]")).click();
	Thread.sleep(1000);
	//Select add user role
	driver.findElement(By.xpath("//label[text()='User Role']//following::span[1]")).click();
	//select 
	driver.findElement(By.xpath("//label[text()='Employee Name']//following::input[1]")).sendKeys("a");
	Thread.sleep(5000);
	//Enter Emoloyee Name
	driver.findElement(By.xpath("//label[text()='Employee Name']//following::span[1]")).click();
	Thread.sleep(1000);	
	
	driver.findElement(By.xpath("//label[text()='Status']//following::div[1]")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//span[text()='Enabled']")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//label[text()='Username']//following::input[1]")).sendKeys("kunal121");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//label[text()='Password']//following::input[1]")).sendKeys("Kunal@123");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//label[text()='Confirm Password']//following::input[1]")).sendKeys("Kunal@123");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	Thread.sleep(1000);
	
	System.out.println("Add user Functionality is working proper");
    }
    
//----------------------------------------------------------------------------------------------------------------------------------------------		
	// verifySearchUserByUserDetails  Functionality
	
	public void verifySearchUserByUserDetails()throws Exception {
		
		
	//	driver.findElement(By.xpath("//label[text()='Username']//following::input[1]")).click();
		
		
		 WebElement searchUsername= driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']//following::input[1]"));
		 searchUsername.click();
		 searchUsername.sendKeys("Om Puri");
		Thread.sleep(1000);				
		
		driver.findElement(By.xpath("//label[text()='User Role']//following::div[1]")).click();
		driver.findElement(By.xpath("//label[text()='User Role']//following::span[2]")).click();
		
		 WebElement searchEmployeeName= driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']//following::input[2]"));
		 searchEmployeeName.click();
		 searchEmployeeName.sendKeys("DBMR1234");
	    Thread.sleep(1000);
		
	    	driver.findElement(By.xpath("//label[text()='Employee Name']//following::input[1]")).click();
		driver.findElement(By.xpath("//label[text()='Employee Name']//following::input[1]")).sendKeys("a");
		
	    
	    
		driver.findElement(By.xpath("//label[text()='Status']//following::div[1]")).click();
		driver.findElement(By.xpath("//label[text()='Status']//following::span[1]")).click();
		
		driver.findElement(By.xpath("//button[text()=' Search ']")).click();
		Thread.sleep(8000);
			
		System.out.println("Search Functionality is working proper  1 record found");
            driver.close();
    }
	
	
//------------------------------------------------------------------------------------------------------------------------------------					
	// verifyUpdateUser  Functionality
	
	public void verifyUpdateUserFun() throws Exception {
		driver.findElement(By.xpath("//h6[text()='Admin']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']//following::i[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Employee Name']//following::button[2]")).click();
				
		Thread.sleep(2000);
		
		//User role
		driver.findElement(By.xpath("//label[text()='User Role']//following::div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='User Role']//following::span[1]")).click();
		Thread.sleep(2000);
			
		
		//change password			
		driver.findElement(By.xpath("//label[text()='Change Password ?']//following::i[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Password']//following::input[1]")).sendKeys("Kunal@123");
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//label[text()='Confirm Password']//following::input[1]")).sendKeys("Kunal@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		Thread.sleep(5000);
		}

	
//-------------------------------------------------------------------------------------------------------------------------------------			
	public void verifyDeleteUserFun() throws Exception
	{
    //	verifySearchUserByUserDetails();
			
			driver.findElement(By.xpath("//h6[text()='Admin']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@type='submit']//following::i[4]")).click();
			Thread.sleep(3000);
			
	//		driver.findElement(By.xpath("//div[text()='Abir Munna']//following::button[1]")).click();
	//		Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()=' Yes, Delete ']")).click();
			Thread.sleep(3000);
			}

	
//------------------------------define main methods here----------------------------------------------------------------------------------------		
	
	
	   public static void main(String[] args) throws Exception {
		   OrangeHrmCSUD1 orangeHrmCSUD =new OrangeHrmCSUD1();
		   orangeHrmCSUD.openBrowser();
		   orangeHrmCSUD.verifyLogin();
		   orangeHrmCSUD.verifyAdmin();
		   
		   
		 //  orangeHrmCSUD.clickOnAddUserButton();
 //        orangeHrmCSUD.verifySearchUserByUserDetails();
		//   orangeHrmCSUD.verifyUpdateUserFun();
		   orangeHrmCSUD.verifyDeleteUserFun();
		   
	   }
	
}

*/





/* AdminFun sir example notes 
 * package testNGExample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class AdminFun {
	WebDriver driver;

	@Test
	public void verifyAddUserFun() throws Exception {
		driver.findElement(By.xpath("//a[@href='/admin/viewAdminModule']//child::span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'][1]")).click();
		Thread.sleep(1000);
        driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-up-fill oxd-select-text--arrow']//following::span[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Type for hints...']//preceding::i[1]")).click();  
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='oxd-select-dropdown --positon-bottom']//following::span[text()='Admin']")).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("s");   
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']//following::span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']//following::i")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='oxd-select-dropdown --positon-bottom']//following::span[text()='Enabled']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']//following::input[1]")).sendKeys("SAGAR");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']//following::input[2]")).sendKeys("sagar@3432");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']//following::input[3]")).sendKeys("sagar@3432");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(8000);
	
	}

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeClass
	public void openBrowserAndLogin() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);

	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

}

 */







