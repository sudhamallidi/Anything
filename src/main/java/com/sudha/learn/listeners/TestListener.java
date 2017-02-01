package com.sudha.learn.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

	public void onTestStart(ITestResult result) {
		// capturing the logs with method/test name
		System.out.println("tests / TESTNG methods have started " + result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		// logging
		System.out.println("tests / TESTNG methods have passed " + result.getMethod().getMethodName());
	}

	public void onTestFailure(ITestResult result) {
		
		
		// in real life scenarios : taking screenshots logic goes here
		System.out.println("tests / TESTNG methods have falied " + result.getMethod().getMethodName());
		
		
	}

	public void onTestSkipped(ITestResult result) {
		// logs 
		System.out.println("tests / TESTNG methods have skipped " + result.getMethod().getMethodName());		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("tests / TESTNG methods have do not know how to implement " + result.getMethod().getMethodName());	
	}

	public void onStart(ITestContext context) {
		// logs at class level or to define an scenario execution 
		System.out.println("test starts " + context.getName());
	}

	public void onFinish(ITestContext context) {
		System.out.println("tests finishes " + context.getName());	
	}


}
