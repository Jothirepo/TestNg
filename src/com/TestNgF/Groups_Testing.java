package com.TestNgF;

import org.testng.annotations.Test;

public class Groups_Testing {

	@Test (groups = "motorola")
	public void motovision() {

		System.out.println("motovision");
	}

	@Test (groups = "motorola")
	public void motopower() {

		System.out.println("motopower");
	}
	
	@Test (groups = "apple")
	public void applepro() {

		System.out.println("apple pro");
	}

	@Test (groups = "apple")
	public void applewatch() {

		System.out.println("apple watch");
	}
	
	@Test (groups = "lenovo")
	public void lenovolap() {

		System.out.println("lenovo laptop");
	}

	@Test (groups = "lenovo")
	public void leonovotab() {

		System.out.println("lenovo tablet");
	}
	
	@Test (groups = "dell")
	public void dellone() {

		System.out.println("dell one laptop");
	}

	@Test (groups = "dell")
	public void dellpro() {

		System.out.println("dell pro tablet");
	}
}
