package browserCMD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElementExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		WebElement username= 	driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		
		WebElement password= driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		
	//	driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
		//org.openqa.selenium.InvalidSelectorException 
		driver.findElement(By.tagName("button")).click();

		String CurrentPageUrl= driver.getCurrentUrl();
		System.out.println("URL: " + CurrentPageUrl);
		
		// Get the page title and print it
		String pageTitle = driver.getTitle();
		System.out.println("Page Title: " + pageTitle);
		
		driver.quit();

		
		
		

	}

}
