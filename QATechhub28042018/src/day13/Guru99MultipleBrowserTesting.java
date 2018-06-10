package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Guru99MultipleBrowserTesting {
	WebDriver driver;
	String url = "http://www.demo.guru99.com/v4";

	@Parameters("browserType")
	@BeforeClass
	public void invokeBrowser(String browserType) {
		
		if(browserType.equals("chrome")){
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Saurabh Dhingra\\workspace\\libs\\chromeDriver36\\chromedriver.exe");

		driver = new ChromeDriver();
		} else if(browserType.equals("firefox")){
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Saurabh Dhingra\\workspace\\libs\\geckodriver-v0.20.1-win64\\geckodriver.exe");

			driver = new FirefoxDriver();
		} else if(browserType.equals("edge")){
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\Saurabh Dhingra\\workspace\\libs\\MicrosoftWebDriver.exe");

			driver = new EdgeDriver();
		} else {
			System.out.println("Invalid browser");
		}

		// To Maximize the browser screen
		driver.manage().window().maximize();

		// By pass all cookies
		driver.manage().deleteAllCookies();

		driver.get(url);
	}

	@Test(priority = 0)
	public void verifyTitleOfGuru99LoginPage() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "Guru99 Bank Home Page";

		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Parameters({"userId", "password"})
	@Test(priority = 100, enabled = true)
	public void loginToGuru99(String username, String password) {

		WebElement userElement = driver.findElement(By.name("uid"));

		userElement.sendKeys(username);

		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("btnLogin")).click();

		String managerIdTextFromManagerPage = driver.findElement(By.xpath("//td[contains(text(), 'Manger Id : ')]"))
				.getText();

		String managerId = managerIdTextFromManagerPage.split(": ")[1];

		Assert.assertEquals(managerId, username);
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
