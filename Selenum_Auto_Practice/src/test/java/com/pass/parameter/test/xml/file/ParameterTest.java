package com.pass.parameter.test.xml.file;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.properties.PropertyReader;

public class ParameterTest {
	
	private WebDriver driver;
    private PropertyReader reader;
    private WebDriverWait wait;
	@BeforeClass
	public void initPage() {
		reader=new PropertyReader();
		String path = System.getProperty("user.dir");
		String fireFoxDriverPath = path + "//lib//geckodriver.exe";
		String chromeDriverPath = path + "//lib//chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 30);
	}
	
	@Test(priority=0)
	@Parameters("myName")
	public void getData(String myName) {
		
		System.out.println("parameterised value is"+myName);
		
		
	}
	
	

}
