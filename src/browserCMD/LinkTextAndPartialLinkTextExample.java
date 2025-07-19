package browserCMD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextAndPartialLinkTextExample {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	Thread.sleep(5000);
	
	//driver.findElement(By.linkText("Create new account")).click();
	driver.findElement(By.partialLinkText("Create new")).click();

	
	

	
	
	
	
	
	
	Thread.sleep(2000);
	
	
	driver.quit();
	

	}


}
