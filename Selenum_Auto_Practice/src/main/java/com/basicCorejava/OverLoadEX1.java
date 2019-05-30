package com.basicCorejava;

public class OverLoadEX1 {
	 int a,b;
	public void bank(int a) {
		
		System.out.println(a);
	}
	
	public void bank(float b) {
		System.out.println(b);
		
	}
	
	
	public static void main(String[] args) {
		
		OverLoadEX1 obj=new OverLoadEX1();
		
		obj.bank(30);
		
	}

}
