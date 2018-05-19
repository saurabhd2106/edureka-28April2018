package day5;

public class DemoEbayProject {

	public static void main(String[] args) {
		EbayProject ebay = new EbayProject();
		
		ebay.invokeBrowser();
		
		ebay.searchProduct("Apple Watch", "Watches");
		
		ebay.getNthProduct(10);
		
		System.out.println("--------------------------------");
		
		ebay.getAllProductsViaScrollDownViaJS();
	}

}
