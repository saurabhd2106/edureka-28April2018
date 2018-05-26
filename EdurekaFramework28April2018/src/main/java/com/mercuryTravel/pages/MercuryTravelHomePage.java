package com.mercuryTravel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonLibs.utils.WaitUtils;

public class MercuryTravelHomePage extends BasicOperations {
	
	private WebDriver driver;

	public MercuryTravelHomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText="International Holidays")
	private WebElement internationHolidayLink;
	
	@FindBy(linkText="Indian Holidays")
	private WebElement indianHolidayLink;
	
	@FindBy (linkText="Flights")
	private WebElement flightLink;
	
	
	@FindBy (linkText="Hotels")
	private WebElement hotelLink;
	
	//TO DO: Please update other links
	
	@FindBy(linkText="Customer Login")
	private WebElement customerLogin;
	
	
	@FindBy(linkText="User Login")
	private WebElement userLogin;
	
	
	@FindBy(linkText="Register")
	private WebElement RegisterLink;
	
	@FindBy(id="sign_user_email")
	private WebElement userEmailId;
	
	@FindBy(id="sign_user_password")
	private WebElement userPassword;
	
	@FindBy(xpath="//div[@id='modalLogin']//form[@class='form-signin']//button")
	private WebElement loginButton;
	
	@FindBy(partialLinkText="Welcome,")
	private WebElement welcomeText;
	
	public void userLogin(String emailId, String password) throws Exception{
		
		mouseControl.moveToElement(customerLogin);
		
		
		elementControl.click(userLogin);
		
		WaitUtils.waitTillElementVisible(driver, userEmailId, 5);
		textboxControl.clearText(userEmailId);
		
		textboxControl.setText(userEmailId, emailId);
		
		WaitUtils.waitTillElementVisible(driver, userPassword, 5);
		textboxControl.setText(userPassword, password);
		
		elementControl.click(loginButton);
		
	}
	
	public String getWelcomeText() throws Exception{
		
		WaitUtils.waitTillElementVisible(driver, welcomeText, 5);
		return elementControl.getText(welcomeText);
	}
}
