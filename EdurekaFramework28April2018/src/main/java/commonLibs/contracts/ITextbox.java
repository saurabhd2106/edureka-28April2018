package commonLibs.contracts;

import org.openqa.selenium.WebElement;

public interface ITextbox {
	public void setText(WebElement element, String textToSet) throws Exception;
	
	public void clearText(WebElement element) throws Exception;

}
