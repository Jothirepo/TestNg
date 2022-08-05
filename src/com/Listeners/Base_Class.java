package com.Listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

public class Base_Class {

public static WebDriver driver;
	
	
	@BeforeTest
	public void launch() {


		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\jovin\\Pictures\\Screenshots\\TestNgFrameWork\\msedgedriver.exe");
		
		driver = new EdgeDriver();

	}
	
	
	public void snap(String snapnamefromtestnameandformatgiven) {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(".\\Screenshots\\" + snapnamefromtestnameandformatgiven);
		
		try {
			FileUtils.copyFile(source, target);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("screenshot successfully captured");
	}
}
