package com.sudha.learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WelcomePage {
	
WebDriver driver ;
	
	public WelcomePage(WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="search_query_top")
	private WebElement searchTextField ;
	
	@FindBy(xpath="//div[@class='header_user_info']/a")
	private WebElement signInLink ;
	
	//comem
	
	@FindBy(id="homefeatured")
	private WebElement pageLoadConfirmed;
	
	@FindBy(id = "dumyID")
	private WebElement addToCartButton ;
	
	public void waitUntilPageLoads(){
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(pageLoadConfirmed));
	}
	
	public void waitUntilElementLoads(WebElement element){
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}

	
	public void addToCart(){
		
		Actions action = new Actions(driver);
	//	action.moveToElement(wesfsd).build.perform ;
		waitUntilElementLoads(addToCartButton);
		addToCartButton.click();
	}
	
	public void searchSel() {
		searchTextField.sendKeys("Tunics");
		System.out.println("chandra" + searchTextField);
	}
	
	public AuthenticationPage navsignIn(){
		signInLink.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new AuthenticationPage(driver);
	}
	
	
	
	
	

}
