package day5;

public class DemoWorkingWithChrome {

	public static void main(String[] args) {
		
		WorkingWithChrome wc = new WorkingWithChrome();
		
		wc.invokeBrowser();
		
		String titleOfThePage;
		
		titleOfThePage = wc.getTitleOfThePage();
		
		System.out.println("Title of the page :: "+ titleOfThePage);
		
		wc.navigateCommands();
		
		wc.closeBrowser();
	}

}
