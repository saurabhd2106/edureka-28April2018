package designPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonLibs.implementation.DropdownControl;
import commonLibs.implementation.ElementHandling;
import commonLibs.implementation.TextboxControls;

public class AmazonPageFactory {
	
	@CacheLookup
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchBox;
	
	@CacheLookup
	@FindBy(id="searchDropdownBox")
	private WebElement searchCategory;
	
	@FindBy(xpath="//input[@value='Go']")
	private WebElement searchButton;
	
	@FindBy(id="s-result-count")
	private WebElement resultBox;
	
	private TextboxControls textbox;
	
	private DropdownControl dropdown;
	
	private ElementHandling cmnElement;
	
	public AmazonPageFactory(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
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
