package day11;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver;
		String url ="https://jqueryui.com/droppable/";
		
				
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Saurabh Dhingra\\workspace\\libs\\chromeDriver36\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			//To Maximize the browser screen
			driver.manage().window().maximize();
			
			//By pass all cookies
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get(url);
			
			WebElement frameElement = driver.findElement(By.className("demo-frame"));
			
			driver.switchTo().frame(frameElement);
			
			WebElement source = driver.findElement(By.id("draggable"));
			WebElement target = driver.findElement(By.id("droppable"));
			
			Actions action = new Actions(driver);
			
			String colorBeforeDragNDrop = target.getCssValue("color");
			
			action.dragAndDrop(source, target).build().perform();
			
			String colorAfterDragNDrop = target.getCssValue("color");
			
			System.out.println("Before DnD :: "+ colorBeforeDragNDrop);
			
			System.out.println("After DnD :: "+ colorAfterDragNDrop);
	}

}
