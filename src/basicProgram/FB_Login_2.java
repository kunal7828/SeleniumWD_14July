package basicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Login_2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	Thread.sleep(5000);
	
	driver.findElement(By.id("email")).sendKeys("kunal1@mailinator.com");
	
	driver.findElement(By.name("pass")).sendKeys("Kunal@123");
	Thread.sleep(2000);
	//clear password
	driver.findElement(By.name("pass")).clear();
	Thread.sleep(2000);
	//again type password
	driver.findElement(By.name("pass")).sendKeys("Kunal@123");
	Thread.sleep(3000);
	//now click on login button
	driver.findElement(By.tagName("button")).click();

	Thread.sleep(3000);
	driver.quit();
	
	

	}

}
