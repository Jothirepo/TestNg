package com.TestNgF;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization_TestNg {

	@Test
	@Parameters ({"car", "enginetype"})
	public void car(String carname, String Engine) {		//---> method parameter name doesn't have to be same 
															//     as parameters annotations name
		System.out.println("car name is : " + carname);
		System.out.println("engine type is : " + Engine);
	}
	
}
