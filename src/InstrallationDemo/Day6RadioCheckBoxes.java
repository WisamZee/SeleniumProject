package InstrallationDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6RadioCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
	
	//	RadioCheckBox();
	//	Tesk1();
	//	Tesk2();
	//	Tesk3();
	//	Tesk4();
}
	
	public static void RadioCheckBox () throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("http://facebook.com/");
		WebElement createAccount = driver.findElement(By.linkText("Create new account"));
		createAccount.click();
		Thread.sleep(1000);
		
		WebElement maleRadio = driver.findElement(By.xpath("//label[text()='Male']"));
		if (maleRadio.isDisplayed()) {
			System.out.println("The male radio button is displayed!");
		}else {
			System.out.println("The male radio button is NOT displayed!");
		}
		
		if (maleRadio.isEnabled()) {
			System.out.println("The male radio button is enabled!");
		}else {
			System.out.println("The male radio button is NOT enabled!");
		}
		
		if(maleRadio.isSelected()) {
			System.out.println("Male radio button is already selected");
		}else {
			// if not, then select the Male radio button
			maleRadio.click();
			}
			}
		
	public static void Tesk1 () throws InterruptedException{
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.get("http://indeed.com/");
			WebElement whatSearch = driver.findElement(By.xpath("//input[@id=\"text-input-what\"]"));
			if (whatSearch.isEnabled()) {
				System.out.println("The what Search box is enabled");
			}else {
				System.out.println("The what Search box is NOT enabled");
			}
			if (whatSearch.isDisplayed()) {
				System.out.println("The what Search box is displayed");
			}else {
				System.out.println("The what Search box is NOT displayed");
			}
	
			WebElement whereSearch = driver.findElement(By.xpath("//input[@id=\"text-input-where\"]"));
			if (whereSearch.isEnabled()) {
				System.out.println("The where Search box is enabled");
			}else {
				System.out.println("The where Search box is NOT enabled");
			}
			if (whereSearch.isDisplayed()) {
				System.out.println("The where Search box is displayed");
			}else {
				System.out.println("The where Search box is NOT displayed");
			}
			}
		
	public static void Tesk2 () throws InterruptedException{
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.get("http://practice.primetech-apps.com/practice/radio-button");
		
			WebElement radioButton = driver.findElement(By.xpath("//div[@id=\"countries\"]"));
			
			if (radioButton.isEnabled()) {
				System.out.println("The Radio Button is enabled");
			}else {
				System.out.println("The Radio Button is NOT enabled");
			}
			if (radioButton.isDisplayed()) {
				System.out.println("The Radio Button is displayed");
			}else {
				System.out.println("The Radio Button is NOT displayed");
			}
			
			WebElement radioButtonUSA = driver.findElement(By.xpath("//div[@id=\"countries\"]"));

			if(radioButtonUSA.isSelected()) {
				System.out.println("The Radio Button is already selected");
			}else {
				
				radioButton.click();
			}
		    }
				
	public static void Tesk3 () throws InterruptedException{
		
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
				driver.get("http://practice.primetech-apps.com/practice/radio-button");
		        //Find those available radio buttons.
				List<WebElement> radioButtons = driver.findElements(By.cssSelector(".form-check-input"));
		        //Check if it's displayed and enabled,
				//if true, check if it's selected, if false select the button and check if it's selected.
				for (WebElement radio : radioButtons) {
				if (radio.isDisplayed() && radio.isEnabled()) {
						System.out.println("Radio button is enabled and displayed!");
				if (radio.isSelected()) {
							System.out.println("Radio button is selected!");
				}else {
						radio.click();
				}
				}else {
						System.out.println("Radio button is NOT enabled and displayed!");
				}
					
				if (radio.isSelected()) {
						System.out.println("Radio button is selected now!");
				}else {
						System.out.println("Radio button is NOT selected now!");
				}
				Thread.sleep(1000);
				}}
				
	public static void Tesk4 () throws InterruptedException{


			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        // go to http://practice.primetech-apps.com/practice/check-box
			driver.get("http://practice.primetech-apps.com/practice/check-box");
	        // find the checkboxes and verify if it's displayed, if true, then verify if it's enabled, if true, 
			// verify if it's selected, if false, then check the boxes. Then verify if it's checked.
			List<WebElement> checkBoxes = driver.findElements(By.className("form-check-input"));
			for (WebElement checkbox : checkBoxes) {
				if (checkbox.isDisplayed()) {
					System.out.println("Checkbox is displayed.");
					if (checkbox.isEnabled()) {
						System.out.println("Checkbox is enabled.");
						if (checkbox.isSelected()) {
							System.out.println("Checkbox is selected.");
						}else {
							checkbox.click();
						}
					}else {
						System.out.println("Checkbox is NOT enabled.");
					}
				}else {
					System.out.println("Checkbox is NOT displayed.");
				}
				
				if (checkbox.isSelected()) {
					System.out.println("Checkbox is selected now.");
				}else {
					System.out.println("Checkbox is still NOT selected.");
				}
				Thread.sleep(1000);
			}
	       
		}
		
		
		
		
	}
	




