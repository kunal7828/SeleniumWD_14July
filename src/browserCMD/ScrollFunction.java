package browserCMD;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollFunction {
	
	
	
	WebDriver driver;

	public void openBrowser(String url) {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void scrollEndOfThePage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

	}
	
	public void scrollUp()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0)");

	}
			
	public void scrollByPixel()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");

	}
	
	public void scrollByWebElement()
	{
		WebElement element = driver.findElement(By.xpath("//div[text()=' Spin to Win ']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);

	}
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ScrollFunction obj=new ScrollFunction();
		obj.openBrowser("https://www.spicejet.com/");
		//obj.scrollEndOfThePage();
	   
	//	obj.scrollUp();
		Thread.sleep(5000);
		obj.scrollByWebElement();
		Thread.sleep(5000);
		

	}


}

