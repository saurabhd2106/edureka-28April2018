package com.mercuryTravel.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MercuryTravelHomePagesTests extends BaseScenarios {
	
	
	
	@Test(priority= 0, enabled=false)
	public void verifyUserLoginWithCorrectCredentials(){
		try {
			
			String emailId = configProperty.getProperty("userEmailId");
			String password = configProperty.getProperty("userPassword"); 
			
			homepage.userLogin(emailId, password);
			
			String actualWelcomeText = homepage.getWelcomeText();
			
			Assert.assertEquals(actualWelcomeText, configProperty.getProperty("welcomeText"));
		} catch (Exception e) {
			
			e.printStackTrace();
			Assert.fail();
			
			
		
		}
	}
	
	//---------------------------------------------------------
	
	@Test(priority= 0, dataProvider ="getData", dataProviderClass=utils.TestDataProvider.class)
	public void verifyUserLoginWithMultipleCredentials(String emailId, String password){
		try {
			
			
			homepage.userLogin(emailId, password);
			
			String actualWelcomeText = homepage.getWelcomeText();
			
			Assert.assertEquals(actualWelcomeText, configProperty.getProperty("welcomeText"));
		} catch (Exception e) {
			
			e.printStackTrace();
			Assert.fail();
			
			
		
		}
	}

}
