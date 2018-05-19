package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public static void main(String[] args) {
		ChromeDriver driver;
		String url = "http://jqueryui.com/droppable/";
		
		System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Saurabh Dhingra\\workspace\\libs\\chromeDriver36\\chromedriver.exe");
			
			// \n \t -- escape character
		driver = new ChromeDriver();
			
		driver.manage().window().maximize();
			
		driver.manage().deleteAllCookies();
			
		driver.get(url);
		
		WebElement frameElement = driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(frameElement);
		
		WebElement source = driver.findElement(By.id("draggable"));
		
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		
		String colorBeforeDnD = target.getCssValue("color");
		System.out.println("Color before Drag and Drop :: "+ colorBeforeDnD);
		//action.dragAndDrop(source, target).build().perform();
		
		action.moveToElement(source).clickAndHold().moveToElement(target).release().build().perform();
		
		String colorAfterDnD = target.getCssValue("color");
		
		System.out.println("Color before Drag and Drop :: "+ colorAfterDnD);
	}

}
