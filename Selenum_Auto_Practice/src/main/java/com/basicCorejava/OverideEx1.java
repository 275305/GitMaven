package com.basicCorejava;

class Bank{
	int a,b;
	public void sbiBank(int a,int b) {
		System.out.println("superclass "+a+" "+b);
	}
}

public class OverideEx1 extends Bank {
	
public void sbiBank(float a,int b) {
	
	System.out.println("subclass "+a+" "+b);
		
	}
	
	public static void main(String[] args) {
		
Bank bankObj=new  OverideEx1();
		
		bankObj.sbiBank(10, 20);
		
				
	}

}
