package day12;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleImageUploadScenario {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver;
		String url = "https://images.google.com/";

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Saurabh Dhingra\\\\workspace\\\\libs\\\\chromeDriver36\\\\chromedriver.exe");

		driver = new ChromeDriver();

		// To Maximize the browser screen
		driver.manage().window().maximize();

		// By pass all cookies
		driver.manage().deleteAllCookies();

		driver.get(url);

		driver.findElement(By.id("qbi")).click();

		driver.findElement(By.linkText("Upload an image")).click();

		driver.findElement(By.id("qbfile")).click();

		Runtime.getRuntime()
				.exec("C:\\Users\\Saurabh Dhingra\\workspace_git\\QATechhub28042018\\scripts\\uploadImage.exe");

		// driver.quit();
	}

}
