package com.upload.download.file;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.properties.PropertyReader;

public class UpLoadFile {

	private PropertyReader propertyReader;
	private WebDriver driver;
	private WebDriverWait wait;

	@BeforeClass
	public void initPage() {
		propertyReader = new PropertyReader();
		System.setProperty("webdriver.chrome.driver", propertyReader.getDriverPath());
		driver = new ChromeDriver();
		driver.get(propertyReader.getUploadUrl());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(propertyReader.getImplicitExplicitWait(), TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, propertyReader.getImplicitExplicitWait());
	}

	@Test
	public void uploadFileAtGuruDemoSite() {
		String path = System.getProperty("user.dir");
		String filePath = path + "//lib//Abc.txt";
		WebElement upLoadFile = driver.findElement(By.xpath(propertyReader.chooseFileTab()));
		upLoadFile.sendKeys(filePath);
		WebElement chooseCheckBox = driver.findElement(By.xpath(propertyReader.chooseCheckBox()));
		chooseCheckBox.click();
		WebElement submitFileTab = driver.findElement(By.xpath(propertyReader.submitFileTab()));
		submitFileTab.click();

	}

}
