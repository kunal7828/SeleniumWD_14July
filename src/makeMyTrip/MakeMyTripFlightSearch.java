package makeMyTrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MakeMyTripFlightSearch {

    WebDriver driver;
    WebDriverWait wait;

    public void openBrowser() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Dismiss login popup
        Thread.sleep(3000);
        Actions action = new Actions(driver);
        action.moveByOffset(10, 10).click().build().perform();
    }

    public void searchFlight() throws Exception {
        // Select From City
        driver.findElement(By.id("fromCity")).click();
        WebElement fromInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='From']")));
        fromInput.sendKeys("Delhi");
        Thread.sleep(1000);
        fromInput.sendKeys(Keys.ENTER);

        // Select To City
        driver.findElement(By.id("toCity")).click();
        WebElement toInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='To']")));
        toInput.sendKeys("Mumbai");
        Thread.sleep(1000);
        toInput.sendKeys(Keys.ENTER);

        // Select Departure Date
        driver.findElement(By.xpath("//label[@for='departure']")).click();
        WebElement activeDate = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//div[@class='DayPicker-Day'][not(contains(@class,'disabled'))]")));
        activeDate.click();

        // Click Search
        WebElement searchBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Search']")));
        searchBtn.click();

        // Wait for results
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".listingCard")));

        System.out.println("Flight search completed successfully.");
    }

    public static void main(String[] args) throws Exception {
        MakeMyTripFlightSearch obj = new MakeMyTripFlightSearch();
        obj.openBrowser();
        obj.searchFlight();
    }
}
    
