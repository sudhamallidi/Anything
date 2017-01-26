package learn;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Parllel {
	
	WebDriver driver ;
	
	
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathi\\Downloads\\qawork\\chromedriver_win32\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test(groups= "InProgress")
	public void stillInProgress(){
		
		
	}
	
	@Test(groups= "Completed")
	public void testOne(){
		
		driver.get("https://amazon.in");
		String title = driver.getTitle();
		AssertJUnit.assertTrue(title.contains("Online"));
			
	}
	
	@Test
	public void testTwo(){
		
driver.get("https://yahoo.com");
		
		String title = driver.getTitle();
		AssertJUnit.assertTrue(title.contains("Yahoo"));

	}

	@AfterMethod
	public void tearDown(){
		driver.close();
		driver.quit();
	
	}
	
	

}
