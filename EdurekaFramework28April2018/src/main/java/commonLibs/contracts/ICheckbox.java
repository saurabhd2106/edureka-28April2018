package commonLibs.contracts;

import org.openqa.selenium.WebElement;

public interface ICheckbox {
	public void changeCheckBoxStatus(WebElement element, boolean Status) throws Exception;
}
