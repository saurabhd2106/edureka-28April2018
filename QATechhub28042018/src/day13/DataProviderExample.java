package day13;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	
	@Test(dataProvider="getData")
	public void printTestData(String username, String userId, int employeeId){
		System.out.println("Username :: "+ username);
		
		System.out.println("User Id :: "+ userId);
	}
	
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data = new Object[4][3];
		
		data[0][0] = "saurabh";
		data[0][1] = "QA001";
		data[0][2] = 83579834;
		
		data[1][0] = "Anurag";
		data[1][1] = "QA002";
		data[1][2] = 3483579;
		
		data[2][0] = "Akash";
		data[2][1] = "QA003";
		data[2][2] = 239834;
		
		data[3][0] = "Chandan";
		data[3][1] = "QA004";
		data[3][2] = 79834;
		return data;
	}
	

}
