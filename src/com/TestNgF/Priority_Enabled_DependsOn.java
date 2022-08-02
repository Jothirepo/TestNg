package com.TestNgF;

import org.testng.annotations.Test;

public class Priority_Enabled_DependsOn {

	@Test(priority = 0)
	public void engineStart() {

		System.out.println("engine started");
	}

	@Test(priority = 1)
	public void firstGear() {

		System.out.println("this is first gear");
	}

	@Test(priority = 2)
	public void secondGear() {

		System.out.println("this is second gear");
	}

	@Test(priority = 3) 
	public void thirdGear() {

		System.out.println("this is third gear");
	}

	@Test (enabled = false)  
	public void fourthGear() {

		System.out.println("this is fourth gear");
	}

	@Test (dependsOnMethods = "fourthGear")
	public void musicon() {

		System.out.println("music on after fourth gear");

	}
	
	@Test (priority = 5)
	public void accar() {

		System.out.println("ac turned on after music");
	}
	
}
