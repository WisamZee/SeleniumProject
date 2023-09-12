package InstrallationDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Friday_Aug_11 {

	public static void main(String[] args) throws InterruptedException {
	
//		login();
//		Select();
		alerthandle();
}

	public static void login() throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			
			
	  
			String url = "https://www.thetestingworld.com/testings";
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			 WebElement login = driver.findElement(By.xpath("//*[@for='tab2']"));
		        login.click();
			
			WebElement userName = driver.findElement(By.xpath("//input[@name='_txtUserName']"));
			String userN = "SamZee";
			userName.sendKeys(userN);
			
			WebElement passWord = driver.findElement(By.xpath("//input[@name='_txtPassword']"));
			String userPassw = "S@12345";
			passWord.sendKeys(userPassw);
			
			WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Login']"));
			loginBtn.click();
			
			WebElement homeBtn = driver.findElement(By.xpath("//*[contains(text(),'Home')]"));
			
			Thread.sleep(1000);
			
			Actions letdoaction = new Actions(driver);
			letdoaction.moveToElement(homeBtn).perform();
			
			Thread.sleep(1000);
			
			WebElement userListbtn = driver.findElement(By.xpath("//*[contains(text(),'User List')]"));
			userListbtn.click();

			List <WebElement> usersLst = driver.findElements(By.className("items"));
			System.out.println(usersLst.size());
			for (int i = 0; i < usersLst.size(); i++) {
				System.out.println(usersLst.get(i).getText());
}
}
			
		
		
	public static void Select() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
				
				
		  
	String url = "https://www.thetestingworld.com/testings";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
	WebElement login = driver.findElement(By.xpath("//*[@for='tab2']"));
	       login.click();
				
	WebElement userName = driver.findElement(By.xpath("//input[@name='_txtUserName']"));
		String userN = "SamZee";
		userName.sendKeys(userN);
				
	WebElement passWord = driver.findElement(By.xpath("//input[@name='_txtPassword']"));
		String userPassw = "S@12345";
		passWord.sendKeys(userPassw);
				
	WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Login']"));
		loginBtn.click();
		
	WebElement list = driver.findElement(By.className("pickData"));	
	Select slt1 = new Select(list);
	slt1.selectByIndex(0);
	slt1.selectByIndex(1);
	slt1.selectByVisibleText("Alice");
	slt1.selectByVisibleText("Isabella");
	slt1.selectByVisibleText("Manuela");
//		Get all the selected options using getAllSelectedOptions
	
	List <WebElement> selectedoption = slt1.getAllSelectedOptions();
	System.out.println(selectedoption.get(0).getText());
//		Add the selected names to the second list. 
	driver.findElement(By.className("pAdd")).click();
//		Select all the names from the second list and deselect the last two names. 
//		Use wait for 3 seconds then Locate Remove All button and click on it.
	Thread.sleep(1000);
	WebElement listofselecteduser = driver.findElement(By.className("pickListResult"));
	Select slt2 = new Select(listofselecteduser);
	slt2.selectByIndex(0);
	slt2.selectByIndex(1);
	slt2.selectByIndex(2);
	slt2.selectByIndex(3);
	slt2.selectByIndex(4);
	
	Thread.sleep(2000);
	slt2.deselectByIndex(4);
	slt2.deselectByIndex(3);
			
			
}
	
	public static void alerthandle() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String url = "https://demoqa.com/alerts";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(1000);
		driver.findElement(By.id("promtButton")).click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.sendKeys("SamZee");
		Thread.sleep(2000);

		alert.accept();
		
	}	
	
	
	
	
	
	
	
}