package testCode;

import org.openqa.selenium.WebDriver;

import commonLibs.implementation.Driver;
import designPattern.AmazonPageFactory;

public class DemoAmazonPageFactory {
	
	public static void main(String[] args) {
	try {
		Driver cmnDriver = new Driver("chrome");
		
		cmnDriver.setPageLoadTimeout(90);
		
		cmnDriver.setElementDetectionTimeout(10);
		
		cmnDriver.navigateToFirstUrl("https://www.amazon.in/");
		
		String title = cmnDriver.getTitle();
		
		WebDriver driver = cmnDriver.getDriver();
		
		AmazonPageFactory homePage = new AmazonPageFactory(driver);
		
		homePage.searchProduct("Apple Watch", "Watches");
		
		
	}catch (Exception e) {
		System.out.println("Exception occured..");
		e.printStackTrace();
	}}
}
