package commonLibs.implementation;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import commonLibs.contracts.IDropdown;

public class DropdownControl implements IDropdown{
	
	private Select getDropdown(WebElement element){
		 Select dropdown = new Select(element);
		 
		 return dropdown;
	}

	public void selectViaVisibleText(WebElement element, String visibleText) throws Exception {
		
		getDropdown(element).selectByVisibleText(visibleText);
		
		
	}

	public void selectViaValue(WebElement element, String value) throws Exception {
		getDropdown(element).selectByValue(value);
		
	}

	public void selectViaIndex(WebElement element, int index) throws Exception {
		getDropdown(element).selectByIndex(index);
		
	}

	public boolean isMultiple(WebElement element) throws Exception {
		
		return getDropdown(element).isMultiple();
	}

	public List<WebElement> getAllOptions(WebElement element) throws Exception {
		
		return getDropdown(element).getOptions();
	}

	public List<WebElement> getAllSelectedOptions(WebElement element) throws Exception {
		
		return getDropdown(element).getAllSelectedOptions();
	}

	public WebElement getFirstSelSectedOption(WebElement element) throws Exception {
		
		return getDropdown(element).getFirstSelectedOption();
	}

}
