package day9.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLinkProject {
	
	ChromeDriver driver;
	String url ="https://www.amazon.in/";
	
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
	
	public void getLinkCount(){
		List<WebElement> allLinks;
		
		allLinks = driver.findElements(By.tagName("a"));
		
		System.out.println("Number of links on a page :: "+allLinks.size());
	}
	
	public void getLinkUrl(){
		WebElement link = driver.findElement(By.linkText("Your Amazon.in"));
		
		System.out.println(link.getAttribute("href"));
	}
	
	public void getAllUrlAndLinks(){
		List<WebElement> allLinks;
		
		allLinks = driver.findElements(By.tagName("a"));
		System.out.println("-------------------------------------------------------");
		for(WebElement link : allLinks){
			System.out.println("Link Text :: "+ link.getText() +
					" and its url :: "+ link.getAttribute("href"));
		}
	}
	
	public void closeBrowser(){
			
		//Closes all the windows or tab opened by a selenium session
		driver.quit();
	}

}
