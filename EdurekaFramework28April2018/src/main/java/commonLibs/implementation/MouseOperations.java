package commonLibs.implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import commonLibs.contracts.IMouseOperation;

public class MouseOperations implements IMouseOperation {
	
	private WebDriver driver;
	
	public MouseOperations(WebDriver driver) {
		this.driver = driver;
	}
	
	private Actions getAction(){
		Actions action = new Actions(driver);
		
		return action;
	}
	public void dragAndDrop(WebElement element1, WebElement element2) throws Exception {
		
		getAction().dragAndDrop(element1, element2).build().perform();
		
	}

	public void moveToElement(WebElement element) throws Exception {
		getAction().moveToElement(element).build().perform();
		
	}

	public void rightClick(WebElement element) throws Exception {
		getAction().contextClick(element).build().perform();
		
	}

	public void doubleClick(WebElement element) throws Exception {
		getAction().doubleClick().build().perform();
		
	}

	public void moveToElementAndClick(WebElement element) throws Exception {
		getAction().moveToElement(element).click().build().perform();
		
	}

}
