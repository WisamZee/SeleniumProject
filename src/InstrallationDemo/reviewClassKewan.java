package InstrallationDemo;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class reviewClassKewan {
	public static void main(String[] args) throws InterruptedException {
		
	testCase1();
	}

			public static void testCase1() throws InterruptedException {
				WebDriver driver = new ChromeDriver();
				
				
		  
				String url = "https://www.thetestingworld.com/testings";
				driver.get(url);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
				WebElement registerBtn = driver.findElement(By.id("tab1"));
				System.out.println("The Register Button is Displayed " + registerBtn.isDisplayed());
				WebElement userName = driver.findElement(By.xpath("//input[@name='fld_username']"));
				String userN = "SamZee";
				WebElement email = driver.findElement(By.xpath("//input[@name='fld_email']"));
				String userEmail = "Wiastalzubide@gmail.com";
				WebElement passWord = driver.findElement(By.xpath("//input[@name='fld_password']"));
				WebElement confirmPassW = driver.findElement(By.xpath("//input[@name='fld_cpassword']"));
				String userPassw = "S@12345";
				
				userName.sendKeys(userN);
				email.sendKeys(userEmail);
				
				passWord.sendKeys(userPassw);
				confirmPassW.sendKeys(userPassw);
				
				
				WebElement dOb = driver.findElement(By.xpath("//input[@name='dob']"));
				String userDOB = "11/24/1988";
				
				//dob.sendKeys(userDOB);
				//dob.sendKeys(Keys.ENTER);
				dOb.sendKeys(Keys.chord(userDOB, Keys.ENTER));
				
				WebElement phoneNumber = driver.findElement(By.cssSelector("input[name='phone']"));
				String userPHnumber = "5715015158";
				phoneNumber.sendKeys(userPHnumber);
				
				WebElement address = driver.findElement(By.cssSelector("input[name='address']"));
				String userAddress = "14157 Catbird dr";
				address.sendKeys(userAddress);
				
				WebElement radioAddresstype = driver.findElement(By.cssSelector("input[value='office']"));
				radioAddresstype.click();
				
				WebElement sexDD = driver.findElement(By.name("sex"));
				Select sel0 = new Select(sexDD);
				sel0.selectByValue("1");
				
				
				WebElement countryDD = driver.findElement(By.id("countryId"));
				Select sel = new Select(countryDD);
//				sel.selectByIndex(2);
//				Thread.sleep(2000);
//				sel.selectByValue("4");
//				Thread.sleep(2000);
				sel.selectByVisibleText("United States");
				WebElement stateDD = driver.findElement(By.id("stateId"));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
				wait.until(ExpectedConditions.elementToBeClickable(stateDD));
				
				
				Select sle1 = new Select(stateDD);
				sle1.selectByValue("3974");

				
				
				WebElement cityDD = driver.findElement(By.id("cityId"));
				
				WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(5));
				wt.until(ExpectedConditions.elementToBeClickable(cityDD));
				
				Select sle2 = new Select(cityDD);
				sle2.selectByVisibleText("Reston");
				

				WebElement zipCode = driver.findElement(By.cssSelector("input[name='zip']"));
				String userZipCode = "11001";
				zipCode.sendKeys(userZipCode);
				

				WebElement termsAndCond = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
				termsAndCond.click();
				WebElement logInBtn = driver.findElement(By.xpath("//*[@value='Sign up']"));
				logInBtn.click();
				
				String actualMsg = "User is successfully Register. Now You can Login";
				WebElement expectedMsg = driver.findElement(By.xpath("//*[@id='tab-content1']/div/text()"));
				
		//	System.out.println(actualMsg + "VS" +expectedMsg);

				
		
	}

}
