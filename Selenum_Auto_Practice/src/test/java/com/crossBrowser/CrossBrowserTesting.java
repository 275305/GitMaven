package com.crossBrowser;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.properties.PropertyReader;

public class CrossBrowserTesting {

	private WebDriver driver;
    private PropertyReader reader;
		
	@Test()
	@Parameters("browser")
	public void getChromeBrowser(String browserName) {
		reader=new PropertyReader();
		String path = System.getProperty("user.dir");
		String fireFoxDriverPath = path + "//lib//geckodriver.exe";
		String chromeDriverPath = path + "//lib//chromedriver.exe";
		
		if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", fireFoxDriverPath);
			driver = new FirefoxDriver();
			driver.get(reader.getApplicationURL());
		
			
		} else if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", chromeDriverPath);
			driver = new ChromeDriver();
			driver.get(reader.getApplicationURL());
		}
		/*
		 * else if(browserName.equalsIgnoreCase("IE")) { System.setProperty("", "");
		 * driver=new InternetExplorerDriver(); }
		 */
	}
	@AfterClass()
	public void tearDown() {
		driver.close();
	}
}
