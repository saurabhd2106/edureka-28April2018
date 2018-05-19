package day6;

import org.testng.annotations.Test;

public class TestingTestNG2 {

	@Test(expectedExceptions=ArrayIndexOutOfBoundsException.class)
	public void testcase1(){
		
		int[] arr = new int[5];
		
		arr[0] = 12;
		arr[1] = 15;
		arr[2] = 16;
		arr[3] = 13;
		arr[4] = 92;
		
		for(int i=0; i<=5;i++){
			System.out.println(arr[i]);
		}
		
	}
	
	@Test(timeOut=3000)
	public void testcase2() throws InterruptedException{
		Thread.sleep(5000);
	}
}
