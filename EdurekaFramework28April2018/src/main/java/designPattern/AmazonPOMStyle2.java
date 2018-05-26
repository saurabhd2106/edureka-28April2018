package designPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commonLibs.implementation.DropdownControl;
import commonLibs.implementation.ElementHandling;
import commonLibs.implementation.TextboxControls;

public class AmazonPOMStyle2 {
	
	private WebElement searchBox;
	
	private WebElement searchCategory;
	
	private WebElement searchButton;
	
	private TextboxControls textbox;
	
	private WebElement resultBox;
	
	private DropdownControl dropdown;
	
	private ElementHandling cmnElement;
	
	public AmazonPOMStyle2(WebDriver driver) {
		searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		
		searchCategory = driver.findElement(By.id("searchDropdownBox"));
		
		searchButton = driver.findElement(By.xpath("//input[@value='Go']"));
		
		resultBox = driver.findElement(By.id("s-result-count"));
		
		textbox = new TextboxControls();
		
		dropdown = new DropdownControl();
		
		cmnElement = new ElementHandling();
		
	}
	
	public void searchProduct(String product, String category) throws Exception{
		textbox.setText(searchBox, "Apple Watch");
		
		dropdown.selectViaVisibleText(searchCategory, "Watches");
		
		cmnElement.click(searchButton);
		
		System.out.println(resultBox.getText());
		
	}

}
