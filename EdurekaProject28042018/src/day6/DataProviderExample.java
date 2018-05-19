package day6;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	
	@Test(dataProvider="getData")
	public void printParameters(String username, String password, int id){
		System.out.println(username);
		
		System.out.println(id);
	}
	
	@DataProvider
	public Object[][] getData(){
		
		Object[][] data = new Object[5][3];
		
		data[0][0] = "Saurabh";
		data[1][0] = "Swati";
		data[2][0] = "Jyoti";
		data[3][0] = "Mohit";
		data[4][0] = "Sohit";
		
		data[0][1] = "Abc@12";
		data[1][1] = "Abc@12";
		data[2][1] = "Abc@16";
		data[3][1] = "Abc@15";
		data[4][1] = "Abc@15";
		
		data[0][2] = 12;
		data[1][2] = 34;
		data[2][2] = 45;
		data[3][2] = 67;
		data[4][2] = 12;
		
		return data;
		
		
	}
	

}
