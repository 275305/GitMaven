package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Emp2 {
	String name="Abhi";
	String age="21";
	String city="Hyderabad";
	private List<String> emp2;
	private Emp1 emp1;
	
	public Emp2() {
		
		emp1=new Emp1();
		
		List<String> list=emp1.getListEmployee();
		System.out.println(list);
		
		  emp2=new ArrayList();
		 emp2.add(name);
		 emp2.add(age);
		 emp2.add(city);
		
		 
		System.out.println(emp2);
		
		 /* List<Emp1> actual=;
		  List<List<Object>> expected=;*/
		
		Collection<Emp1> listOne=Arrays.asList(emp1);
		                        Collection<List<String>> listTwo=Arrays.asList(emp2);
		
		//Assert.assertEquals(Arrays.asList(emp1),Arrays.asList(emp2));
		
	}
	
	public static void main(String[] args) {
		
		
		 new Emp2();
	}

}
