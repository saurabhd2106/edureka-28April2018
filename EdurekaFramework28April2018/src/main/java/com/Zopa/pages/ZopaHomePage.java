package com.Zopa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZopaHomePage extends BasicOperations {

	public ZopaHomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Get a Zopa loan")
	private WebElement getZopaLoanLink;

	@FindBy(linkText = "Invest with Zopa")
	private WebElement investWithZopaLink;

	public void clickGetZopaHomeLoan() throws Exception {

		elementControl.click(getZopaLoanLink);

	}

}
