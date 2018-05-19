package day7.selenium;

import java.awt.AWTException;

public class DemoEbayProject {

	public static void main(String[] args) throws AWTException {
		EbayProject ebay = new EbayProject();
		
		ebay.invokeBrowser();
		
		ebay.searchProduct("Apple Watch", "Watches");
		
		ebay.getNthProduct(10);
		
		System.out.println("--------------------------------");
		
		ebay.getAllProductsViaScrollDownViaJS();
	}

}
