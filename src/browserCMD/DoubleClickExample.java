package browserCMD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickExample {
	public static void main(String[] args) {
       

        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");

        WebElement element = driver.findElement(By.id("myElementId"));

        Actions actions = new Actions(driver);
        actions.doubleClick(element).perform();

        driver.quit();
    }
}
