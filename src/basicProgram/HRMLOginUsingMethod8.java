package basicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMLOginUsingMethod8 {
	
	WebDriver driver;
	
	
	public void openBrowser()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	
	public void enterUserName( String userNameValue)
	{
		driver.findElement(By.name("username")).sendKeys(userNameValue);
	}
	
	public void enterPassword(String passwordValue)
	{
		driver.findElement(By.name("password")).sendKeys(passwordValue);
	}

	public void clickOnLogin()
	{
		driver.findElement(By.tagName("button")).click();
	}
	
	public void validateHomePage()
	{
		String CurrentPageUrl= driver.getCurrentUrl();
		System.out.println("URL: " + CurrentPageUrl);
		
		// Get the page title and print it
		String pageTitle = driver.getTitle();
		System.out.println("Page Title: " + pageTitle);
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		HRMLOginUsingMethod8 hRMLOginUsingMethod8=new HRMLOginUsingMethod8();
		
		hRMLOginUsingMethod8.openBrowser();
		Thread.sleep(5000);
		hRMLOginUsingMethod8.enterUserName("Admin");
		Thread.sleep(2000);
		hRMLOginUsingMethod8.enterPassword("admin123");
		Thread.sleep(2000);
		hRMLOginUsingMethod8.clickOnLogin();
		Thread.sleep(2000);
		hRMLOginUsingMethod8.validateHomePage();
		Thread.sleep(2000);

	}

}
