package com.parallelTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.properties.PropertyReader;

public class ParallelExecution {
	
	private WebDriver driver;
    private PropertyReader reader;
	
	@BeforeClass
	public void initPage() throws InterruptedException {
		reader=new PropertyReader();
		String path = System.getProperty("user.dir");
		String fireFoxDriverPath = path + "//lib//geckodriver.exe";
		String chromeDriverPath = path + "//lib//chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
		String baseUrl = "https://www.google.com/";
		/*driver.get(baseUrl);*/	
		driver.navigate().to(baseUrl);
		Thread.sleep(3000);
				}
	
	@Test
	public void testSuit() {
		
			
	}

}
