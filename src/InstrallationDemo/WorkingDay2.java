package InstrallationDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingDay2 {

	public static void main(String[] args) throws InterruptedException {

//		System.setProperty("webdriver.chrome.driver", 
//				"C:\\Users\\waist\\OneDrive\\Desktop\\wab tool\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		/*
		driver.get("https://facebook.com");
		WebElement emailfield = driver.findElement(By.name("email"));
		emailfield.sendKeys("automation");

		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("automation");
		
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		*/
		
		/*
		driver.get("https://amazon.com");
		WebElement backToSchoolLink = driver.findElement(By.linkText("Clinic"));
		backToSchoolLink.click();
		
		
		driver.get("https://amazon.com");
		WebElement partialText = driver.findElement(By.partialLinkText("footwear on Shopbop"));
		partialText.click();
		*/
		
		
		driver.get("https://amazon.com");
		WebElement Off  = driver.findElement(By.className("nav-swn-text"));
		Off.click();
		
		Thread.sleep(1000);
	}

}
