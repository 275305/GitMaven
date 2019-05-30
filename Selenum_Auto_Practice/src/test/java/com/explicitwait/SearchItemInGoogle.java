package com.explicitwait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchItemInGoogle {
	WebDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void initPage() {
		System.setProperty("webdriver.chrome.driver", "E:\\Pradeep_Pracite_Purpose2\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 30);
	}

	@Test(priority = 0)
	public void getSearch() {
		driver.findElement(By.xpath("//a[@class='gb_x gb_Vb']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Shopping')]")))
				.click();

	}

	@Test(priority = 1)
	public void itemSearchPage() {
		driver.findElement(By.xpath("//input[@class='sh-dh__stf']")).sendKeys("SamsungJ7 Prime");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='lmxmKb']"))).click();
		}
	
	@Test(priority=2)
	public void getAllItemList() {
		//div[@jsname='s2gQvd']
		
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
