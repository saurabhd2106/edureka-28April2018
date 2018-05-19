package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Guru99Project {
	WebDriver driver;
	String url = "http://demo.guru99.com/v4";
	
	public void invokeBrowser(String browserType){
		
		if(browserType.equals("chrome")){
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Saurabh Dhingra\\workspace\\libs\\chromeDriver36\\chromedriver.exe");
			
			// \n \t -- escape character
			driver = new ChromeDriver();
			
			} else if(browserType.equals("edge")){
				System.setProperty("webdriver.edge.driver",
						"C:\\Users\\Saurabh Dhingra\\workspace\\libs\\MicrosoftWebDriver.exe");
				
				// \n \t -- escape character
				driver = new EdgeDriver();
			} else if(browserType.equals("firefox")){
				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\Saurabh Dhingra\\workspace\\libs\\geckodriver-v0.20.1-win64\\geckodriver.exe");
				driver = new FirefoxDriver();
				
			}
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(url);
		
	}
	
	public void login(String userId, String password){
		driver.findElement(By.name("uid")).sendKeys(userId);
		
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.name("btnLogin")).click();
	}
	
	public void addCustomer(){
		
		//driver.findElement(By.linkText("New Customer")).click();
		driver.findElement(By.linkText("New Customer")).click();
		
		driver.findElement(By.name("name")).sendKeys("Saurabh");
		
		driver.findElement(By.xpath("//input[@value='f']")).click();
		
		driver.findElement(By.name("dob")).sendKeys("06/21/1989");
		driver.findElement(By.name("addr")).sendKeys("Gurgaon \n Haryana");
		driver.findElement(By.name("city")).sendKeys("Gurgaon");
		driver.findElement(By.name("state")).sendKeys("HaRYANA");
		driver.findElement(By.name("pinno")).sendKeys("789456");
		driver.findElement(By.name("telephoneno")).sendKeys("9856985789");
		
		String emailId = "ss" + System.currentTimeMillis() + "@gmail.com";
		
		System.out.println(emailId);
		
		driver.findElement(By.name("emailid")).sendKeys(emailId);
		driver.findElement(By.name("password")).sendKeys("gsdfdf");
		
		driver.findElement(By.name("sub")).click();
	}
	
	public String getCustomerId(){
		
		String customerId;
		
		customerId = driver.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]")).getText();
		
		return customerId;
	}
	
	public void addNewAccount(String customerId, String accountType){
		driver.findElement(By.linkText("New Account")).click();
		
		driver.findElement(By.name("cusid")).sendKeys(customerId);
		
		WebElement selectAcc = driver.findElement(By.name("selaccount"));
		
		Select dropdown = new Select(selectAcc);
		
		WebElement firstSelectedOption;
		
		firstSelectedOption = dropdown.getFirstSelectedOption();
		
		System.out.println("Before selecting Account :: "+firstSelectedOption.getText());
		
		
		dropdown.selectByVisibleText(accountType);
		
		firstSelectedOption = dropdown.getFirstSelectedOption();
		
		System.out.println("After selecting Account :: "+firstSelectedOption.getText());
		
		System.out.println(dropdown.isMultiple());
		
		driver.findElement(By.name("inideposit")).sendKeys("4328947");
		
		driver.findElement(By.name("button2")).click();
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}
}
