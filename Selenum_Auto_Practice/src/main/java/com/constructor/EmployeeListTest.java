package com.constructor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeListTest {

	public static void main(String[] args) {
		List<EmployeeList> list = new ArrayList<EmployeeList>();
		EmployeeList empList1 = new EmployeeList("Raj", "hyd", 101);
		EmployeeList empList2 = new EmployeeList("Scoot", "Kanpur", 102);
		EmployeeList empList3 = new EmployeeList("Smith", "Lucknow", 103);
		

		list.add(empList1);
		list.add(empList2);
		list.add(empList3);
		Iterator<EmployeeList> itrEmp = list.iterator();

		while (itrEmp.hasNext()) {
			System.out.println(itrEmp.next().toString());
		}

	}

}
