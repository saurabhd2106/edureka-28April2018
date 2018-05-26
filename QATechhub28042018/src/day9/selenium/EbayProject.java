package day9.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EbayProject {
	
	ChromeDriver driver;
	String url ="https://www.ebay.in/";
	
	public void invokeBrowser(){
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Saurabh Dhingra\\workspace\\libs\\chromeDriver36\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		//To Maximize the browser screen
		driver.manage().window().maximize();
		
		//By pass all cookies
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(url);
		
	}
	
	public void closeBrowser(){
		
		//Closes all the windows or tab opened by a selenium session
		driver.quit();
	}
	
	public String searchProduct(String productName, String category){
		
		driver.findElement(By.id("gh-ac")).sendKeys(productName);
		
		WebElement dropdown = driver.findElement(By.id("gh-cat"));
		Select selectCategory = new Select(dropdown);
		
		selectCategory.selectByVisibleText(category);
		driver.findElement(By.id("gh-btn")).click();
		
		return driver.findElement(By.className("listingscnt")).getText();
	}

}
