package day6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAndAlertHandling {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver;
		String url ="https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert";
		
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Saurabh Dhingra\\workspace\\libs\\chromeDriver36\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			//To Maximize the browser screen
			driver.manage().window().maximize();
			
			//By pass all cookies
			driver.manage().deleteAllCookies();
			
			driver.get(url);
			
			driver.switchTo().frame("iframeResult");
			
			//To switch back from a frame to normal webpage
			//driver.switchTo().defaultContent();
			
			driver.findElement(By.tagName("button")).click();
			
			Alert alert = driver.switchTo().alert();
			
			Thread.sleep(3000);
			System.out.println(alert.getText());
			
			alert.accept();
	}

}
