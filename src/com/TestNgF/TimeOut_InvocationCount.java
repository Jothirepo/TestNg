package com.TestNgF;

import org.testng.annotations.Test;

public class TimeOut_InvocationCount {

	
	@Test (invocationCount = 2)
	public void loop() {

		System.out.println("this refers to invocation count");
	}
	
	@Test (timeOut = 2000)
	public void timeup() throws InterruptedException {

		Thread.sleep(3000);
		System.out.println("expected time doesn't match with actual time");
	}
}
