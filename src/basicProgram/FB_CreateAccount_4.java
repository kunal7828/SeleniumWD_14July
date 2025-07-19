package basicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_CreateAccount_4 {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	Thread.sleep(5000);
	
	//driver.findElement(By.linkText("Create new account")).click();
	driver.findElement(By.partialLinkText("Create new")).click();
	Thread.sleep(5000);
	
	driver.findElement(By.name("firstname")).sendKeys("Kunal");
	driver.findElement(By.name("lastname")).sendKeys("sharma");
	
	driver.findElement(By.className("_8esa")).click();
	
	driver.findElement(By.name("reg_email__")).sendKeys("kunal1@mailinator.com");
	
	driver.findElement(By.name("reg_passwd__")).sendKeys("Kunal@123");
	
//	driver.findElement(By.tagName("button")).click();
	driver.findElement(By.name("websubmit")).click();
	
	
	

	
	

	
	
	
	
	
	
	Thread.sleep(2000);
	
	
	driver.quit();
	

	}


}
