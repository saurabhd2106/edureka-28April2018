package day5;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageUploadScenario {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver;
		String url = "https://images.google.com";		
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Saurabh Dhingra\\workspace\\libs\\chromeDriver36\\chromedriver.exe");
			
			// \n \t -- escape character
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
			
			driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
			
			driver.get(url);
			
			driver.findElement(By.id("qbi")).click();
			
			driver.findElement(By.linkText("Upload an image")).click();
			
			driver.findElement(By.id("qbfile")).click();
			
			Runtime.getRuntime().exec("C:\\Users\\Saurabh Dhingra\\workspace\\EdurekaProject28042018\\scripts\\upload.exe");
	}

}
