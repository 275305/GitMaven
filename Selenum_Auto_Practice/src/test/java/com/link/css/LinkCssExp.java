package com.link.css;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.properties.PropertyReader;

public class LinkCssExp {

	private WebDriver driver;
	private WebDriverWait wait;
    private PropertyReader reader;

	@Test(priority = 0)
	public void initPage() {
		reader=new PropertyReader();
		String path = System.getProperty("user.dir");
		String fireFoxDriverPath = path + "//lib//geckodriver.exe";
		String chromeDriverPath = path + "//lib//chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);

		driver = new ChromeDriver();
		String baseUrl = "https://phptravels.com/";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new WebDriverWait(driver, 30);
	}

	@Test(priority = 1)
	public void adPage() {

		// driver.findElement(By.xpath("//button[contains(text(),'No
		// Thanks')]")).click();

		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'No
		// Thanks')]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'No Thanks')]"))).click();
		driver.findElement(By.xpath("//div[@data-action='close-mc-modal']")).click();
	}

	@Test(priority = 2)
	public void featureTab() {

		WebElement featurePhpTravels = driver
				.findElement(By.xpath("//ul[@class='nav reset']//span[contains(text(),'Features')]"));
		featurePhpTravels.click();
	}

	@Test(priority = 3)
	public void hotelTab() {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.findElement(By.xpath("//a[contains(text(),'Hotels Module')]")).click();

	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
