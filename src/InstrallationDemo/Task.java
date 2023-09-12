package InstrallationDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com");
		//Task 1

		/*
		WebElement emailfield = driver.findElement(By.name("email"));
		emailfield.sendKeys("automation");

		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("automation");
		
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		*/
		
		//Task2
		
		WebElement createButton = driver.findElement(By.linkText("Create new account"));
		createButton.click();
		Thread.sleep(1000);

		
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Automation");

		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("Automation");

		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("Automation");

		WebElement passsword = driver.findElement(By.name("reg_passwd__"));
		passsword.sendKeys("Automation");

		WebElement singUp = driver.findElement(By.name("websubmit"));
		singUp.click();
		
		

		
	

	
		/*
		
		
		
		
		driver.get("https://amazon.com");
		WebElement backToSchoolLink = driver.findElement(By.linkText("Clinic"));
		backToSchoolLink.click();
		
		
		driver.get("https://amazon.com");
		WebElement partialText = driver.findElement(By.partialLinkText("footwear on Shopbop"));
		partialText.click();
	
		
		
		driver.get("https://amazon.com");
		WebElement Off  = driver.findElement(By.className("nav-swn-text"));
		Off.click();
		
		Thread.sleep(1000);
			*/
	}

}
