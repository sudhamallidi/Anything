package learn;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestExecListener2 {
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("before class in 2");
	}
	
	@Test
	public void testSome(){
		System.out.println("tests in 2 ");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("after class in 2");
	}

}
