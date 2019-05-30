package com.Frame.handling.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.properties.PropertyReader;

public class FrameExp {

	private WebDriver driver;
    private PropertyReader reader;

	@Test
	public void framePage() throws InterruptedException {
		reader=new PropertyReader();
		String path = System.getProperty("user.dir");
		String fireFoxDriverPath = path + "//lib//geckodriver.exe";
		String chromeDriverPath = path + "//lib//chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
		String baseUrl = "http://demo.guru99.com/test/guru99home/";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		/* scroll into down */
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,250)", "");
		//js.executeScript("window.scrollBy(0,250)", "");
		
		Thread.sleep(5000);
		 
		 // This  will scroll page 400 pixel vertical
		  ((JavascriptExecutor)driver).executeScript("scroll(0,2200)");
		WebElement srcFrame=driver.findElement(By.xpath("//iframe[@name='a077aa5e']"));
			srcFrame.click();
		/* switch over the frame */
		driver.switchTo().frame("a077aa5e");
		
		/* switch back to the previous page...... */
		driver.switchTo().defaultContent();
		
		System.out.println("successful back at previous page");
		driver.findElement(By.xpath("//input[@id='philadelphia-field-email']")).sendKeys("abcd@gmail.com");
	
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
