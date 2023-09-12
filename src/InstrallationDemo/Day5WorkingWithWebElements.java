package InstrallationDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5WorkingWithWebElements {

	public static void main(String[] args) throws InterruptedException {
		
	
		//workingWithWebElements();
		//navigateExamples();
		findElements();
	}
	
	public static void findElements () throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("http://saucedemo.com/");
		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("standard_user");
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("secret_sauce");
		
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
		Thread.sleep(1000);
		
		List<WebElement> itemsPrice = driver.findElements(By.cssSelector(".inventory_item_price"));
		for (int i = 0; i < itemsPrice.size() ; i++) {
			System.out.println( itemsPrice.get(i).getText());
//			WebElement singleItem = itemsPrice.get(i);
//			String priceOfItem = singleItem.getText();
//			System.out.println("priceOfItem");
		}
		
		
		
	}

	
		public static void navigateExamples() throws InterruptedException {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.get("http://amazon.com/");
			WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
			searchBox.sendKeys("Coffe mug");
			searchBox.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			driver.navigate().back();
			WebElement search2Box = driver.findElement(By.id("twotabsearchtextbox"));
			search2Box.sendKeys("pretty coffee mug");
			search2Box.sendKeys(Keys.ENTER);
			driver.navigate().back();
			Thread.sleep(1000);

			driver.navigate().forward();
			driver.navigate().refresh();
			
		
		
		}
		

		public static void workingWithWebElements() throws InterruptedException {
			
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("http://google.com/");
		
		
		WebElement inputBox = driver.findElement(By.name("q"));
		inputBox.sendKeys("Coffe mug");
		inputBox.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		searchBox.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		Thread.sleep(3000);

		searchBox.sendKeys(Keys.DELETE);
		searchBox.sendKeys("Amazon");
		Thread.sleep(2000);

		searchBox.sendKeys(Keys.ENTER);
	//	searchBox.sendKeys(Keys.chord(Keys.CONTROL,"a"));
	//	searchBox.sendKeys(Keys.DELETE);

		
		
		
		
	}

}
