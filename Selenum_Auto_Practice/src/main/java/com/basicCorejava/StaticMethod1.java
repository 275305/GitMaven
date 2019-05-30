package com.basicCorejava;

public class StaticMethod1 {
	
	static StaticMethod1  obj;
	
	static void bike() {
		System.out.println("static method");
	}
	
	
	public void  car() {
		System.out.println("public method");
	}
	
	
	public static void main(String[] args) {
		
		StaticMethod1.bike();
		
		   obj = new StaticMethod1();
		   
		   obj.car();
		    
		   
	}

}
