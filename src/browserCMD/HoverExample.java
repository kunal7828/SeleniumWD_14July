package browserCMD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverExample {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/account/login?ret=/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement element1 = driver.findElement(By.xpath("//span[text()='Electronics']"));
		// WebElement element2 = driver.findElement(By.id("element2Id"));

		Actions actions = new Actions(driver);
		
		actions.moveToElement(element1).perform();

		Thread.sleep(5000);

		driver.quit();
	}
}