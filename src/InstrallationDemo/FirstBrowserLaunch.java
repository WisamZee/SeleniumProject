package InstrallationDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstBrowserLaunch {

	public static void main(String[] args) {
	
		// on windows computer, this is how it looks like
		//System.setProperty("webdriver.chrome.driver", 
		//"/Users/primetech/Documents/selenium_tools/chromedriver_mac64/chromedriver.exe");
				
		
		// we are creating an object here
		// WebDriver is an interface being a reference type
		// ChromeDriver is a class being an object type here.				
			
		
		// navigate to amazon 
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		// type for coffee mug in search field
	    // 1. find the element of the search field
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
   	    // 2. sendKeys() to the element we found
		searchBox.sendKeys("coffee mug");
		// click on search button
		  // 1. find the search button element
		WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
		  // 2. click on the element
		searchButton.click();
	
		
		
		
		
		
	
	}

	
}
