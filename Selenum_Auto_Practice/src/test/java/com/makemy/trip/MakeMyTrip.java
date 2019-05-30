package com.makemy.trip;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.properties.PropertyReader;

public class MakeMyTrip {

	
	private WebDriver driver;
	private WebDriverWait wait;
	private String[] expected = { "My Biz", "International Flights", "International Hotels", "Deals", "Blog" };
	PropertyReader propertyReader = new PropertyReader();
	HomePage homepage;

	@BeforeClass
	public void initPage() {
		System.setProperty("webdriver.chrome.driver", propertyReader.getDriverPath());
		driver = new ChromeDriver();
		driver.get(propertyReader.getApplicationURL());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(propertyReader.getImplicitExplicitWait(), TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, propertyReader.getImplicitExplicitWait());
	}

	@Test(priority = 0)
	public void getSearch() {
		//WebElement roundTrip = driver.findElement(By.xpath("//ul[@class='fswTabs latoBlack greyText']/li[2]"));
		homepage=new HomePage(driver); 
		homepage.roundTripText();
		//String round=propertyReader.roundTrip();
		
		    
		WebElement fromCity = driver.findElement(By.xpath("//label[@for='fromCity']"));
		fromCity.click();
		WebElement fromInputText = driver.findElement(By.xpath("//input[@placeholder='From']"));
		fromInputText.sendKeys(Keys.DELETE);
		fromInputText.sendKeys("Mumbai");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='From']")));
	}

	@Test(priority = 1)
	public void getFrom() {
		WebElement toCity = driver.findElement(By.xpath("//label[@for='toCity']"));
		toCity.click();
		WebElement fromInputText = driver.findElement(By.xpath("//input[@placeholder='To']"));
		fromInputText.sendKeys(Keys.DELETE);
		fromInputText.sendKeys("Hyderabad");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='To']")));

	}

	// assert the list of web element

	@Test(priority = 2)
	public void getListMakeMyTrip() throws InterruptedException {

		WebElement moreTabMakeMyTrip = driver.findElement(By.xpath("//span[@class='darkGreyText']"));
		moreTabMakeMyTrip.click();
		List<WebElement> actualListOfMoreTab = driver
				.findElements(By.xpath("//div[@class='moreOption font16 latoBold']"));
		
		System.out.println("listSize" + actualListOfMoreTab.size());
		Iterator<WebElement> itr = actualListOfMoreTab.iterator();

				for (int i = 0; i < expected.length; i++) {
			// best logic
			while (itr.hasNext()) {
				String actualValue = itr.next().getText();
				String[] spilitedActualValue = actualValue.split("\\s+");
				System.out.println("expected value" + expected[i]);
				//System.out.println("splitedValue" + spilitedActualValue[i] + " " + spilitedActualValue[i + 1]);
				Assert.assertEquals(spilitedActualValue[i] + " " + spilitedActualValue[i + 1], expected[i]);
                 propertyReader.getImplicitExplicitWait();
                 System.out.println("assertion Pass");
			}

		}

	}

	// @Test(priority = 2)
	public void getDepartureMakeMyTrip() throws InterruptedException {
		WebElement departureTab = driver.findElement(By.xpath("//label[@for='departure']"));
		departureTab.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='departure']")));
		// error is here for date
		WebElement dateOfDeparture = driver.findElement(By.xpath(
				"//div[@class='DayPicker-Day DayPicker-Day--start DayPicker-Day--selected']/div/p[contains(text(),'30')]"));

		dateOfDeparture.click();
		propertyReader.getImplicitExplicitWait();
	}

	@AfterClass
	public void tearDown() {
		driver.close();

	}
}
