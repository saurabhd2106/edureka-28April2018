package day12.testng;

import org.testng.annotations.Test;

public class TimeoutExample {
	
	@Test(timeOut=3000)
	public void testcase() throws InterruptedException {
		Thread.sleep(5000);
	}

}
