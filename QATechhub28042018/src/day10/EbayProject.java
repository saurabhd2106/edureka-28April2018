package day10;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import utils.WaitUtils;

public class EbayProject {
	
	WebDriver driver;
	String url ="https://www.ebay.in/";
	
	public void invokeBrowser(){
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Saurabh Dhingra\\workspace\\libs\\chromeDriver36\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		//To Maximize the browser screen
		driver.manage().window().maximize();
		
		//By pass all cookies
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(url);
		
	}
	
	public void closeBrowser(){
		
		//Closes all the windows or tab opened by a selenium session
		driver.quit();
	}
	
	public void mouseHover(){
		WebElement mobileAccLink = driver.findElement(By.linkText("Mobile & Accessories"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(mobileAccLink).build().perform();
		
	//	WaitUtils.waitTillElementVisible(driver, 10, By.linkText("Mobile Phones"));
		WaitUtils.fluentWait(driver, 10, 250, By.linkText("Mobile Phones"));
		
		WebElement moileLink = driver.findElement(By.linkText("Mobile Phones"));
		
		action.moveToElement(moileLink).click().build().perform();
	}
	
	public String searchProduct(String productName, String category){
		
		driver.findElement(By.id("gh-ac")).sendKeys(productName);
		
		WebElement dropdown = driver.findElement(By.id("gh-cat"));
		Select selectCategory = new Select(dropdown);
		
		selectCategory.selectByVisibleText(category);
		driver.findElement(By.id("gh-btn")).click();
		
		return driver.findElement(By.className("listingscnt")).getText();
	}
	
	public void getNthProduct(int itemNumber){
		
		String productXpath = String.format("//div[@id='ResultSetItems']/ul[@id='ListViewInner']/li[@r=%d]", itemNumber);
		
		String result = driver.findElement(By.xpath(productXpath)).getText();
		
		System.out.println(result);
	}
	
	public void getAllProducts(){
		List<WebElement> allProducts = driver.findElements(By.xpath("//div[@id='ResultSetItems']/ul[@id='ListViewInner']/li"));
		
		//To perform any mouse operation
		Actions action = new Actions(driver);
		
		for(WebElement product : allProducts){
			System.out.println("------------------------------------------------");
			
			action.moveToElement(product).build().perform();
			System.out.println(product.getText());
		}
		
	}
	
	public void getAllProductsViaScrollDownJs(){
		List<WebElement> allProducts = driver.findElements(By.xpath("//div[@id='ResultSetItems']/ul[@id='ListViewInner']/li"));
		
		
		for(WebElement product : allProducts){
			System.out.println("------------------------------------------------");
			int x, y;
			
			x	= product.getLocation().x;
			y 	= product.getLocation().y;
			
			scrollDown(x, y);
			
			System.out.println(product.getText());
		}
		
	}
	
	private void scrollDown(int x, int y){
		String jsCommand = String.format("window.scrollBy(%d,%d)", x,y);
		
		JavascriptExecutor jsEngine;
		
		jsEngine = (JavascriptExecutor) driver;
		
		jsEngine.executeScript(jsCommand);
	}

}
