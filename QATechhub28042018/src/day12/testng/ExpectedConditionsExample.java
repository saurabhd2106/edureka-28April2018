package day12.testng;

import org.testng.annotations.Test;

public class ExpectedConditionsExample {
	
	@Test(expectedExceptions=ArrayIndexOutOfBoundsException.class)
	public void testcase1(){
		int[] arr = new int[5];
		
		arr[0] = 12;
		arr[1] = 19;
		arr[2] = 13;
		arr[3] = 11;
		arr[4] = 17;
		
		for(int i=0; i<=5; i++){
			System.out.println(arr[i]);
		}
		
	}

}
