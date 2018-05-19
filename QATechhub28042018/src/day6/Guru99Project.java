package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Guru99Project {
	
	ChromeDriver driver;
	String url ="http://www.demo.guru99.com/v4";
	
	public void invokeBrowser(){
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Saurabh Dhingra\\workspace\\libs\\chromeDriver36\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		//To Maximize the browser screen
		driver.manage().window().maximize();
		
		//By pass all cookies
		driver.manage().deleteAllCookies();
		
		driver.get(url);
		
	}
	
	public void closeBrowser(){
			
		//Closes all the windows or tab opened by a selenium session
		driver.quit();
	}
	
	public void login(String username, String password){
		WebElement userElement = driver.findElement(By.name("uid"));
		
		userElement.sendKeys(username);
		
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("btnLogin")).click();
	}
	
	public void addCustomer(){
		driver.findElement(By.linkText("New Customer")).click();
		
		driver.findElement(By.name("name")).sendKeys("Swati");
		
		driver.findElement(By.xpath("//input[@value='f']")).click();
		driver.findElement(By.name("dob")).sendKeys("06/21/1989");
		driver.findElement(By.name("addr")).sendKeys("Gurgaon \n Haryana");
		driver.findElement(By.name("city")).sendKeys("Gurgaon");
		driver.findElement(By.name("state")).sendKeys("HaRYANA");
		driver.findElement(By.name("pinno")).sendKeys("789456");
		driver.findElement(By.name("telephoneno")).sendKeys("9856985789");
		
		long time = System.currentTimeMillis();
		
		String emailId = "swa"+time+"@xyz.com";
		
		System.out.println(emailId);
		
		driver.findElement(By.name("emailid")).sendKeys(emailId);
		driver.findElement(By.name("password")).sendKeys("gsdfdf");
		
		driver.findElement(By.name("sub")).click();
	}
	
	public String getCustomerId(){
		String customerId = driver.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]")).getText();
		return customerId;
	}
	
	public void addAccount(String customerId){
		driver.findElement(By.linkText("New Account")).click();
		
		driver.findElement(By.name("cusid")).sendKeys(customerId);
		
		WebElement dropdown = driver.findElement(By.name("selaccount"));
		Select selectAccountType = new Select(dropdown);
		
		selectAccountType.selectByVisibleText("Current");
		
		driver.findElement(By.name("inideposit")).sendKeys("959034");
		
		driver.findElement(By.name("button2")).click();
		
	}
}
