package basicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_Login_5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwjHt-njicaOAxUSoGMGHfXEGRkQPAgI");
		driver.manage().window().maximize();

		Thread.sleep(5000);

		driver.findElement(By.linkText("Gmail")).click();
//	driver.findElement(By.partialLinkText("Create new")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Sign in")).click();
//	driver.findElement(By.partialLinkText("Create new")).click();
		Thread.sleep(5000);

		driver.findElement(By.id("identifierId")).sendKeys("research.hike01@gmail.com");
		Thread.sleep(5000);

		driver.findElement(By.tagName("button")).click();

		Thread.sleep(5000);

		 //driver.findElement(By.id("recoveryIdentifierId")).sendKeys("Kunal@070891");
		 Thread.sleep(3000);

	

//	Thread.sleep(2000);

//	driver.quit();

	}

}
