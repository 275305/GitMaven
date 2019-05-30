package com.string;

import java.util.Scanner;

public class CountVovels {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String str=sc.nextLine();
		 char[] arr =str.toCharArray();
		 int count=0;
		 for(char c: arr)
		 {  switch(c)
			  {
			  case'a':
			  case 'e':
			  case 'i':
			  case 'o':
			  case 'u':	  
			   count=count+1;
				  break;
			  }
		 }
		 
		System.out.println("No of vovels"+count);
	}

}
