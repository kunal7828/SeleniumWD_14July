package basicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class paraBank_Signup_6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		 driver.findElement(By.linkText("Register")).click();
		 Thread.sleep(5000);
		
		
		/*
		 * driver.findElement(By.name("username")).sendKeys("Admin");
		 * driver.findElement(By.name("password")).sendKeys("admin123");
		 * Thread.sleep(5000);
		 * 
		 * // driver.findElement(By.
		 * className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button"
		 * )).click(); //org.openqa.selenium.InvalidSelectorException
		 * driver.findElement(By.tagName("button")).click();
		 * 
		 * String CurrentPageUrl= driver.getCurrentUrl(); System.out.println("URL: " +
		 * CurrentPageUrl);
		 * 
		 * // Get the page title and print it String pageTitle = driver.getTitle();
		 * System.out.println("Page Title: " + pageTitle);
		 */		
		
		
		
		driver.quit();

		
		
		

	}

}
