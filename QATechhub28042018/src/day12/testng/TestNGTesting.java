package day12.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTesting {
	
	@Test(priority=0)
	public void testcase1(){
		System.out.println("\t\t\t\tExecuting test case 1.. ");
	}
	
	@Test(priority=-100, groups={"Sanity"})
	public void testcase5(){
		System.out.println("\t\t\t\tExecuting test case 5.. ");
	}
	
	@Test(priority=100)
	public void testcase6(){
		System.out.println("\t\t\t\tExecuting test case 6.. ");
	}
	
	@Test(priority=300, enabled=false)
	public void testcase3(){
		System.out.println("Executing test case 3.. ");
	}
	
	@Test(priority=200, groups={"Sanity"})
	public void testcase2(){
		System.out.println("\t\t\t\tExecuting test case 2.. ");
	}
	
	@BeforeMethod(alwaysRun=true)
	public void beforeAMethod(){
		System.out.println("\t\t\tExecuting before a method...");
	}
	
	@AfterMethod(alwaysRun=true)
	public void afterAMethod(){
		System.out.println("\t\t\tExecuting after a method...");
	}
	
	@BeforeClass(alwaysRun=true)
	public void beforeAClass(){
		System.out.println("\t\tBefore a class");
	}
	
	@AfterClass(alwaysRun=true)
	public void afterAClass(){
		System.out.println("\t\tAfter a class");
	}
}
