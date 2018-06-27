package com.Zopa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonLibs.utils.WaitUtils;

public class ZopaLoanPage extends BasicOperations {
	private WebDriver driver;

	public ZopaLoanPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "submit-loan-button")
	private WebElement getPersonalisedrates;

	public void clickGetPersonalisedRates() throws Exception {
		//WaitUtils.waitTillElementClickable(driver, getPersonalisedrates, 5);
		//WaitUtils.waitForSeconds(5);
		mouseOperation.moveToElement(getPersonalisedrates);
		elementControl.click(getPersonalisedrates);

	}

}
