package basicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMLeftPanelUsingMethodAndXpath14 {

	WebDriver driver;

	public void openBrowser(String Url) throws Exception {
		driver = new ChromeDriver();
		driver.get(Url);
		driver.manage().window().maximize();
		Thread.sleep(3000);

		String headerText = driver.findElement(By.xpath("//h5[text()='Login']")).getText();
		boolean Tag = driver.findElement(By.xpath("//h5[text()='Login']")).isDisplayed();

		System.out.println("Login Page Displayed Successfully-------> " + headerText);
		System.out.println("Login Page Displayed Successfully-------> " + Tag);

	}

	public void enterUserName(String userNameValue) throws Exception {

		driver.findElement(By.xpath("//input[@name='username' and @placeholder='Username']")).sendKeys(userNameValue);
		Thread.sleep(1000);
		System.out.println("Username Entered Successfully-------> " + userNameValue);
	}

	public void enterPassword(String passwordValue) throws Exception {
		driver.findElement(By.xpath("//input[@type='password' or @name='password']")).sendKeys(passwordValue);
		System.out.println("Password Entered Successfully-------> " + passwordValue);
		Thread.sleep(1000);

	}

	public void clickOnLogin() throws Exception {
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(3000);
		System.out.println("Click On Login Successfully");

	}

	public void hitURL(String Url) {

		driver.navigate().to(Url);
	}

	public void errorMsgValidate() throws Exception {

		String errorText = driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
		Thread.sleep(1000);
		Boolean errorMsg = driver.findElement(By.xpath("//p[text()='Invalid credentials']")).isDisplayed();
		Thread.sleep(1000);
		System.out.println("Error Msg Displayed Successfully" + errorText);
		System.out.println("Error Msg Displayed Successfully" + errorMsg);

	}

	public void validateLoginPage() {

		String Text1 = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
		Boolean Header1 = driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
		System.out.println("Dashobard Page Displayed Successfully------> " + Text1);
		System.out.println("Dashobard Page Displayed Successfully------> " + Header1);
		String CurrentPageUrl= driver.getCurrentUrl();
		System.out.println("URL: " + CurrentPageUrl);
		// Get the page title and print it
				String pageTitle = driver.getTitle();
				System.out.println("Page Title: " + pageTitle);

	}
	
	public void clickOnAdmin() throws Exception {

		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(2000);

		

	}
	
	public void validateAdminPage()
	{
		String Text1 = driver.findElement(By.xpath("//h6[text()='Admin']")).getText();
		Boolean Header1 = driver.findElement(By.xpath("//h6[text()='Admin']")).isDisplayed();
		System.out.println("Admin Page Displayed Successfully------> " + Text1);
		System.out.println("Admin Page Displayed Successfully------> " + Header1);
	}

	public void clickOnPIM() throws Exception {

		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		Thread.sleep(2000);
	}
	
	public void validatePIMPage()
	{
		String Text1 = driver.findElement(By.xpath("//h6[text()='PIM']")).getText();
		Boolean Header1 = driver.findElement(By.xpath("//h6[text()='PIM']")).isDisplayed();
		System.out.println("PIM Page Displayed Successfully------> " + Text1);
		System.out.println("PIM Page Displayed Successfully------> " + Header1);
	}
	
	

	public void clickOnLeave() throws Exception {

		driver.findElement(By.xpath("//span[text()='Leave']")).click();
		Thread.sleep(2000);

		

	}
	
	public void validateLeavePage()
	{
		String Text1 = driver.findElement(By.xpath("//h6[text()='Leave']")).getText();
		Boolean Header1 = driver.findElement(By.xpath("//h6[text()='Leave']")).isDisplayed();
		System.out.println("Leave Page Displayed Successfully------> " + Text1);
		System.out.println("Leave Page Displayed Successfully------> " + Header1);
	}
	
	
	public void clickOnTime() throws Exception {

		driver.findElement(By.xpath("//span[text()='Time']")).click();
		Thread.sleep(2000);

		
	}
	
	public void validateTimePage()
	{
		String Text1 = driver.findElement(By.xpath("//h6[text()='Time']")).getText();
		Boolean Header1 = driver.findElement(By.xpath("//h6[text()='Time']")).isDisplayed();
		System.out.println("Time Page Displayed Successfully------> " + Text1);
		System.out.println("Time Page Displayed Successfully------> " + Header1);

	}
	


	public void clickOnRecruitment() throws Exception {

		driver.findElement(By.xpath("//span[text()='Recruitment']")).click();
		Thread.sleep(2000);



	}
	
	public void validateRecruitmentPage()
	{
		String Text1 = driver.findElement(By.xpath("//h6[text()='Recruitment']")).getText();
		Boolean Header1 = driver.findElement(By.xpath("//h6[text()='Recruitment']")).isDisplayed();
		System.out.println("Recruitment Page Displayed Successfully------> " + Text1);
		System.out.println("Recruitment Page Displayed Successfully------> " + Header1);

	}
	

	public void clickOnMyInfo() throws Exception {

		driver.findElement(By.xpath("//span[text()='My Info']")).click();
		Thread.sleep(2000);	

	}
	
	public void validateMyInfoPage()
	{
		String Text1 = driver.findElement(By.xpath("//h6[text()='PIM']")).getText();
		Boolean Header1 = driver.findElement(By.xpath("//h6[text()='PIM']")).isDisplayed();
		System.out.println("My Info Page Displayed Successfully------> " + Text1);
		System.out.println("My Info Page Displayed Successfully------> " + Header1);

	}
	
	public void clickOnPerformance() throws Exception {

		driver.findElement(By.xpath("//span[text()='Performance']")).click();
		Thread.sleep(2000);

		

	}

	public void validatePerformancePage()
	{
		String Text1 = driver.findElement(By.xpath("//h6[text()='Performance']")).getText();
		Boolean Header1 = driver.findElement(By.xpath("//h6[text()='Performance']")).isDisplayed();
		System.out.println("Performance Page Displayed Successfully------> " + Text1);
		System.out.println("Performance Page Displayed Successfully------> " + Header1);

	}
	
	
	
	public void clickOnDirectory() throws Exception {

		driver.findElement(By.xpath("//span[text()='Directory']")).click();
		Thread.sleep(2000);

		

	}
	public void validateDirectoryPage()
	{
		String Text1 = driver.findElement(By.xpath("//h6[text()='Directory']")).getText();
		Boolean Header1 = driver.findElement(By.xpath("//h6[text()='Directory']")).isDisplayed();
		System.out.println("Directory Page Displayed Successfully------> " + Text1);
		System.out.println("Directory Page Displayed Successfully------> " + Header1);

	}
	
	
	public void clickOnMaintenance(String passwordValue) throws Exception {

		driver.findElement(By.xpath("//span[text()='Maintenance']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password' and @name='password']")).sendKeys(passwordValue);
		driver.findElement(By.xpath("//button[text()=' Confirm ' and @type='submit']")).click();
		Thread.sleep(3000);

	}
	
	
	public void validateMaintenancePage()
	{
		String Text1 = driver.findElement(By.xpath("//h6[text()='Maintenance']")).getText();
		Boolean Header1 = driver.findElement(By.xpath("//h6[text()='Maintenance']")).isDisplayed();
		System.out.println("Maintenance Page Displayed Successfully------> " + Text1);
		System.out.println("Maintenance Page Displayed Successfully------> " + Header1);

	}
	
	

	public void clickOnClaim() throws Exception {

		driver.findElement(By.xpath("//span[text()='Claim']")).click();
		Thread.sleep(2000);

		

	}
	
	public void validateClaimPage()
	{
		String Text1 = driver.findElement(By.xpath("//h6[text()='Claim']")).getText();
		Boolean Header1 = driver.findElement(By.xpath("//h6[text()='Claim']")).isDisplayed();
		System.out.println("Claim Page Displayed Successfully------> " + Text1);
		System.out.println("Claim Page Displayed Successfully------> " + Header1);

	}

	public void clickOnBuzz() throws Exception {

		driver.findElement(By.xpath("//span[text()='Buzz']")).click();
		Thread.sleep(2000);

		

	}
	
	public void validateBuzzPage()
	{
		String Text1 = driver.findElement(By.xpath("//h6[text()='Buzz']")).getText();
		Boolean Header1 = driver.findElement(By.xpath("//h6[text()='Buzz']")).isDisplayed();
		System.out.println("Buzz Page Displayed Successfully------> " + Text1);
		System.out.println("Buzz Page Displayed Successfully------> " + Header1);

	}

	public void clickOnProfile() {

		// Claim Buzz
	}

	public void closeBrowser() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String validUsername = "Admin";
		String validPassword = "admin123";
		String invalidUserName = "Kunal";
		String invalidPassword = "Sharma";
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

		HRMLeftPanelUsingMethodAndXpath14 obj = new HRMLeftPanelUsingMethodAndXpath14();
		obj.openBrowser(url);
		// obj.enterUserName(invalidUserName);
		// obj.enterPassword(invalidPassword);
		// obj.clickOnLogin();
		// obj.errorMsgValidate();
		// obj.hitURL(url);

		obj.enterUserName(validUsername);
		obj.enterPassword(validPassword);
		obj.clickOnLogin();
		obj.validateLoginPage();
		
		obj.clickOnAdmin();
		obj.validateAdminPage();

		obj.clickOnPIM();
		obj.validatePIMPage();

		obj.clickOnLeave();
		obj.validateLeavePage();

		obj.clickOnTime();
		obj.validateTimePage();

		obj.clickOnRecruitment();
		obj.validateRecruitmentPage();

		obj.clickOnMyInfo();
		obj.validateMyInfoPage();

        obj.clickOnPerformance();
		obj.validatePerformancePage();
		
		obj.clickOnDirectory();
		obj.validateDirectoryPage();
		
		

		obj.clickOnMaintenance(validPassword);
		obj.validateMaintenancePage();

		
		obj.clickOnClaim();
		obj.validateClaimPage();

		obj.clickOnBuzz();
		obj.validateBuzzPage();


		obj.closeBrowser();
		
		
		
		

	}

}
