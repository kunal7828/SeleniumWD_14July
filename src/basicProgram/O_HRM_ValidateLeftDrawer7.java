package basicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class O_HRM_ValidateLeftDrawer7 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(5000);
		
		
		String CurrentPageUrl= driver.getCurrentUrl();
		System.out.println("URL: " + CurrentPageUrl);
		
		// Get the page title and print it
		String pageTitle = driver.getTitle();
		System.out.println("Page Title: " + pageTitle);
		
		

	}

}
