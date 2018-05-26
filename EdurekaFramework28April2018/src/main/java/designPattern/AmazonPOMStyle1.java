package designPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonPOMStyle1 {
	
	public WebElement searchBox;
	
	public WebElement searchCategory;
	
	public WebElement searchButton;
	
	
	
	public AmazonPOMStyle1(WebDriver driver) {
		searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		
		searchCategory = driver.findElement(By.id("searchDropdownBox"));
		
		searchButton = driver.findElement(By.xpath("//input[@value='Go']"));
		
	}

}
