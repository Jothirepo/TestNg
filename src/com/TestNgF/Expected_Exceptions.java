package com.TestNgF;

import org.testng.annotations.Test;

public class Expected_Exceptions {
  
	@Test (expectedExceptions = NumberFormatException.class)
	public void arith() {

		String s = "jo10";
		
		int parseInt = Integer.parseInt(s);
		System.out.println(parseInt);
	}
}
