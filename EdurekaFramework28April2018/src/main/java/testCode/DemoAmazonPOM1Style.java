package testCode;

import org.openqa.selenium.WebDriver;

import commonLibs.implementation.Driver;
import commonLibs.implementation.DropdownControl;
import commonLibs.implementation.ElementHandling;
import commonLibs.implementation.TextboxControls;
import designPattern.AmazonPOMStyle1;

public class DemoAmazonPOM1Style {

	public static void main(String[] args) {
		
		try {
			Driver cmnDriver = new Driver("chrome");
			
			cmnDriver.setPageLoadTimeout(90);
			
			cmnDriver.setElementDetectionTimeout(10);
			
			cmnDriver.navigateToFirstUrl("https://www.amazon.in/");
			
			String title = cmnDriver.getTitle();
			
			WebDriver driver = cmnDriver.getDriver();
			
			AmazonPOMStyle1 homePage = new AmazonPOMStyle1(driver);
			
			TextboxControls textbox = new TextboxControls();
			
			DropdownControl dropdown = new DropdownControl();
			
			ElementHandling cmnElement = new ElementHandling();
			
			textbox.setText(homePage.searchBox, "Apple Watch");
			
			dropdown.selectViaVisibleText(homePage.searchCategory, "Watches");
			
			cmnElement.click(homePage.searchButton);
			
			
			
		}catch (Exception e) {
			System.out.println("Exception occured..");
		}

	}

}
