package day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAndFrameHandling {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver;
		String url = "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert";
		
		System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Saurabh Dhingra\\workspace\\libs\\chromeDriver36\\chromedriver.exe");
			
			// \n \t -- escape character
		driver = new ChromeDriver();
			
		driver.manage().window().maximize();
			
		driver.manage().deleteAllCookies();
			
		driver.get(url);
		
		driver.switchTo().frame("iframeResult");
		
		//To come out of a frame use defaultContent..
		//	driver.switchTo().defaultContent();
		
		driver.findElement(By.tagName("button")).click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println("Message on the alert is :: "+alert.getText());
		
		Thread.sleep(3000);
		alert.accept();
		
		//alert.dismiss();
	}

}
