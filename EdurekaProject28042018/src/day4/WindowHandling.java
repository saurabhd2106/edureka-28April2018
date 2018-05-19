package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver;
		String url = "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open";
		
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
		
		String parentWindow = driver.getWindowHandle();
		
		System.out.println("Parent Session Id :: "+ parentWindow);
		
		driver.findElement(By.tagName("button")).click();
		
		String childWindow;
		
		childWindow = driver.getWindowHandles().toArray()[1].toString();
		
		System.out.println("Child Window Session ID :: "+ childWindow);
		
		driver.switchTo().window(childWindow);
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindow);
		
		System.out.println("________________________________");
		System.out.println(driver.getTitle());
		
		driver.quit();
	
	}

}
