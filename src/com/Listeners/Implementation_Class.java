package com.Listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerMethods.class)
public class Implementation_Class extends Base_Class {

//	@Test (priority = 0)
//	public void testmethodone() {
//
//		System.out.println("this is test method one's implementation part");
//	}
//
//	@Test (priority = 1)
//	public void testmethodtwo() {
//
//		System.out.println("this is test method two's implementation part");
//		Assert.assertTrue(false);
//	}
//
//	@Test(timeOut = 2000)
//	public void testmethodthree() throws InterruptedException {
//
//		Thread.sleep(3000);
//		System.out.println("this is test method three's implementation part");
//	}
//
//	@Test (priority = 2)
//	public void testmethodofur() {
//
//		System.out.println("this is test method four' implementation part");
//	}
//	
	@Test (testName = "facebook")
	public void fb() {
		
		driver.get("https://www.instagram.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "facebook");
	
	}
	
	@Test (testName = "instagram")
	public void insta() {
		
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "instagram");
	
	}
}
