package testCode;

import org.testng.annotations.Test;

public class DemoTestDataProvider {
	
	@Test(dataProvider="getData", dataProviderClass=utils.TestDataProvider.class)
	public void printTestData(String username, String password){
		
		System.out.println("Username :: "+ username + " and password :: "+ password);
		
	}

}
