package com.read.excel.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelFile {
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
	private String[][] readdata;
	// Reading Excel File and get the data

	@Test
	public void readExcel_Files() throws IOException {

		String path = System.getProperty("user.dir");
		String otherFolder = path + "\\lib\\test_data.xlsx";

		FileInputStream fileStream = new FileInputStream(new File(otherFolder));

		workbook = new XSSFWorkbook(fileStream);
		sheet = workbook.getSheet("LogIn");

		colCount = sheet.getRow(0).getPhysicalNumberOfCells();

		System.out.println("No of Columns" + colCount);

		rowCount = sheet.getPhysicalNumberOfRows();

		System.out.println("no of Rows" + rowCount);

		excelData = new String[rowCount][colCount];

		for (int row = 0; row < rowCount; row++) {
			// row = sheet.getRow(row);
			for (int column = 0; column < colCount; column++) {
				cell = sheet.getRow(row).getCell(column);

				cell = sheet.getRow(row).getCell(column);
				System.out.print(" " + cell.getStringCellValue());
				// DataFormatter df = new DataFormatter();
				// excelData[row][column] = df.formatCellValue(cell);

			}
		}

		// return excelData;

	}
}
