package com.basicCorejava;

public class ThisKeyword {
	int age;
	String name;
	
	public ThisKeyword(int age, String name) {
		// TODO Auto-generated constructor stub
		
		this.age=age;
		this.name=name;
	}
	
	public void show() {
		System.out.println(age+" "+name);
	}
	
	public static void main(String[] args) {
		ThisKeyword th=new ThisKeyword(25,"Abc");
		
		th.show();
		
		 
		  
	}

}
