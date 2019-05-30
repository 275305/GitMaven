package com.compile.surefire.jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.properties.PropertyReader;

public class DriverTestByJenkins {

	private WebDriver driver;
	private PropertyReader reader;

	@Test
	public void getChromeBrowser() {
		reader = new PropertyReader();
		String path = System.getProperty("user.dir");
		String fireFoxDriverPath = path + "//lib//geckodriver.exe";
		String chromeDriverPath = path + "//lib//chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
		driver.get(reader.getApplicationURL());
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
