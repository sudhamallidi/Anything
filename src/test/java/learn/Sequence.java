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

	public class Sequence {
		
		WebDriver driver ;
		@BeforeMethod
		public void setUp(){
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		
		@Test
		public void sequnceOne(){
			driver.get("http://www.myntra.com/");
			String title = driver.getTitle();
			AssertJUnit.assertTrue(title.contains("Myntra"));
				
		}
		
		@Test
		public void sequnceTwo(){
			driver.get("https://jabong.com");	
		String title = driver.getTitle();
			AssertJUnit.assertTrue(title.contains("Jabong"));
		}
		
		@AfterMethod
		public void tearDown(){
			driver.close();
			driver.quit();
		
		}
		
		

	}

