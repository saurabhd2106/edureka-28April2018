package commonLibs.implementation;

import org.openqa.selenium.WebElement;

import commonLibs.contracts.ITextbox;

public class TextboxControls implements ITextbox{

	public void setText(WebElement element, String textToSet) throws Exception {
		
		element.sendKeys(textToSet);
		
	}

	public void clearText(WebElement element) throws Exception {
		element.clear();
		
	}

}
