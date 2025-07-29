package testNGExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class webActionUtility_17 {
	
	static WebDriver driver;
	
	public void webClick(String locator) {  //method ko parameterized bana diya
		
		driver.findElement(By.xpath(locator)).click();
		System.out.println("clicked successfully");
	}
	
	public void webType(String locator, String value) {
		
		driver.findElement(By.xpath(locator)).sendKeys(value);
		System.out.println("Enter Value Successfully"+ value);
		
	}
	//Framework pros
/*	line of code reduce
	framework ko structure mil jata hai  mvn folder structure provide karta hai
	framework ki reutilize kar skte hai

1.file upload karne ke liye alag folder ------- resource folder me keep karege
2. yadi koi main code me file upload karna hai to -----folder alag rhega
3. test folder
4. main folder

*/
	
	public static void main(String[] args) { //short cut type psvm() ----> ctrl+enter from suggestion enter first value
		
		driver.findElement(By.xpath("RESETBUTTON")).click();
		
		driver.findElement(By.xpath("SUBMITBUTTON")).click();
		
		driver.findElement(By.xpath("ADDBUTTON")).click();
		
		driver.findElement(By.xpath("RESETBUTTON")).click();

	}

}
