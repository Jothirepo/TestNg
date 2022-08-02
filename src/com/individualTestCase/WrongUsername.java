package com.individualTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WrongUsername {

	public WebDriver driver;

	@BeforeSuite
	public void broswerlaunch() {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\jovin\\Pictures\\Screenshots\\TestNgFrameWork\\msedgedriver.exe");
		driver = new EdgeDriver();
	}

	@Test
	@Parameters({ "userid", "password" })
	public void crctusername(String usernam, String password) {

		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys(usernam);
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys(password);

	}
	
	@Test
	@Parameters({ "username", "pass" })
	public void wrongusername(String usernam, String password) {

		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys(usernam);
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys(password);

	}

	@AfterSuite
	public void Browserquit() {

		driver.quit();

	}

}
