package day6;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testing1 {
	
	@BeforeSuite(alwaysRun= true)
	public void beforeASuite(){
		System.out.println("I will be the first ever method..");
	}
	
	@BeforeClass(alwaysRun=true)
	public void beforeClass(){
		System.out.println("Executed as first method in the class");
	}
	
	@AfterClass(alwaysRun=true)
	public void afterClass(){
		System.out.println("Executed as last method in the class");
		
		
	}
	
	@BeforeMethod
	public void beforeAMethod(){
		System.out.println("Executing before a testcase");
	}
	
	@AfterMethod
	public void afterAMethod(){
		System.out.println("Executing after a testcase");
	}
	
	@Test(priority=100, groups="Sanity")
	public void testcase1(){
		System.out.println("I am test case 1");
	}
	
	@Test(priority=300)
	public void testcase12(){
		System.out.println("I am test case 12");
	}
	
	@Test(priority=-100, enabled=true, groups={"Sanity","Regression"})
	public void testcase6(){
		System.out.println("I am test case 6");
	}
	
	@Test(priority=0)
	public void testcase5(){
		System.out.println("I am test case 5");
	}
 
}
