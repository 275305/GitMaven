package com.window.handle;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTabExp {
	
	WebDriver driver;
	String baseUrl;
	@Test(priority = 0)
	public void initPage() {
		System.setProperty("webdriver.chrome.driver", "E:\\Pradeep_Pracite_Purpose2\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		 baseUrl = "https://www.google.com/";
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
	}
	
	@Test(priority=1)
	public void getNewTab() throws InterruptedException {
		String parentWindow=driver.getWindowHandle();
		String SelectLinknewTab=Keys.chord(Keys.CONTROL,Keys.RETURN);
		driver.findElement(By.linkText("Images")).sendKeys(SelectLinknewTab);
		ArrayList<String> Tab = new ArrayList<String>(driver.getWindowHandles());
		System.out.println("size of window" + Tab.size());
		//goto the next(child) window
		driver.switchTo().window(Tab.get(1));
		Thread.sleep(2000);
		//close the child window
		driver.close();
		Thread.sleep(2000);
		//switch to the parent window
		driver.switchTo().window(Tab.get(0));
		//close to the parent window
		driver.close();
		
	}
}
