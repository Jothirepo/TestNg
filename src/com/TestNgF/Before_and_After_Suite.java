package com.TestNgF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Before_and_After_Suite {

	public WebDriver driver;
	public long start;
	public long end;
	
	@BeforeSuite
	public void launchbrowser() {
		
		start = System.currentTimeMillis();
		System.setProperty("webdriver.edge.driver", "C:\\Users\\jovin\\Pictures\\Screenshots\\TestNgFrameWork\\msedgedriver.exe");
		driver = new EdgeDriver();// TODO Auto-generated method stub
	
	}
	
	@Test
	public void openGoogle() {
			
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void openBing() {
	
		driver.get("https://www.bing.com/");
	}
	
	@Test
	public void openYahoo() {

		driver.get("https://www.yahoo.com/");		
	}
	
	@AfterSuite
	public void closeBrowser() {

		driver.quit();
		end = System.currentTimeMillis();
		long totaltime = end - start;
		System.out.println(totaltime);
		 
	}
	
}
