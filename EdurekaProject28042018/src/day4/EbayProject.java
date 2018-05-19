package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import utility.WaitUtils;

public class EbayProject {
	
	ChromeDriver driver;
	String url = "http://www.ebay.in";
	
	public void invokeBrowser(){
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Saurabh Dhingra\\workspace\\libs\\chromeDriver36\\chromedriver.exe");
		
		// \n \t -- escape character
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		
		//driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		driver.get(url);
		
	}
	
	public void mouseHover(){
		
		Actions action = new Actions(driver);
		
		
		
		WebElement mobileAndAccessoriesLink = driver.findElement(By.linkText("Mobile & Accessories"));
		
		action.moveToElement(mobileAndAccessoriesLink).build().perform();
		
	
		
		WaitUtils.fluentWait(driver, 10 ,2, By.linkText("Mobile Phones"));
		
		WebElement mobilePhoneLink = driver.findElement(By.linkText("Mobile Phones"));
		
		
		action.moveToElement(mobilePhoneLink).click().build().perform();
	}

}
