package com.sudha.learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class RegistrationPage {
	
	WebDriver driver ;
	public RegistrationPage(WebDriver driver)
		{
			this.driver = driver ;
			PageFactory.initElements(driver, this);

	}
	
	@FindBy(id="noSlide")
	private WebElement RegistrationFormPage ;
	
	   @FindBy(xpath = "//label[@for='id_gender2']")
	   private WebElement mrstext ;

	    @FindBy(id="id_gender2")
		private WebElement mrsRadioButton ;
		
		@FindBy(id="id_gender1")
		private WebElement mrRadioButton ;

		@FindBy(xpath="//label[@for='customer_firstname']")
		private WebElement textabovefirstname;
		
		@FindBy(id="customer_firstname")
		private WebElement FirstNametextfield  ;

		@FindBy(id="customer_lastname")
		private WebElement LastNametextfield ;
		
		@FindBy(id="passwd")
		private WebElement password;
		
		@FindBy(id="days")
		private WebElement DOBdropdown ;
		
		@FindBy(id="months")
		private WebElement MOBDropDown ;
		
		@FindBy(id="years")
		private WebElement YOBDropDown ;
		
		@FindBy(id="company")
		private WebElement CompanyTextField ;

		@FindBy(id="address1")
		private WebElement Address1TextField ;
		
		@FindBy(id="address2")
		private WebElement Address2TextField ;
	
		@FindBy(id="city")
		private WebElement CityTextField ;

		@FindBy(id="id_state")
		private WebElement StateDropDown ;
		
		@FindBy(id="postcode")
		private WebElement ZipcodeTextField ;

		@FindBy(id="id_country")
		private WebElement CountryDropDown ;

		@FindBy(id="phone_mobile")
		private WebElement PhnoTextField ;
		
		@FindBy(id="alias")
		private WebElement AlternateAddressField ;

		@FindBy(id="submitAccount")
		private WebElement RegisterButton ;
		
		public RegistrationPage RegistrationFormLoads(){
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.visibilityOf(RegistrationFormPage));
			
			//return this ;
			return new RegistrationPage(driver);
		}
		
		
		public void RegisterValid()
		{
		//checking the text next to radio button	
	    Assert.assertEquals("Mrs.",mrstext.getText());
		mrsRadioButton.click();
		Assert.assertEquals("First name *",textabovefirstname.getText());
		FirstNametextfield.clear();
		FirstNametextfield.sendKeys("Matrix12");

		LastNametextfield.clear();
		LastNametextfield.sendKeys("mat");

		 password.clear();
		 password.sendKeys("asdfg");

		new Select(DOBdropdown) .selectByValue("5");
	    new Select(MOBDropDown).selectByValue("5");
	    new Select(YOBDropDown).selectByValue("1980");
	    
	    CompanyTextField .clear();
	    CompanyTextField.sendKeys("Relaince");

	    Address1TextField.clear();
	    Address1TextField.sendKeys("123,battery st,sfo");
		
	    Address2TextField.clear();
	    Address2TextField.sendKeys("123,battery st,sfo");
	    
	    CityTextField.clear();
	    CityTextField.sendKeys("sfo");
	    
	    new Select(StateDropDown).selectByVisibleText("California");
	    
	    ZipcodeTextField.clear();
	    ZipcodeTextField.sendKeys("94563");
	    
	    new Select(CountryDropDown).selectByVisibleText("United States");
	    
	    PhnoTextField.clear();
	    PhnoTextField.sendKeys("4156343421");
	    
	    AlternateAddressField.clear();
	    AlternateAddressField.sendKeys("345,chinatwn,sfo");
	    
	    RegisterButton.click();
	    

}
}
