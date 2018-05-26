package day9.selenium;

public class DemoEbayProect {

	public static void main(String[] args) {
		EbayProject ebay = new EbayProject();
		
		ebay.invokeBrowser();
		
		String result = ebay.searchProduct("Apple Watch", "Watches");
		
		System.out.println("Result :: "+ result);
	}

}
