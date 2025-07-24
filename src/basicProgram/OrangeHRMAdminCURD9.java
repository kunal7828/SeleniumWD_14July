package basicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMAdminCURD9 {

	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(5000);
	driver.manage().window().maximize();
	driver.findElement(By.name("username")).sendKeys("Admin");
	Thread.sleep(5000);
	System.out.println("Username fields taking input");
	driver.findElement(By.name("password")).sendKeys("admin123");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	System.out.println("Click on login button");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
	System.out.println("Clicked on admin tab");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
	System.out.println("Add button");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div[1]/div[2]/i")).click();
	Thread.sleep(3000);
	System.out.println("open dropdown");
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div[2]/div[3]")).click();
	System.out.println("Select value from dropdown");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]")).sendKeys("Test");
	Thread.sleep(6000);
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div[2]/div[1]")).click();
	Thread.sleep(6000);
	System.out.println("");
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div[1]/div[2]/i")).click();
	Thread.sleep(6000);
	System.out.println("click on dropdown button");
	driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div[2]")).click();
	Thread.sleep(3000);
	System.out.println("Dropdown option selected");
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")).sendKeys("Admin111");
	Thread.sleep(4000);
	System.out.println("Username field took inputs");
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")).sendKeys("Admin@123");
	Thread.sleep(4000);
	System.out.println("Password field takes inputs");
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys("Admin@123");
	Thread.sleep(4000);
	System.out.println("Confirm password is working correctly");
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
	Thread.sleep(10000);
	System.out.println("Save button working successfully");
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	js1.executeScript("window.scrollBy(0,1000)");
	System.out.println("Scroll down working");
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[20]/div/div[6]/div/button[2]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")).sendKeys("1");
	Thread.sleep(4000);
	System.out.println("Update Username is not working");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
	Thread.sleep(10000);
	
	
	driver.quit();	
	}
}