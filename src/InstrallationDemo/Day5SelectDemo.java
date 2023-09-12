package InstrallationDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day5SelectDemo {

		public static void main(String[] args) throws InterruptedException {
			
			Tesk1();
	}
		
	public static void Tesk1 () throws InterruptedException{
				
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
			driver.get("http://practice.primetech-apps.com/practice/select-menu");
			WebElement language = driver.findElement(By.id("language"));
			
			Select selectDemo = new Select(language);
			
			List<WebElement> allItem = selectDemo.getOptions() ;
			 for (WebElement option : allItem) {
		       	System.out.println(option.getText());
			   
		}
//Select By Visible Text			
			selectDemo.selectByVisibleText("French");
			Thread.sleep(2000);
			
//Select By Index
		    selectDemo.selectByIndex(4);
		    Thread.sleep(2000);
		    
//Select By Value
		    selectDemo.selectByValue("Spanish");
		    Thread.sleep(2000);

		  WebElement firstSelect =   selectDemo.getFirstSelectedOption();
		  System.out.println("First Selected item is:" + firstSelect.getText() );
		  Thread.sleep(2000);
		  
		

}}
