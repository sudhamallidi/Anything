package learn;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestExecListener {

	
	@BeforeClass
	public void beforeClass(){
		System.out.println("before class");
	}
	
	@Test
	public void testSome(){
		System.out.println("tests ");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("after class");
	}

	
}
