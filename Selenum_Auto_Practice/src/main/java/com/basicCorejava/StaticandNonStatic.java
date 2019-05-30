package com.basicCorejava;

public class StaticandNonStatic {
	  
	int b=20;
	
	 StaticandNonStatic() {
			// TODO Auto-generated constructor stub
			System.out.println("constructer of the class");
		}
	static {
		int a=10;
		System.out.println("Static Block"+a);
	}
	
	{
		
		System.out.println("instance-block"+b);
	}
	
	
	public static void main(String[] args) {
		  System.out.println("main method");
		  new StaticandNonStatic();
		
		  
		
	}

}
