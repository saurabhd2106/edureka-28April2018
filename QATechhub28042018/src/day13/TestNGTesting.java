package day13;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTesting {
	
	@Test(priority=0, groups={"Sanity"})
	public void testcase1(){
		System.out.println("\t\t\t\tClass B Executing test case 1.. ");
	}
	
	@Test(priority=-100)
	public void testcase5(){
		System.out.println("\t\t\t\tClass B Executing test case 5.. ");
	}
	
	@Test(priority=100)
	public void testcase6(){
		System.out.println("\t\t\t\tClass B Executing test case 6.. ");
	}
	
	@Test(priority=300, groups={"Sanity"})
	public void testcase3(){
		System.out.println("Class B Executing test case 3.. ");
	}
	
	@Test(priority=200, groups={"Sanity"})
	public void testcase2(){
		System.out.println("\t\t\t\tClass B Executing test case 2.. ");
	}
	
	@BeforeMethod(alwaysRun=true)
	public void beforeAMethod(){
		System.out.println("\t\t\tClass B Executing before a method...");
	}
	
	@AfterMethod(alwaysRun=true)
	public void afterAMethod(){
		System.out.println("\t\t\tClass B Executing after a method...");
	}
	
	@BeforeClass(alwaysRun=true)
	public void beforeAClass(){
		System.out.println("\t\tClass B Before a class");
	}
	
	@AfterClass(alwaysRun=true)
	public void afterAClass(){
		System.out.println("\t\tClass B After a class");
	}
	
	@BeforeGroups(groups={"Sanity"})
	public void beforeAGroup(){
		System.out.println("Executing before first method of sanity");
	}
	
	@AfterGroups(groups={"Sanity"})
	public void afterAGroup(){
		System.out.println("Executing after last method of sanity");
	}
}
