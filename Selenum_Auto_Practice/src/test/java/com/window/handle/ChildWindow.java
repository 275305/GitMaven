package com.window.handle;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ChildWindow {

	WebDriver driver;
	String baseUrl;

	@Test(priority = 0)
	public void initPage() {
		System.setProperty("webdriver.chrome.driver", "E:\\Pradeep_Pracite_Purpose2\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "https://www.google.com/";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.linkText("Images")).click();
		/*new Actions(driver).sendKeys(driver.findElement(By.tagName("html")), Keys.CONTROL)
				.sendKeys(driver.findElement(By.tagName("html")), Keys.NUMPAD2).build().perform();
		*/

	}

	// @Test(priority = 1)
	public void getChildWindow() {
		/*
		 * ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
		 * driver.switchTo().window(tabs.get(1));
		 */
		// driver.findElement(By.xpath("//a[contains(text(),'Images')]")).click();
		// driver.close();
		// driver.switchTo().window(tabs.get(0));
		// String oldTab = driver.getWindowHandle();
		driver.findElement(By.linkText("Images")).click();

		ArrayList<String> Tab = new ArrayList<String>(driver.getWindowHandles());
		System.out.println("size of window" + Tab.size());
		// newTab.remove(oldTab);
		// driver.switchTo().window(newTab.get(0));
		// driver.get(baseUrl);
		// driver.close();
		// driver.switchTo().window(oldTab);

	}

}
