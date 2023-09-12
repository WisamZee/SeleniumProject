package InstrallationDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	public static void main(String[] args) throws InterruptedException {
		
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://etsy.com");

	driver.findElement(
				//	By.xpath("//button[contains(@class,'select-signin')]"));
					By.cssSelector(".select-signin")).click();
					Thread.sleep(1000);

	driver.findElement(By.cssSelector(".select-register")).click();
					Thread.sleep(1000);
			
			
			driver.findElement(By.cssSelector("#join_neu_email_field")).sendKeys("jon.dow@gmail.com");
			driver.findElement(By.cssSelector("#join_neu_first_name_field")).sendKeys("jon");
			driver.findElement(By.cssSelector("#join_neu_password_field")).sendKeys("jkhgkjdgfgsd");
			Thread.sleep(500);
			
			driver.findElement(By.cssSelector("button[name='submit_attempt']")).click();
			Thread.sleep(3000);
	}
}



