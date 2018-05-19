package day2.selenium;

public class DemoChrome {

	public static void main(String[] args) {
		WorkingWithChrome ch = new WorkingWithChrome();
		
		ch.invokeBrowser();
		
		System.out.println(ch.getTitleOfThePage());
		
		ch.closeBrowser();

	}

}
