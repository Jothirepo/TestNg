package com.TestNgF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Parallel_Testing {

	static WebDriver driver;
	
	@Test
	public void google() {
		
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\jovin\\Pictures\\Screenshots\\TestNgFrameWork\\msedgedriver.exe");
		driver = new EdgeDriver();

		driver.get("https://www.google.com/");
	
	}
	
	@Test
	public void bing() {
		
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\jovin\\Pictures\\Screenshots\\TestNgFrameWork\\msedgedriver.exe");
		driver = new EdgeDriver();

		driver.get("https://www.bing.com/");

	}
}
