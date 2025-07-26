package makeMyTrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MakeMyTrip1 {
	
	WebDriver driver;
	
	
public void openBrowser() throws Exception {
	driver = new FirefoxDriver();
	driver.get("https://www.makemytrip.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
	driver.getCurrentUrl();
	driver.findElement(By.xpath("//p[text()='Login or Create Account']")).getText();
	
	
}

   public void selectJourneyFrom() throws Exception {
	
	driver.findElement(By.xpath("//input[@id='fromCity']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='From']//following::p[20]")).click();
	Thread.sleep(2000);

	
}

public void selectJourneyTo() throws Exception {
	
	driver.findElement(By.xpath("//input[@id='toCity']")).click();  
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='To']//following::p[6]")).click();
	Thread.sleep(2000);

	
}

public void departureDate() throws Exception {
	
	driver.findElement(By.xpath("//div[contains(text(), 'July 2025')]//following::p[53]")).click();
	Thread.sleep(2000);
	
}


public void clickOnSearchButton() throws Exception {
	
	driver.findElement(By.xpath("//a[text()='Search']")).click();
	Thread.sleep(2000);

	
}


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MakeMyTrip1 obj= new MakeMyTrip1();
		obj.openBrowser();
		obj.selectJourneyFrom();
		obj.selectJourneyTo();
		obj.departureDate();
		obj.clickOnSearchButton();

	}

}
