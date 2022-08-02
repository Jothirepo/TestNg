package com.retry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


public class Login {
	
	@Test
	public void sample() {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\jovin\\Pictures\\Screenshots\\TestNgFrameWork\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();

		driver.get("www.google.com/");
	

	}
	
	@Test
	public void dummy() {

		System.out.println("this executed after retries");
	}
}
