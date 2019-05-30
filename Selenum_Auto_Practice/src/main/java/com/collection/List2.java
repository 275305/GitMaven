package com.collection;

import java.util.ArrayList;

public class List2 {
	private String empName = "Abhi";
	private String empCity = "Hyderabad";
	private int empAge = 21;
	private ArrayList<Object> list;
	public ArrayList<Object> getListData() {
	    list = new ArrayList<Object>();
		list.add(empName);
		list.add(empAge);
		list.add(empCity);
		return list;
	}
}
