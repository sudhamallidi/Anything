package com.sudha.learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartPopUp {

		WebDriver driver ;
		
		public AddToCartPopUp(WebDriver driver){
				this.driver = driver ;
				PageFactory.initElements(driver, this);
		}


		@FindBy(className = "icon-ok")
		 private WebElement cartSuccessMessage ;
		 
		 @FindBy(xpath = "//a[@title='Proceed to checkout']")
		 private WebElement checkoutStep1 ;
		 
		 
		 @FindBy(id = "layer_cart_product_title")
		 private WebElement addedprocutName ;
				    
		 public AddToCartPopUp waitUntilPageLoads(){
				WebDriverWait wait = new WebDriverWait(driver, 5);
				wait.until(ExpectedConditions.visibilityOf(cartSuccessMessage));
				return this ;
			}
		 
		 public String getItemName(){
			 return addedprocutName.getText();
		 }

		 
		 
		 
}

