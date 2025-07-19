package basicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import browserCMD.webElementExample;

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
	
	//For Date Select using selectByIndex in three lines of code.
	
	WebElement dayWeb= driver.findElement(By.id("day"));
	
	Select daySelect= new Select(dayWeb);
	
	daySelect.selectByIndex(6);
	
	
	//For Month Select using selectByValue in one line of code.
	new Select(driver.findElement(By.name("birthday_month"))).selectByValue("8");
	
	
	//For Month Select using selectByValue in one Line
	
	new Select(driver.findElement(By.name("birthday_year"))).selectByVisibleText("1995");
		
	driver.findElement(By.className("_8esa")).click();
	
	driver.findElement(By.name("reg_email__")).sendKeys("kunal1@mailinator.com");
	
	driver.findElement(By.name("reg_passwd__")).sendKeys("Kunal@123");
	
//	driver.findElement(By.tagName("button")).click();
	driver.findElement(By.name("websubmit")).click();
		
	Thread.sleep(2000);
	
	
	
	
	
	driver.quit();
	

	}


}
