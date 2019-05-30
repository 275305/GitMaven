package com.string;

public class StringPalindromeByStringBuffer {
	
	
	public static void main(String[] args) {
		
		String str="madam";
		 String rev=new StringBuffer(str).reverse().toString();
		 
		 if(str.equals(rev))
			 System.out.println("String is Palindrome");
		 else
			 System.out.println("String is Not palindrome");
		
	}

}
