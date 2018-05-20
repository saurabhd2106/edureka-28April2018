package testCode;

import org.openqa.selenium.WebDriver;

import commonLibs.implementation.AlertHandling;
import commonLibs.implementation.Driver;

public class DemoCommonDriver {

	public static void main(String[] args) {
		
		try {
			Driver cmnDriver = new Driver("chrome");
			
			cmnDriver.setPageLoadTimeout(90);
			
			cmnDriver.setElementDetectionTimeout(10);
			
			cmnDriver.navigateToFirstUrl("http://qatechhub.com");
			
			String title = cmnDriver.getTitle();
			
			WebDriver driver = cmnDriver.getDriver();
			
			AlertHandling alert = new AlertHandling(driver);
			
			alert.acceptAlert();
			
			System.out.println(title);
			
			cmnDriver.closeAllBrowsers();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
