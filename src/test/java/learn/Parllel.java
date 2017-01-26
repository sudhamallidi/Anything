package learn;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Parllel {
	
	WebDriver driver ;
	
	
	@BeforeMethod
	public void setUp(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	@Test
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
