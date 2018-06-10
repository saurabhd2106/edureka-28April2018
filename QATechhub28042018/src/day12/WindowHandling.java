package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		ChromeDriver driver;
		String url = "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open";

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Saurabh Dhingra\\workspace\\libs\\chromeDriver36\\chromedriver.exe");

		driver = new ChromeDriver();

		// To Maximize the browser screen
		driver.manage().window().maximize();

		// By pass all cookies
		driver.manage().deleteAllCookies();

		driver.get(url);

		String parentWindow;

		parentWindow = driver.getWindowHandle();
		
		System.out.println("Parent window :: "+  parentWindow);

		driver.switchTo().frame("iframeResult");

		driver.findElement(By.tagName("button")).click();

		String childWindow;

		childWindow = driver.getWindowHandles().toArray()[1].toString();

		driver.switchTo().window(childWindow);

		System.out.println(driver.getTitle());

		driver.close();

		driver.switchTo().window(parentWindow);

		System.out.println(driver.getTitle());

		driver.quit();
	}

}
