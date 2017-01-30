package com.sudha.learn;

import java.util.Iterator;
import java.util.List;

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
	
	//commenting larger xpath
//	@FindBy(xpath = "//div[@class='tab-content']/ul[@id='homefeatured']/li[1]/div/div[2]/h5/a")
//	private WebElement productName1 ;
	
	@FindBy(xpath = "//ul[@id='blockbestsellers']/li[1]//div[@class='right-block']//a[@class='product-name']")
	private WebElement productName1 ;
	
	@FindBy(xpath = "//ul[@id='blockbestsellers']/li[2]//div[@class='right-block']//a[@class='product-name']")
	private WebElement productName2 ;
	
	@FindBy(xpath = "//ul[@id='blockbestsellers']/li[3]//div[@class='right-block']//a[@class='product-name']")
	private WebElement productName3 ;
	
	
	//concept of list of weblements ... 
	@FindBy(xpath="//ul[@id='homefeatured']/li//div[@class='right-block']//a[@class='product-name']")
	private List<WebElement> productNames ;
	
	// locate with text contains ... 
	@FindBy(xpath= "//ul[@id='blockbestsellers']/li//div[@class='right-block']//span[contains(text(),'16.51')]")
	private WebElement productPrice ;
	
	
	//go back in DOM, parent, sibling ..  PREDICATES
	@FindBy(xpath= "//ul[@id='blockbestsellers']/li//div[@class='right-block']//span[contains(text(),'16.51')]/parent::div/preceding-sibling::h5/a")
	private WebElement productNameFromPrice ;
	
	
	
	
	public WelcomePage getAllProductNames(){

		for (WebElement prodName : productNames) 
		{System.out.println(prodName.getText());
		}
		return this;	
	}
	
	public WelcomePage getProductName(){
		
		System.out.println("on homepage now " + productName1.getText());
		System.out.println("on homepage now " + productName2.getText());
		System.out.println("on homepage now " + productName3.getText());
	
		return this ;
		//return new WelcomePage(driver);
	}
	
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
