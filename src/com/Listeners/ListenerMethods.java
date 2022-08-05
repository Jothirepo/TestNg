package com.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerMethods extends Base_Class implements ITestListener {


	//Since for TestNg above 7, it follows Java 8. we need to add the unimplemented methods, doesn't happen by default.
	//unimplemented methods are implemented by right click >> source >> Override/Implement methods
	
	
	@Override
	public void onTestStart(ITestResult result) {

		String name = result.getName();
		System.out.println(name);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {

		System.out.println("on test success");
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		snap(result.getTestContext().getName() +"_" + result.getMethod().getMethodName() + ".png");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("on test skip");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		System.out.println("test fail but within success percent");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
		System.out.println("test failed due to timeout");
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("on start");
		
	}

	@Override
	public void onFinish(ITestContext context) {
	
		System.out.println("on finish");
	
	}

	
	
}
