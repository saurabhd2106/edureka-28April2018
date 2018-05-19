package day5;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome {
	
	ChromeDriver driver;
	String url ="http://www.qatechhub.com"
			;
	public void invokeBrowser(){
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Saurabh Dhingra\\workspace\\libs\\chromeDriver36\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		//Set the size of the screen
		Dimension dim = new Dimension(500, 900);
		
		driver.manage().window().setSize(dim);
		
		//To Maximize the browser screen
		driver.manage().window().maximize();
		
		//By pass all cookies
		driver.manage().deleteAllCookies();
		
		driver.get(url);
		
	}
	
	public String getTitleOfThePage(){
		return driver.getTitle();
	}
	
	public String getCurrentPageUrl(){
		return driver.getCurrentUrl();
	}
	
	public void navigateCommands(){
		driver.navigate().to("http://www.facebook.com");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
	}
	
	public void closeBrowser(){
		
		//Closes the current active window
	//	driver.close();
		
		//Closes all the windows or tab opened by a selenium session
		driver.quit();
	}
	
	
}
