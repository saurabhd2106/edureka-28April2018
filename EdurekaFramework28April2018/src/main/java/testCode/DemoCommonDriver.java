package testCode;

import org.openqa.selenium.WebDriver;

import commonLibs.implementation.AlertHandling;
import commonLibs.implementation.Driver;
import commonLibs.implementation.TakeScreenshot;

public class DemoCommonDriver {

	public static void main(String[] args) {
		
		try {
			Driver cmnDriver = new Driver("chrome");
			
			cmnDriver.setPageLoadTimeout(90);
			
			cmnDriver.setElementDetectionTimeout(10);
			
			cmnDriver.navigateToFirstUrl("http://qatechhub.com");
			
			String title = cmnDriver.getTitle();
			
			WebDriver driver = cmnDriver.getDriver();
			
			TakeScreenshot camera = new TakeScreenshot(driver);
			
			camera.captureAndSaveScreenshot("C:\\Users\\Saurabh Dhingra\\workspace_git\\EdurekaFramework28April2018\\screenshots\\Test.png");
			
			
			System.out.println(title);
			
			cmnDriver.closeAllBrowsers();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
