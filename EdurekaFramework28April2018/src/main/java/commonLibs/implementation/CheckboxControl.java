package commonLibs.implementation;

import org.openqa.selenium.WebElement;

import commonLibs.contracts.ICheckbox;

public class CheckboxControl implements ICheckbox {

	public void changeCheckBoxStatus(WebElement element, boolean Status) throws Exception {
		
		if((element.isSelected() && !Status) || (!element.isSelected() && Status)){
			element.click();
		}
		
	}

}
