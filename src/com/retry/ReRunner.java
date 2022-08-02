package com.retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReRunner implements IRetryAnalyzer {

	int start = 0;
	int end   = 4;
	
	@Override
	public boolean retry(ITestResult result) {

		if (start < end) {
			
			start ++;
			return true;
		}
		
		return false;
	}

	
}
