package com.Zopa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import utils.TestDataProvider;

public class ZopaMemberSignUpTest extends BaseScenarios {

	@Test(priority = 0,dataProvider="getData",dataProviderClass=TestDataProvider.class,enabled = true)
	public void verifyUserSignUp(String emailId, String firstName, String lastName, String phoneNumber, String dob,
			String postalcode, String income, String rent, String password) throws Exception {
		try {
			logger = report.createTest("Test case Id :: 1 :: Verify User SignUp");
			
			

			String actualURLHomePage = driver.getCurrentUrl();
			Assert.assertEquals(actualURLHomePage, configProperty.getProperty("baseUrl"));
			homepage.clickGetZopaHomeLoan();

			String actualURLLoanPage = driver.getCurrentUrl();
			Assert.assertEquals(actualURLLoanPage, configProperty.getProperty("loanPageUrl"));
			loanpage.clickGetPersonalisedRates();

			memberSignuppage.setEmail(emailId);
			memberSignuppage.setTitle();
			memberSignuppage.setFirstName(firstName);
			memberSignuppage.setLastName(lastName);
			memberSignuppage.setPhoneNumber(phoneNumber);
			String[] dateOfBirth = dob.split("-");
			memberSignuppage.setDateOfBirth(dateOfBirth[0]);
			memberSignuppage.setMonthOfBirth(dateOfBirth[1]);
			memberSignuppage.setYearOfBirth(dateOfBirth[2]);
			memberSignuppage.setLoanReasonCar();
			memberSignuppage.setPostCode(postalcode);
			memberSignuppage.clickLookUpAddress();
			memberSignuppage.setAddress();
			memberSignuppage.setAddressMonth();
			memberSignuppage.setAddressYear();
			memberSignuppage.clickUseThisAddress();
			memberSignuppage.setEmployementStatus();
			memberSignuppage.setAnnualIncome(income);
			memberSignuppage.setResidentialStatus();
			memberSignuppage.setRentAmount(rent);
			memberSignuppage.setUserPassword(password);

		} catch (Exception e) {

			e.printStackTrace();
			Assert.fail();

		}

	}

}
