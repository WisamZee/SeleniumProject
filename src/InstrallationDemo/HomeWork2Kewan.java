package InstrallationDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork2Kewan {

	public static void main(String[] args) throws InterruptedException {
//			System.setProperty("webdriver.chrome.driver", 
//					"C:\\Users\\waist\\OneDrive\\Desktop\\wab tool\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		
		
			 fridayHomeWork();
		
		}
			public static void fridayHomeWork() throws InterruptedException {
				
			
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				String actualUrl = "http://practice.primetech-apps.com/";
				driver.get(actualUrl);
				Thread.sleep(500);
		
				WebElement practiceBtn = driver.findElement(By.id("elements"));
				practiceBtn.click();
				
				WebElement textBoxButton = driver.findElement(By.id("text-box")); textBoxButton.click();
				Thread.sleep(500);
				WebElement firstNameBox = driver.findElement(By.id("firstName"));
				WebElement lastNameBox = driver.findElement(By.id("lastName"));
				WebElement emailBox = driver.findElement(By.id("email"));
				WebElement passwordBox = driver.findElement(By.id("password"));
		
				String actualFName = "PrimeTech";
				String actualLName = "school";
				String actualEmail = "PrimeTech@Schooll.com";
				String actualPass = "12345";
				
				
				firstNameBox.sendKeys(actualFName);
				lastNameBox.sendKeys(actualLName);
				Thread.sleep(500);

				emailBox.sendKeys(actualEmail);
				passwordBox.sendKeys(actualPass);
				Thread.sleep(1000);
				
				WebElement subBtn = driver.findElement(By.className("btn-primary"));
				subBtn.click();
				
				String expectedFName = firstNameBox.getAttribute("value");
				String expectedLast = lastNameBox.getAttribute("value");
				String expectedemail= emailBox.getAttribute("value");
				String expectedPass= passwordBox.getAttribute("value");
				Thread.sleep(1000);

				
				if(expectedFName.equals(actualFName)) {
					System.out.println("First name passed: " + expectedFName);
				}else {
					System.out.println("Test faill");
				

				if (expectedLast.equals(actualLName)) {
					System.out.println("Last name is passed: " + expectedLast);
				} else {
					System.out.println("Test faill");
					}

				if (expectedemail.equals(actualEmail)) {
					    System.out.println("Email passed: " + expectedemail);
				} else {
					    System.out.println("Test faill");
					}

				if (expectedPass.equals(actualPass)) {
					    System.out.println("Password passed: " + expectedPass);
				} else {
					    System.out.println("Test faill");
					}
				
				
				Thread.sleep(2000);		
				//driver.quit();
				
	}

}
}
