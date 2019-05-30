package com.window.handle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class WindowsHandling {

	private WebDriver driver;

	@Test(priority = 0)
	public void initPage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Pradeep_Pracite_Purpose2\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		String baseUrl = "https://www.google.com/";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL + "t");
		driver.get("https://www.flipkart.com/");
		
		driver.switchTo().defaultContent();

	}

	// @Test(priority=1)
	public void getNewTab() throws InterruptedException {
		// driver.findElement(By.cssSelector(".gb_d")).sendKeys(Keys.CONTROL +"t");

		/*
		 * String newTab=Keys.chord(Keys.CONTROL,"t");
		 * driver.findElement(By.linkText("Gmail")).sendKeys(newTab);
		 * Thread.sleep(3000);
		 */

		/* ((JavascriptExecutor) driver).executeScript("window.open"); */
		/*
		 * ArrayList<String> tab=new ArrayList<String>(driver.getWindowHandles());
		 * driver.switchTo().window(tab.get(0));
		 * driver.findElement(By.linkText("Gmail")).click();
		 * 
		 * 
		 * Thread.sleep(3000);
		 */

		// driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).sendKeys(Keys.CONTROL+"t");

		// driver.findElement(By.linkText("Gmail")).click();

		/*
		 * ArrayList<String> tabs=new ArrayList<String>();
		 * driver.switchTo().window(tabs.get(0)); driver.get("https://www.google.com/");
		 */
		// driver.findElement(By.linkText("Gmail")).click();
		/*
		 * String newTabs=Keys.chord(Keys.CONTROL,Keys.RETURN);
		 * driver.findElement(By.linkText("Gmail")).sendKeys(newTabs);
		 */
		// Thread.sleep(3000);
	}

	//@AfterClass
	public void tearDown() {
		driver.close();
	}
}
