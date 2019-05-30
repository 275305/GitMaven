package com.geckodriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.properties.PropertyReader;

public class WindowHandling {
	/*
	 * you can use FF version 53 and above with geckodriver V0.18.0 for Selenium
	 * 3.4.0 E:\Pradeep_Pracite_Purpose2\Firefoxv18\geckodriver.exe
	 */
	private String driverPath = "https://www.google.com/";
	private WebDriver driver;
    private PropertyReader reader;
		
	@BeforeClass
	public void startBrowser() {
		reader=new PropertyReader();
		String path = System.getProperty("user.dir");
		String fireFoxDriverPath = path + "//lib//geckodriver.exe";
		String chromeDriverPath = path + "//lib//chromedriver.exe";
		
		System.setProperty("webdriver.gecko.driver", chromeDriverPath);
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		driver = new FirefoxDriver(capabilities);

	}

	@Test
	public void navigateToUrl() throws InterruptedException {
		driver.get("https://www.google.com/");

		/*
		 * ArrayList<String> tab=new ArrayList<String>(driver.getWindowHandles());
		 * 
		 * driver.get("https://www.flipkart.com/");
		 * driver.switchTo().window(tab.get(1));
		 */
		// driver.switchTo().window(tab.get(0));
		driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL + "t");
		driver.get("https://www.flipkart.com/");

		driver.switchTo().defaultContent();

		Thread.sleep(3000);

	}

	@AfterClass
	public void endTest() {
		driver.close();
	}

}
