package com.setter.getter;

import java.util.List;

public class EmpProperty {
	
	private String empName;
	private String empAddress;
	private int    empAge;
	private List<Object> empList;
	
	/*to generate set get use alt+shift+s+r*/
	
	public List<Object> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Object> empList) {
		this.empList = empList;
	}
	String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	@Override
	public String toString() {
		return "EmpProperty [empName=" + empName + ", empAddress=" + empAddress + ", empAge=" + empAge + ", empList="
				+ empList + "]";
	}
	
	
	
	
	
	
	

}
