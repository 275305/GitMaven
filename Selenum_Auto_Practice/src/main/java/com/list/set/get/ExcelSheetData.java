package com.list.set.get;

import java.util.ArrayList;
import java.util.List;

public class ExcelSheetData {
	private static String empNameInExcelSheet = "201";
	private static String empAddressInExcelSheet = "50";
	private static String empIdInExcelSheet = "101";
	private static List<Object> excelSheet;
	
	public List<Object> getListExcelSheet(){
		excelSheet=new ArrayList<Object>();
		excelSheet.add(empNameInExcelSheet);
		excelSheet.add(empAddressInExcelSheet);
		excelSheet.add(empIdInExcelSheet);
		return excelSheet;
		
	}

}
