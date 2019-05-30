package com.constructor;

public class EmployeeList {
	
	private String empName;
	private String empAddress;
	private int empId;
	
	public EmployeeList(String empName, String empAddress, int empId) {
		super();
		this.empName = empName;
		this.empAddress = empAddress;
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "EmployeeList [empName=" + empName + ", empAddress=" + empAddress + ", empId=" + empId + "]";
	}
	
	

}
