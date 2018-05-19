package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Guru99Project {
	
	WebDriver driver;
	String url = "http://demo.guru99.com/v4";
	
	@Parameters("browserType")
	@BeforeClass
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
		
		driver.get(url);
	}
	
	@Parameters({"username", "password"})
	@Test
	public void login(String userId, String password){
		driver.findElement(By.name("uid")).sendKeys(userId);
		
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.name("btnLogin")).click();
		String expectedTitle = "Guru99 Bank Manager HomePage";
		
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		
	}
	
	@AfterClass
	public void closeBrowser(){
		driver.quit();
	}

}
