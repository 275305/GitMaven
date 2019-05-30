package com.list.set.get;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.testng.Assert;

public class DataBaseTestData {
	private static DataBaseData dataBaseData;
	private static List<Object> dataBaseDataList;
	private static String empNameInDataBase = "201";
	private static String empAddressInDataBase = "50";
	private static String empIdInDataBase = "101";
	private static List<Object> listOfExcelData;

	private static ExcelSheetData excelSheetData;
	private static List<Object> listDataBase;

	public static void main(String[] args) {
		dataBaseDataList = new ArrayList<Object>();
		dataBaseDataList.add(empNameInDataBase);
		dataBaseDataList.add(empAddressInDataBase);
		dataBaseDataList.add(empIdInDataBase);
		
		/* create the object of DataBaseClass */
		dataBaseData = new DataBaseData();
		dataBaseData.setDataBaeData(dataBaseDataList);
		listDataBase = dataBaseData.getDataBaeData();
		/*sort the Data in ascending Order */
		Collections.sort(listDataBase,Collections.reverseOrder());
		System.out.println(listDataBase);
		/* create the Object of excel sheet Data and call the method */
		excelSheetData = new ExcelSheetData();
		listOfExcelData = excelSheetData.getListExcelSheet();
		
		/*sort the excel Data */
		Collections.sort(listOfExcelData,Collections.reverseOrder());
		System.out.println(listOfExcelData);
		
		/*Assert the excel sheet data(actual) and Data Base Data(excepted) */
		Assert.assertEquals(listOfExcelData, listDataBase);

	}

}
