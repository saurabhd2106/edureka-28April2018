package com.mercuryTravel.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MercuryTravelHomePagesTests extends BaseScenarios {
	
	
	
	@Test(priority= 0)
	public void verifyUserLoginWithCorrectCredentials(){
		try {
			homepage.userLogin("saurabh.d2106@gmail.com", "Pro@1234");
			
			String actualWelcomeText = homepage.getWelcomeText();
			
			Assert.assertEquals(actualWelcomeText, "Welcome, Saurabh");
		} catch (Exception e) {
			
			e.printStackTrace();
			Assert.fail();
			
			
		
		}
	}

}
