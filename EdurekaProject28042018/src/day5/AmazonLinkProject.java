package day5;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLinkProject {
	
	ChromeDriver driver;
	String url = "http://www.amazon.in";
	
	public void invokeBrowser(){
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Saurabh Dhingra\\workspace\\libs\\chromeDriver36\\chromedriver.exe");
		
		// \n \t -- escape character
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		driver.get(url);
		
	}
	
	public void getLinkCount(){
		List<WebElement> allLink = driver.findElements(By.tagName("a"));
		
		System.out.println("Number of links on a page :: "+allLink.size());
	}
	
	public void getLinkUrl(){
		String url = driver.findElement(By.linkText("Amazon Pay")).getAttribute("href");
		
		System.out.println("Url :: "+ url);
	}
	
	public void getAllLinkInfo(){
		List<WebElement> allLink = driver.findElements(By.tagName("a"));
		
		for(WebElement link:allLink){
			System.out.println("Link Text :: "+ link.getText());
			System.out.println("Link URL  :: "+ link.getAttribute("href"));
			
			System.out.println("-------------------------------------------");
		}
	}

}
