package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99Project {
	
	ChromeDriver driver;
	String url ="http://www.demo.guru99.com/v4"
			;
	public void invokeBrowser(){
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Saurabh Dhingra\\workspace\\libs\\chromeDriver36\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		//To Maximize the browser screen
		driver.manage().window().maximize();
		
		//By pass all cookies
		driver.manage().deleteAllCookies();
		
		driver.get(url);
		
	}
	
	public void closeBrowser(){
			
		//Closes all the windows or tab opened by a selenium session
		driver.quit();
	}
	
	public void login(String username, String password){
		WebElement userElement = driver.findElement(By.name("uid"));
		
		userElement.sendKeys(username);
		
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("btnLogin")).click();
	}

}
