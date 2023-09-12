package InstrallationDemo;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iFrameDemo {

	public static void main(String[] args) throws InterruptedException {
		
		iframeDemo();
	
	}

	public static void iframeDemo() throws InterruptedException {
	    //Test case 2: 
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		//go to http://practice.primetech-apps.com/practice/frames
	driver.get("http://practice.primetech-apps.com/practice/frames");
	
		//Verify that there is a page header text as "Frames".
	if (driver.findElement(By.xpath("//h3[text()='Frames']")).isDisplayed()) {
		System.out.println("I am on the main frame page");
	}else {
		System.out.println("I am Not on the main frame page");
	}
	
		//Find the iFrame element and switch into it
	driver.switchTo().frame("iframe1");
		//Find firstname, lastname, address, city, state, and zipcode, and type relative information.
	driver.findElement(By.id("firstName")).sendKeys("Sam");
	driver.findElement(By.id("lastName")).sendKeys("Mars");
	driver.findElement(By.id("address")).sendKeys("11000 Mars St");
	driver.findElement(By.id("city")).sendKeys("Mars City");
	
	Select letsselect = new Select(driver.findElement(By.id("state")));
	letsselect.selectByVisibleText("Virginia");
	
	driver.findElement(By.id("zipCode")).sendKeys("22030");
	
	//	Click on submit button.
	Actions Action = new Actions(driver);
	
	WebElement subBtn = driver.findElement(By.cssSelector(".btn-primary"));
	Action.moveToElement(subBtn).build().perform();
	Thread.sleep(3000);
	Action.sendKeys(Keys.ENTER).build().perform();
	
	//Action.sendKeys(subBtn, "Enter").build().perform();
	//Action.click(subBtn).perform();
	//sDown.click();
    //sDown.contextClick(subBtn);
	//driver.findElement(By.className("btn-primary")).click();
	//driver.findElement(By.xpath("//button[text()='Submit']")).click();
	
	//Verify you see "You have submitted below information:" message.
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='You have submited below information:']")));
	
	if (driver.findElement(By.xpath("//h3[text()='You have submited below information:']")).isDisplayed()) {
		System.out.println("Text is displayed");
	}else {
		System.out.println("Text is NOT displayed");
	}
	
		//Switch back to main frame
	driver.switchTo().defaultContent();
		//Verify that there is a page header text as "Frames".
	
	if (driver.findElement(By.xpath("//h3[text()='Frames']")).isDisplayed()) {
		System.out.println("I am on the main frame page");
	}else {
		System.out.println("I am Not on the main frame page");
	}
}
	
	
	
}
