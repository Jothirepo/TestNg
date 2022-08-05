package com.TestNgF;

import org.testng.annotations.Test;

public class Always_Run_Attribute {

	@Test 
	public void arith() {

		String s = "jo10";
		
		int parseInt = Integer.parseInt(s);
		System.out.println(parseInt);
	}
	
	@Test (dependsOnMethods = "arith", alwaysRun = true)
	public void numb() {

		int a = 10;
		int b = 20;
		int c = a*b;
		
		System.out.println("this method ran successfully using alwaysRun attr : " + c);
	}
}
