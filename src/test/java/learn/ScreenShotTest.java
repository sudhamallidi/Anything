package learn;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenShotTest {
	
	WebDriver driver ;
	String title ;
	
	@BeforeMethod
	public void setUp(){
		driver = new ChromeDriver();
	}
	
	@Test
	public void getMyntra(){
		
		driver.get("http://myntra.com");
		title = driver.getTitle();
		Assert.assertTrue(title.contains("Myntra"));

	}
	
	@Test
	public void getAmazon(){
		driver.get("http://amazon.in");
		title = driver.getTitle();
		Assert.assertTrue(title.contains("Chandra"));
	}
	
	@AfterMethod
	public void tearDown(ITestResult result){
		
		//result.getStatus()==2)
		if(result.getStatus()==ITestResult.FAILURE){
			// capture the screenshot
			// store the screenshot as a file .
			// rename the screenshot with testname .
			// create a folder in our repo and store the screenshot dere
		
	          try {
	            TakesScreenshot ts =(TakesScreenshot)driver;
	             
	            // Call method to capture screenshot  // save ctrl+ s
	            File source= ts.getScreenshotAs(OutputType.FILE);
	             
	            // Copy files to specific location here it will save all screenshot in our project home directory and
	            // result.getName() will return name of test case so that screenshot name will be same
	            FileUtils.copyFile(source, new File("./Screenshots/"+result.getName()+ System.currentTimeMillis() +".png"));
	            System.out.println("Screenshot taken");
	        
	        } catch (Exception e) {
	          System.out.println("Exception while taking screenshot "+e.getMessage());
	        }
			
		driver.close();
	}
	 
	

}}
