package InstrallationDemo;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aug_16_Kewan {

	public static void main(String[] args) throws InterruptedException {
		
	//	alert();
	// test_case1();
	// test_case2();
	 test_case3();
	}
	public static void alert() throws InterruptedException  {
		 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://demo.automationtesting.in/Alerts.html");
	
		driver.findElement(By.className("btn-danger")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		
		
		
}
	public static void test_case1() throws InterruptedException  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com");
		
//		Go to https://testautomationpractice.blogspot.com
		WebElement alertBtn = driver.findElement(By.xpath("//button[contains(text(), 'Alert')]"));
		alertBtn.click();
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
Thread.sleep(2000);
	WebElement confirmBox = driver.findElement(By.xpath("//button[contains(text(), 'Confirm Box')]"));
	confirmBox.click();
	Alert alert3 = driver.switchTo().alert();
	alert3.dismiss();
	Thread.sleep(2000);

		WebElement prompt = driver.findElement(By.xpath("//button[contains(text(), 'Prompt')]"));
		prompt.click();
		Alert alert4 = driver.switchTo().alert();
		alert4.sendKeys("Sam Zee");
		Thread.sleep(3000);
		alert4.accept();
		
		driver.close();

	}	
	public static void test_case2() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		Go to https://testautomationpractice.blogspot.com/
	
		driver.get("https://testautomationpractice.blogspot.com");
		

//			Get the main window ID and store it in a String called mainWindowId.
		String mainWID = driver.getWindowHandle();
		System.out.println(mainWID);
//			Click on the 'New Browser Window' button
		WebElement newBrowserBtn = driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
	//	WebElement newBrowserBtn = driver.findElement(By.cssSelector("button[onclick='myFunction()']"));

		newBrowserBtn.click();
//			Get window IDs and store it into a Set
		Set <String> allWindowIds = driver.getWindowHandles();
//			
		//Get the first window ID from the Set and Verify it matches with the main window id in step 2. 

			
		
		//
		for (String str : allWindowIds) {
			if(str.equals(mainWID)) {System.out.println("MainWindow Id" + str);}
		}
//			Switch to the second window.
		for (String str : allWindowIds) {
			if(!str.equals(mainWID)) {driver.switchTo().window(str);}
		}
		String secandWinId = "";
		for (String str : allWindowIds) {
			if(!str.equals(mainWID)) {secandWinId = str;}
			System.out.println("secand Window Id " + secandWinId );
		}
//			Verify that there is a Featured Products  is Displayed.
		
		System.out.println(driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed());
		
		driver.close();
//			Close the window,  Switch back to the main window
		driver.switchTo().window(mainWID);
//			 Verify you are on the main window by confirming the text "Automation Testing Practice" is Matching in the home page
		String mainPagetxt = driver.findElement(By.xpath("//h1[contains(text(),'Automation Testing Practice')]")).getText();
		System.out.println(mainPagetxt);
	}
	public static void test_case3() throws InterruptedException {
//		Step 1: Go to https://testautomationpractice.blogspot.com
//		Step 2: Go to "Frames" practice tab.
//		Step 3: Locate the iFrame ID and switch to it by ID.
//		Step 4: Locate the text box for "Name",  Gender buttons, DOB  
//		Step 5: Fill all the required information for all fields 
//		Step 6: Locate the Job dropdown and select the correct value.
//		Step 7: Locate the "Submit" button and Click on it. 
//		Step 8: Switch back to the Main frame.
//		Step 9: Get and verify the text on the top of the home page "Automation Testing Practice"
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com");
		
		WebElement iframe = driver.findElement(By.id("frame-one796456169"));
		driver.switchTo().frame(iframe);

		WebElement textBox = driver.findElement(By.id("RESULT_TextField-0"));
		textBox.sendKeys("SamZee");
		
		WebElement gender = driver.findElement(By.xpath("// label[@for='RESULT_RadioButton-1_0']"));
		gender.click();
		WebElement doB = driver.findElement(By.className("calendar_field"));
		doB.sendKeys("24/11/1988");
		WebElement job = driver.findElement(By.id("RESULT_RadioButton-3"));
		Select jobSel = new Select(job);
		jobSel.selectByVisibleText("Automation Engineer");
		
		driver.findElement(By.id("FSsubmit")).click();
				
	}
	
	
	
	
}
