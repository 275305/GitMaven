package com.sendkeys;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class WithoutSenKeys {

	private static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Pradeep_Pracite_Purpose2\\Chrome\\chromedriver.exe");

		driver = new ChromeDriver();
		String baseUrl = "https://www.google.com/";
		driver.get(baseUrl);
		WebElement textValue=driver.findElement(By.xpath("//input[@name='q']"));
		JavascriptExecutor googleText=(JavascriptExecutor)driver;
				
		googleText.executeAsyncScript("arguments[0].value='pradeep Hyderabad'", textValue);
		
		
	}
}
