package com.sudha.learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testSignIn {
	

WebDriver driver;
	@Parameters("browser")
	@BeforeClass
	public void setUp(String browser){
		if(browser.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();
		else if (browser.equalsIgnoreCase("chrome"))
		// chrome driver path
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathi\\Downloads\\qawork\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
	 else {
            throw new IllegalArgumentException("Invalid browser value!!");
        }
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathi\\Downloads\\qawork\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
//		//driver = new FirefoxDriver() ;
		driver.manage().window().maximize();
	driver.get("http://automationpractice.com/index.php");
	}
	

	//@Test
	public void dosignup()
	{
WelcomePage page = new WelcomePage(driver);

page.navsignIn().CreateAccountLoads().Create("test_unique@gmail.com").RegistrationFormLoads().RegisterValid();  // it return new Registration(driver)


// below lines are not needed as we know method chaining now
//Registration reg = new Registration(driver);
//
//reg.CreateAccountLoads();
//reg.Create("Raamya@gmail.com");




try {
	Thread.sleep(10000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
	
	
	@Test
	public void gettingName(){
		
		WelcomePage page = new WelcomePage(driver);
		page.getAllProductNames();
	}
	

	
	@AfterClass
	public void tearDown(){
		driver.close();
	}

}


