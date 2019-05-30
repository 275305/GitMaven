package com.interfacee.com;

import java.util.ArrayList;
import java.util.List;

public class EmpTest implements EmpDetails {
	private static List<Object> empList;

	public List<Object> empDetails() {
		
		return empList;
	}
	
	public static void main(String[] args) {
		
		empList = new ArrayList<Object>();
		empList.add("ram");
		empList.add("hyd");
		empList.add(21);
		System.out.println(empName);
		System.out.println(empAge);
		System.out.println(empList);
	}

}
