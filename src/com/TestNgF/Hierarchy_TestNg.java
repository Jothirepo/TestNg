package com.TestNgF;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Hierarchy_TestNg {

	@Test (priority = 0)
	public void testone() {

		System.out.println("this is test one");
	}

	@Test (priority = 1)
	public void testtwo() {

		System.out.println("this is test two");

	}

	@Test (priority = 2)
	public void testthree() {

		System.out.println("this is test three");

	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("****************************");
		System.out.println("before method");
		
	}

	@AfterMethod
	public void afterMethod() {

		System.out.println("after method");
		System.out.println("****************************");
	}

	@BeforeClass
	public void beforeClass() {

		System.out.println("before class");
	}

	@AfterClass
	public void afterClass() {

		System.out.println("after class");
	}

	@BeforeTest
	public void beforeTest() {

		System.out.println("before test");
	}

	@AfterTest
	public void afterTest() {

		System.out.println("after test");
	}

	@BeforeSuite
	public void beforeSuite() {

		System.out.println("before suite");
	}

	@AfterSuite
	public void afterSuite() {

		System.out.println("after suite");
	}

}
