package common;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sync {
	
	public static WebDriver driver;
	
	public  Sync () {
		
		this.driver=BaseSetup.driver;
		System.out.println("Sync driver value--->"+this.driver);
		
	}
	
	
	
	public void safeImplicitWait(int second)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));//Gobal wait for all elements
	}
	
	/**
	 * Fluent wait allows more complex configurations. 
	 * It defines the maximum amount of time to wait for a condition, 
	 * as well as the frequency with which to check the condition. 
	 * 
	 * Furthermore, users can configure it to ignore specific types of exceptions while waiting, 
	 * such as NoSuchElementExceptions when searching for an element on the page.
	 * */
	
	public void safeExplicitWaitForvisibilityOfElementLocated(String locator, int second) {
		
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(second));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
	
	}
	
	
	
	
	public void safeFluentWait(String locator, int maxtimeOutSecond, int pollingEverySecond )
	{
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		        .withTimeout(Duration.ofSeconds(maxtimeOutSecond))
		        .pollingEvery(Duration.ofSeconds(pollingEverySecond))
		        .ignoring(NoSuchElementException.class);
        //lambda expression
		//WebElement foo = wait.until(driver -> driver.findElement(By.xpath(locator)));
		WebElement foo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
	}

}
