package com.TestNgF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Data_Provider {

	public static WebDriver driver;

	@BeforeSuite
	public void browserlaunch() {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\jovin\\Pictures\\Screenshots\\TestNgFrameWork\\msedgedriver.exe");
		driver = new EdgeDriver();

	}

	@Test(dataProvider = "logindata")
	public void crctusername(String user, String password) {

		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys(user);
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys(password);
//		WebElement click = driver.findElement(By.xpath("//button[@name='login']"));
//		click.click();
	}

	// 1stType with OBJECT 2D ARRAY
	@DataProvider(name = "logindata")
	public Object[][] logindataprovider() {

		return new Object[][] {

				{ "user1", "pass1" }, { "user2", "pass2" }, { "user3", "pass3" }, { "user4", "pass4" } };
	}

	// 1stType with STRING 2D ARRAY
	@DataProvider(name = "dataprovider2")
	public String[][] alternatedata() {

		return data;
	}

	String[][] data = { { "user1", "pass1" }, { "user2", "pass2" }, { "user3", "pass3" }, { "user4", "pass4" } };

	@AfterSuite
	public void browserkill() {

		driver.quit();
	}

}
