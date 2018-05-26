package com.mercuryTravel.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.mercuryTravel.pages.MercuryTravelHomePage;

import commonLibs.implementation.Driver;

public class BaseScenarios {
	
	public Driver cmnDriver;
	public MercuryTravelHomePage homepage;
	public WebDriver driver;
	
	@BeforeClass
	public void invokeBrowser(){
		
		try {
			cmnDriver = new Driver("chrome");
			
			cmnDriver.setElementDetectionTimeout(10);
			
			cmnDriver.setPageLoadTimeout(30);
			
			cmnDriver.navigateToFirstUrl("https://www.mercurytravels.co.in/");
			driver = cmnDriver.getDriver();
			
			homepage = new MercuryTravelHomePage(driver);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			Assert.fail("Because an Exception occured..");
		}
		
	}
	
	
	@AfterClass(enabled=true)
	public void closeBrowser(){
		try {
			cmnDriver.closeAllBrowsers();
		} catch (Exception e) {
			Assert.fail();
			e.printStackTrace();
		}
	}

}
