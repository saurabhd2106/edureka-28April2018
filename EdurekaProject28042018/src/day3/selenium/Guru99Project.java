package day3.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99Project {
	ChromeDriver driver;
	String url = "http://demo.guru99.com/v4";
	
	public void invokeBrowser(){
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Saurabh Dhingra\\workspace\\libs\\chromeDriver36\\chromedriver.exe");
		
		// \n \t -- escape character
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get(url);
		
	}
	
	public void login(String userId, String password){
		driver.findElement(By.name("uid")).sendKeys(userId);
		
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.name("btnLogin")).click();
	}
	
	public void addCustomer(){
		
		//driver.findElement(By.linkText("New Customer")).click();
		driver.findElementByLinkText("New Customer").click();
		
		driver.findElement(By.name("name")).sendKeys("Saurabh");
		
		driver.findElement(By.xpath("//input[@value='f']")).click();
		
		driver.findElement(By.name("dob")).sendKeys("06/21/1989");
		driver.findElement(By.name("addr")).sendKeys("Gurgaon \n Haryana");
		driver.findElement(By.name("city")).sendKeys("Gurgaon");
		driver.findElement(By.name("state")).sendKeys("HaRYANA");
		driver.findElement(By.name("pinno")).sendKeys("789456");
		driver.findElement(By.name("telephoneno")).sendKeys("9856985789");
		
		String emailId = "ss" + System.currentTimeMillis() + "@gmail.com";
		
		System.out.println(emailId);
		
		driver.findElement(By.name("emailid")).sendKeys(emailId);
		driver.findElement(By.name("password")).sendKeys("gsdfdf");
		
		driver.findElement(By.name("sub")).click();
	}
	
	public String getCustomerId(){
		
		String customerId;
		
		customerId = driver.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]")).getText();
		
		return customerId;
	}
}
