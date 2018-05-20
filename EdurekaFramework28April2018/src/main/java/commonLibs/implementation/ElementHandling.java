package commonLibs.implementation;

import org.openqa.selenium.WebElement;

import commonLibs.contracts.ICommonElements;

public class ElementHandling implements ICommonElements {

	public void click(WebElement element) throws Exception {
		
		element.click();
		
	}

	public String getText(WebElement element) throws Exception {
		
		return element.getText();
	}

	public String getAttribute(WebElement element, String attribute) throws Exception {
		
		return element.getAttribute(attribute);
	}

	public String getCssValue(WebElement element, String csspropertyName) throws Exception {
		
		return element.getCssValue(csspropertyName);
	}

	public boolean isElementEnabled(WebElement element) throws Exception {
		
		return element.isEnabled();
	}

	public boolean isElementVisible(WebElement element) throws Exception {
		
		return element.isDisplayed();
	}

	public boolean isElementSelected(WebElement element) throws Exception {
		
		return element.isSelected();
	}

}
