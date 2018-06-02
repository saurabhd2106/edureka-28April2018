package com.mercuryTravel.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MercuryTravelHomePagesTests extends BaseScenarios {

	@Test(priority = 0, enabled = true)
	public void verifyUserLoginWithCorrectCredentials() throws Exception {
		logger = report.createTest("Test case Id :: 1223001 :: Verify User Login with correct credentials" );
		
		
		String emailId = configProperty.getProperty("userEmailId");
		
		logger.info("Email Id :: "+ emailId);
		
		String password = configProperty.getProperty("userPassword");
		logger.info("Email Id :: "+ password);
		
		homepage.userLogin(emailId, password);

		String actualWelcomeText = homepage.getWelcomeText();
		logger.info("Actual Welcome Text :: "+ actualWelcomeText);
		logger.info("Expected Welcome Text :: "+ configProperty.getProperty("welcomeText"));
		
		Assert.assertEquals(actualWelcomeText, configProperty.getProperty("welcomeText"));
	}

	// ---------------------------------------------------------

	@Test(priority = 0, dataProvider = "getData", dataProviderClass = utils.TestDataProvider.class, enabled = false)
	public void verifyUserLoginWithMultipleCredentials(String emailId, String password) {
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
