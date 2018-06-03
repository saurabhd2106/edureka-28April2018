package day6;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTestcases {
	
	@Test
	public void testcase1(){
		System.out.println("\t\t\t\t Executing test case 1");
	}
	
	@Test 
	public void testcase2(){
		System.out.println("\t\t\t\t Executing test case 2");
	}

	@BeforeMethod
	public void beforeAMethod(){
		System.out.println("\t\t\t Executing before a testcase");
	}
	
	@AfterMethod
	public void afterAMethod(){
		System.out.println("\t\t\t Executing after a testcase");
	}
	
	@BeforeClass
	public void beforeAClass(){
		System.out.println("\t\t Executed as first method in the class");
	}
	
	@AfterClass
	public void afterAClass(){
		System.out.println("\t\t Executed as last method in the class");
	}
	
	@BeforeTest
	public void beforeATest(){
		System.out.println("\t Executed before a test in a suite");
	}
	
	@AfterTest
	public void afterATest(){
		System.out.println("\t Executed after a test in a suite");
	}
	
	@BeforeSuite
	public void beforeASuite(){
		System.out.println("Before a suite");
	}
	
	@AfterSuite
	public void afterASuite(){
		System.out.println("After a suite");
	}
	
}
