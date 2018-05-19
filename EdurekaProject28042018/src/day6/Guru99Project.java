package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Guru99Project {
	
	ChromeDriver driver;
	String url = "http://demo.guru99.com/v4";
	
	@BeforeClass
	public void invokeBrowser(){
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Saurabh Dhingra\\workspace\\libs\\chromeDriver36\\chromedriver.exe");
		
		// \n \t -- escape character
		driver = new ChromeDriver();
		
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
