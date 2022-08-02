package com.individualTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CorrectUsername {

	@Test
	@Parameters({"userid", "password"})
	public void crctusername(String user, String password) {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\jovin\\Pictures\\Screenshots\\TestNgFrameWork\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys(user);
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys(password);
		driver.quit();

	}
}
