package InstrallationDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCss {

	public static void main(String[] args) throws InterruptedException {
	
		
		//Test case:
		//Go to etsy.com
	WebDriver driver = new ChromeDriver();
	driver.get("https://etsy.com");
		//Click on Sign in.
	WebElement signinBtn = driver.findElement(
					By.xpath("//button[contains(@class,'select-signin')]"));
			signinBtn.click();
			Thread.sleep(1000);
			    //Click on Register.
			WebElement registerBtn = 
					driver.findElement(By.xpath("//button[contains(@class,'select-register')]"));
			registerBtn.click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[contains(@id,'join_neu_email_field')]")).sendKeys("jon.dow@gmail.com");
			driver.findElement(By.xpath("//input[contains(@id,'join_neu_first_name_field')]")).sendKeys("jon");
			driver.findElement(By.xpath("//input[contains(@id,'join_neu_password_field')]")).sendKeys("jkhgkjdgfgsd");
			Thread.sleep(500);
			
			driver.findElement(By.xpath("//button[contains(text(),'Register')]")).click();
			Thread.sleep(3000);
	}

}
