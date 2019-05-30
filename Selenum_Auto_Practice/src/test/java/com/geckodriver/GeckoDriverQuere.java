package com.geckodriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.properties.PropertyReader;

public class GeckoDriverQuere {
	/*
	 * you can use FF version 53 and above with geckodriver V0.18.0 for Selenium
	 * 3.4.0 E:\Pradeep_Pracite_Purpose2\Firefoxv18\geckodriver.exe
	 */

	private WebDriver driver;
	private PropertyReader reader;

	@BeforeClass
	public void startBrowser() {
		String path = System.getProperty("user.dir");
		String driverPath = path + "\\lib\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver = new FirefoxDriver();
		reader = new PropertyReader();
	}

	@Test
	public void navigateToUrl() {

		driver.get(reader.getApplicationURL());
	}

	@AfterClass
	public void endTest() {
		driver.close();
	}

}
