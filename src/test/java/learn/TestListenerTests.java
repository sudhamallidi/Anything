package learn;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestListenerTests {
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("before class");
		
	}
	
	
	@Test
	public void t1(){
		System.out.println("t1 test method");
	}
	
	@Test
	public void t2(){
		System.out.println("t2 test method");
		int i = 10/0 ;
	}
	
	@Test
	public void t3(){
		System.out.println("t3 test method");
	}
	
	@Test
	public void t4(String p){
		System.out.println("t4 test method");
	}
	
	
	
	@AfterClass
	public void afterClass(){
		System.out.println("after class");
		
	}
	

}
