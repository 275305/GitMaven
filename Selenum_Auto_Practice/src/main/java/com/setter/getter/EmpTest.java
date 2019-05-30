package com.setter.getter;

import java.util.ArrayList;
import java.util.List;

public class EmpTest {
	private static String name="Miller";
	private static String empAddress="Hyderabad";
	private static int    empAge=26;
	private static List<Object> empList;
	public static void main(String[] args) {
		 empList=new ArrayList();
		  empList.add("ram");
		  empList.add("varanasi");
		  empList.add("27");
		EmpProperty empProperty=new EmpProperty();
		
		empProperty.setEmpName(name);
		empProperty.setEmpAddress(empAddress);
		empProperty.setEmpAge(empAge);
		empProperty.setEmpList(empList);
		
		System.out.println(empProperty.toString());
	}

}
