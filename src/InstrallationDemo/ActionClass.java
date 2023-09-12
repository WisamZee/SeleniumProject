package InstrallationDemo;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionClass {

//	Actions class - 
//	- provides a very good support to handle certain user interactions with elements like hover over, right click and drag and drop, etc:
//	Actions class is useful when it's needed, but it's not used much often as the modern web development is focused on user experiences.
//	The most used actions class methods are:
//	1. .moveToElement()- most used one.
//	2. .click(webElement)
//	3. .doubleClick(webElement)
	
	public static void main(String[] args) throws InterruptedException {
			actionClass();
		//tesk();
	}

	public static void actionClass()  {
	 
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//	go to Etsy.com
	driver.get("https://www.etsy.com/");
	Actions Action = new Actions(driver);

//	Hover Over on Jewelry & Accessories
WebElement jA =	driver.findElement(By.xpath("//span[contains(text(), 'Jewelry & Accessories')]"));
Action.moveToElement(jA).build().perform();

//Mouseover on Bags & Purses
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), 'Bags & Purses')][1]")));
WebElement bP =	driver.findElement(By.xpath("//span[contains(text(), 'Bags & Purses')][1]"));
Action.moveToElement(bP).build().perform();

//	Mouseover to Shoulder Bags
wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Shoulder Bags")));
WebElement sB =	driver.findElement(By.linkText("Shoulder Bags"));
Action.moveToElement(sB).click().build().perform();

//	Click on the shoulder bags

//	Verify you are on the Shoulder bags page
if (driver.findElement(By.xpath("//h1[text()='Shoulder Bags']")).isDisplayed()) {
	System.out.println("we are in Shoulder Bags page");
}else {
	System.out.println("we are Not in Shoulder Bags page");
}
}
	
	
	
public static void tesk() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Actions action = new Actions(driver);
		
		// got to http://practice.primetech-apps.com/practice/drag-and-drop
		driver.get("http://practice.primetech-apps.com/practice/drag-and-drop");
		// drag the text to empty box
		
		WebElement sourceTextElement = driver.findElement(By.id("text"));
		WebElement sourceTextAreaElement = driver.findElement(By.id("textarea"));
		WebElement sourceNumberElement = driver.findElement(By.id("Number"));
		
	
		WebElement targetBoxElement = driver.findElement(By.id("dropzone"));
		
		// remember: whenever you use actions function, you need to finish the function with perform() function.
		
		// .perform() - can be used alone when there is only one actions functions used.
		// .build().perform() - is for more than one chained actions functions.
		action.dragAndDrop(sourceTextElement, targetBoxElement).build().perform();
		action.dragAndDrop(sourceTextAreaElement, targetBoxElement).build().perform();
		action.dragAndDrop(sourceNumberElement, targetBoxElement).build().perform();
	
	}






}
