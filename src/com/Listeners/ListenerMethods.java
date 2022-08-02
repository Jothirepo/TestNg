package com.Listeners;

import java.io.File;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerMethods implements ITestListener {

	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Testcase is gonna start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {

		System.out.println("Test successful");
	}

	@Override
	public void onTestFailure(ITestResult result) {

		System.out.println("Test failed");
		
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File desti  = new File ("C:\Users\jovin\Pictures\Screenshots\TestNgFrameWork\Screenshots" + screenshotname);
//		};
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {

		System.out.println("Test skipped");
	}

//	@Override
//	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
//	}
//
//	@Override
//	public void onTestFailedWithTimeout(ITestResult result) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onTestFailedWithTimeout(result);
//	}

	@Override
	public void onStart(ITestContext context) {

		System.out.println("before everything");
		
	}

	@Override
	public void onFinish(ITestContext context) {
	
		System.out.println("after everything");

	}

	
	
}
