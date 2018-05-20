package commonLibs.contracts;

import org.openqa.selenium.WebElement;

public interface IFrames {
	
	public void switchToFrame(String frameId) throws Exception;
	
	public void switchToFrame(WebElement element) throws Exception;
	
	public void switchToFrame(int index) throws Exception;
	
	public void switchToDefaultContent() throws Exception;

}
