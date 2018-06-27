package com.Zopa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ZopaMemberSignUpPage extends BasicOperations {

	public ZopaMemberSignUpPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "member_email")
	private WebElement emailAddress;

	@FindBy(id = "applications_loan_apply_title_mr")
	private WebElement Title;
	@FindBy(id = "applications_loan_apply_first_name")
	private WebElement FirstName;
	@FindBy(id = "applications_loan_apply_last_name")
	private WebElement LastName;
	@FindBy(id = "applications_loan_apply_home_phone")
	private WebElement PhoneNumber;
	@FindBy(id = "date_of_birth_day")
	private WebElement DateOfBirth;
	@FindBy(id = "date_of_birth_month")
	private WebElement MonthOfBirth;
	@FindBy(id = "date_of_birth_year")
	private WebElement YearOfBirth;
	@FindBy(id = "applications_loan_apply_loan_purpose_car")
	private WebElement LoanReasonCar;
	@FindBy(id = "address_postcode")
	private WebElement PostCode;
	@FindBy(name = "find_address")
	private WebElement LookUpAddress;
	@FindBy(id = "address_possible_address")
	private WebElement PossibleAddress;
	@FindBy(id = "address_from_2i")
	private WebElement AddressMonth;
	@FindBy(id = "address_from_1i")
	private WebElement AddressYear;

	@FindBy(name = "select_address")
	private WebElement UseThisAddress;
	@FindBy(name = "cancel_address")
	private WebElement CancelThisAddress;

	@FindBy(id = "applications_loan_apply_employment_status_employed_full_time")
	private WebElement EmployementStatus;
	@FindBy(id = "applications_loan_apply_salary")
	private WebElement AnnualIncome;
	@FindBy(id = "applications_loan_apply_residential_status_owner_no_mortgage")
	private WebElement ResidentialStatus;
	@FindBy(id = "applications_loan_apply_rent")
	private WebElement RentAmount;
	@FindBy(id = "member_password")
	private WebElement UserPassword;
	@FindBy(id = "show_password")
	private WebElement Showpassword;

	// Defining all the user actions (Methods) that can be performed in this
	// page
	public void setEmail(String strEmail) throws Exception {
		textboxControl.setText(emailAddress, strEmail);
	}

	public void setTitle() throws Exception{
    	elementControl.click(Title);
   	 }

	public void setFirstName(String strFirstName) throws Exception {
		textboxControl.setText(FirstName, strFirstName);
	}

	public void setLastName(String strLastName) throws Exception {
		textboxControl.setText(LastName, strLastName);
		
	}

	public void setPhoneNumber(String strPhoneNumber) throws Exception {
		textboxControl.setText(PhoneNumber, strPhoneNumber);
		
	}

	public void setDateOfBirth(String strDateOfBirth) throws Exception {
		textboxControl.setText(DateOfBirth, strDateOfBirth);
		
	}

	public void setMonthOfBirth(String strMonthOfBirth) throws Exception {
		textboxControl.setText(MonthOfBirth, strMonthOfBirth);

	}

	public void setYearOfBirth(String strYearOfBirth) throws Exception {
		textboxControl.setText(YearOfBirth, strYearOfBirth);
		
	}

	public void setLoanReasonCar() throws Exception {
		elementControl.click(LoanReasonCar);
	}

	public void setPostCode(String strPostCode) throws Exception {
		textboxControl.setText(PostCode, strPostCode);
		
	}

	public void clickLookUpAddress() throws Exception {
		elementControl.click(LookUpAddress);
	}

	public void setAddress() throws Exception {		
		dropdownControl.selectViaIndex(PossibleAddress, 0);
		
	}

	public void setAddressMonth() throws Exception {
		dropdownControl.selectViaIndex(AddressMonth, 1);
		
	}

	public void setAddressYear() throws Exception {
		dropdownControl.selectViaIndex(AddressYear, 5);
		
	}

	public void clickUseThisAddress() throws Exception {
		elementControl.click(UseThisAddress);
	}

	public void setEmployementStatus() throws Exception {
		elementControl.click(EmployementStatus);
	}

	public void setAnnualIncome(String strAnnualIncome) throws Exception {
		textboxControl.setText(AnnualIncome, strAnnualIncome);
		
	}

	public void setResidentialStatus() throws Exception {
		elementControl.click(ResidentialStatus);
	}

	public void setRentAmount(String strRentAmount) throws Exception {
		textboxControl.setText(RentAmount, strRentAmount);
		
	}

	public void clickShowpassword() throws Exception {
		elementControl.click(Showpassword);
	}

	public void setUserPassword(String strUserPassword) throws Exception {
		textboxControl.setText(UserPassword, strUserPassword);
		
	}

}
