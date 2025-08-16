package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class AdminPage {

	WebDriver driver;

	public AdminPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		System.out.println("This is a costructor block of AdminPage");
		this.driver = driver;
	}
	String addButtonLoc="//button[text()=' Add ']";
	
	public void clickOnAddButton()  {
		driver.findElement(By.xpath(addButtonLoc)).click();
		Reporter.log("Click on add button successfully.",true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
