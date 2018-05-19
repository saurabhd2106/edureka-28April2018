package day6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MercuryTravelTestcase {
	
	ChromeDriver driver;
	String url = "https://www.mercurytravels.co.in/";
	
	@BeforeClass
	public void invokeBrowser(){
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Saurabh Dhingra\\workspace\\libs\\chromeDriver36\\chromedriver.exe");
		
		// \n \t -- escape character
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(url);
	}
	
	@Test
	public void verifyReturnDateIsVisibleInRoundTrip(){
		driver.findElement(By.linkText("Flights")).click();
		
		driver.findElement(By.xpath("//input[@value='R']")).click();
		
		WebElement retunTypeDateSection = driver.findElement(By.id("dpf2Cntr"));
		
		Assert.assertTrue(retunTypeDateSection.isDisplayed());
	}
	
	@Test
	public void verifyReturnDateIsNotVisibleInOneWayTrip(){
		driver.findElement(By.linkText("Flights")).click();
		
		driver.findElement(By.xpath("//input[@value='S']")).click();
		
		WebElement retunTypeDateSection = driver.findElement(By.id("dpf2Cntr"));
		
		Assert.assertTrue(!retunTypeDateSection.isDisplayed());
	}

}
