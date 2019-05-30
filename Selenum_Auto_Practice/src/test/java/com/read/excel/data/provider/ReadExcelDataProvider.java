package com.read.excel.data.provider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadExcelDataProvider {
	private String path;
	private String data;
	private XSSFWorkbook workbook;
	private XSSFSheet sheet;
	private XSSFRow row;
	private XSSFCell cell;
	private String[][] excelData;
	private int colCount = 0;
	private int rowCount = 0;
	private int lastRow;
	WebDriver driver;
	WebDriverWait wait;
	String appURL = "https://www.google.com/";
	By googleText = (By) driver.findElement(By.xpath("//input[@name='q']"));

	@BeforeClass
	public void testSetup() {
		String path = System.getProperty("user.dir");
		String driverPath = path + "\\lib\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 40);
	}

	@Test(dataProvider = "empLogin")
	public void VerifyInvalidLogin(String userName) {
		driver.navigate().to(appURL);
		driver.findElement(googleText).sendKeys(userName);
	}

	@DataProvider(name = "empLogin")
	public Object[][] loginData() throws IOException {
		String path = System.getProperty("user.dir");
		String excelPath = path + "\\lib\\test_data.xlsx";
		String sheetName = "LogIn";
		Object[][] arrayObject = readExcel_Files(excelPath, sheetName);
		return arrayObject;
	}

	@Test
	public String[][] readExcel_Files(String fileName, String sheetName) throws IOException {
		//String[][] arrayData=null;
		FileInputStream fileStream = new FileInputStream(new File(fileName));
		workbook = new XSSFWorkbook(fileStream);
		sheet = workbook.getSheet(sheetName);
		colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("No of Columns" + colCount);
		rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("no of Rows" + rowCount);
		//excelData = new String[rowCount][colCount];
		   
		 String data[][] = new String[rowCount][colCount];
		  for (int i = 1; i <= rowCount; i++) {
		   Row r = sheet.getRow(i);
		   
		for (int j = 0; j< colCount; j++) {
		   Cell c = r.getCell(j);
		try {
		if (c.getCellType() == c.CELL_TYPE_STRING) {
		      data[i - 1][j] = c.getStringCellValue();
		} 
		else
		 {
		      data[i - 1][j] = String.valueOf(c.getNumericCellValue());
		}
		} catch (Exception e) {
		     e.printStackTrace();
		}
		   }
		  }
		/*for (int row = 0; row < rowCount; row++) {
			for (int column = 0; column < colCount; column++) {
				//cell = sheet.getRow(row).getCell(column);
				//System.out.println(arrayData[row][column]);
				//System.out.print(" " + cell.getStringCellValue());
				
				 System.out.println(arrayData[row][column]);
				
                          
			}
		}*/
		return data;
	}

}
