package com.sudha.learn.listeners;

import org.testng.IExecutionListener;

public class ExecutionListener1 implements IExecutionListener {

	long execStartTime;
	

	// our class has the intelligence to listen on start of EXECUTION ..
	public void onExecutionStart() {
		
		execStartTime = System.currentTimeMillis();
		System.out.println("execution has started at time = " + execStartTime );
	
	}

	// our class has the intelligence to listen on end of EXECUTION ..
	public void onExecutionFinish() {
		
		long execTime =  System.currentTimeMillis() - execStartTime ;
		System.out.println("execution has taken time = " + execTime );
	
	}

}
