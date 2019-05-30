package com.read.excel.data.provider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTwo {
	public WebDriver driver;
	public WebDriverWait wait;
	String appURL = "https://www.linkedin.com/";
	
	//Locators	
	
	@BeforeClass
	public void testSetup() {
		String path = System.getProperty("user.dir");
		String driverPath = path + "\\lib\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 40);
	}
	

	@Test(dataProvider="empLogin")
	public void VerifyInvalidLogin(String userName, String password) {
		driver.navigate().to(appURL);
		driver.findElement(By.xpath("")).sendKeys(userName);
				
	}
	
	@DataProvider(name="empLogin")
	public Object[][] loginData() {
		//Object[][] arrayObject = getExcelData("D:/sampledoc.xls","Sheet1");
		return null;
	}

	/**
	 * @param File Name
	 * @param Sheet Name
	 * @return
	 */
	/*public String[][] getExcelData(String fileName, String sheetName) {
		String[][] arrayExcelData = null;
		try {
			FileInputStream fs = new FileInputStream(fileName);
			Workbook wb = Workbook.getWorkbook(fs);
			Sheet sh = (Sheet) wb.getSheet(sheetName);

			int totalNoOfCols = sh.getColumns();
			int totalNoOfRows = sh.getRows();
			
			arrayExcelData = new String[totalNoOfRows-1][totalNoOfCols];
			
			for (int i= 1 ; i < totalNoOfRows; i++) {

				for (int j=0; j < totalNoOfCols; j++) {
					arrayExcelData[i-1][j] = sh.getCell(j, i).getContents();
				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			e.printStackTrace();
		} 
		return arrayExcelData;*/
	

	@Test
	public void tearDown() {
		driver.quit();
	}
}
