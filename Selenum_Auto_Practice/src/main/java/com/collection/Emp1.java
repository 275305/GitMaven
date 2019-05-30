package com.collection;

import java.util.ArrayList;
import java.util.List;

public class Emp1 {
	
	private String name="Abhi";
	private String age="21";
	private String city="Hyderabad";
	private List<String> list1;
	
	public Emp1() {
		
		list1=new ArrayList();
		list1.add(name);
		list1.add(age);
		list1.add(city);
	}
	
	public List<String> getListEmployee(){
		return list1;
		
	}

}
