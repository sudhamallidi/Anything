package com.sudha.learn;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.Assert;

	public class AuthenticationPage {
		WebDriver driver ;
		
		public AuthenticationPage(WebDriver driver){
				this.driver = driver ;
				PageFactory.initElements(driver, this);

		}
		
		//Regstration section
		
		@FindBy(id="create-account_form")
		private WebElement RegistrationAccountCreation ;

		@FindBy(id="page-subheading")
		private WebElement CreateAnAccountText ;
		
		@FindBy(className="page-heading")
		private WebElement authenticationText;
		
		@FindBy(id="email_create")
		private WebElement EmailTextField ;
		
		@FindBy(id="SubmitCreate")
		private WebElement SubmitCreateButton ;
		
	//	Login section
		@FindBy(id="email")
		private WebElement loginEmail;
		
		@FindBy(id="passwd")
		private WebElement pasword ;
		
		@FindBy(id="SubmitLogin")
		private WebElement SubmitLoginButton ;
		
		public AuthenticationPage CreateAccountLoads(){
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.visibilityOf(RegistrationAccountCreation));
			
			return new AuthenticationPage(driver) ;
		}
		
		
		
	public RegistrationPage Create(String email)
	{
		//CreateAnAccountText.want to chk if text is correct
		//Assert.assertEquals("AUTHENTICATION",authenticationText.getText());
		
		try {
			Assert.assertEquals("AUTHENTICATION",authenticationText.getText());
		} catch ( Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		EmailTextField.sendKeys(email);
		SubmitCreateButton.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new RegistrationPage(driver) ;
	}

	}


