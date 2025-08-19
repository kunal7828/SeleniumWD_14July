package browserCMD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {
	public static void main(String[] args) throws Exception {
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();

        // Switch to the frame containing the draggable elements
        driver.switchTo().frame(0);

        WebElement draggableElement = driver.findElement(By.id("draggable"));
        WebElement droppableElement = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);
        Thread.sleep(5000);
        actions.dragAndDrop(draggableElement, droppableElement).perform();
        Thread.sleep(5000);

       // driver.quit();
    }
}
