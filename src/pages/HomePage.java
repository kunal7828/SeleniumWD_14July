package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class HomePage {
	
	WebDriver driver;

	
	public HomePage(WebDriver driver) {  //page me banayege constructor parameterized
		System.out.println("This is constructor block of HomePage");
		this.driver=driver;  //jese  hi ye banayege test cls me error ayegi test case ke object me driver pass karo
	}
	
	String dashboardLoc="//h6[text()='Dashboard']";
	
	
	public void validateDashboard() {
		boolean flag= driver.findElement(By.xpath(dashboardLoc)).isDisplayed();
		Reporter.log("Home page isible successfully"+flag);
	}
	
	public void validateLogOut() throws Exception {
		driver.findElement(By.xpath("//img[@alt='profile picture']")).click();
		Reporter.log("Clicked on profile icon", true);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//img[@alt='profile picture']//following::a[4]")).click();
		Reporter.log("Clicked on logout link.", true);
		Thread.sleep(5000);

		String LoginPage = driver.findElement(By.xpath("//h5[text()='Login']")).getText();
		boolean VerifyLogout = driver.findElement(By.xpath("//h5[text()='Login']")).isDisplayed();
		Reporter.log("Login Page Displayed-------------->" + VerifyLogout, true);
	}
	
}
