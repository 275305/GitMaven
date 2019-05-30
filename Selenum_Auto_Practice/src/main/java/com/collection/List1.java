package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.testng.Assert;

public class List1 {
	private static String empName = "Abhi";
	private static String empCity = "Hyderabad";
	private static int empAge = 21;
    private static List2 list2;
    private static ArrayList<Object> listData2;
    
	public static void main(String[] args) {
	    list2 = new List2();
		listData2 = list2.getListData();
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(empName);
		list.add(empAge);
		list.add(empCity);
		
		@SuppressWarnings("unchecked")
		List<ArrayList<Object>> alist1 = Arrays.asList(list);
		@SuppressWarnings("unchecked")
		List<ArrayList<Object>> alist2 = Arrays.asList(listData2);
		System.out.println(alist1);
		System.out.println(alist2);
		Assert.assertEquals(alist1, alist2);
		boolean b = alist1.equals(alist2);
		System.out.println(b);
	}
}
