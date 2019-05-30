package com.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqStringUsingSet {
	//print the unique String value
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String to print unique String");
		    String str=sc.nextLine();
		        String [] strArray=str.split(" ");
		        
		        
		    
		      Set<Object> strSet=Arrays.stream(strArray).collect(Collectors.toSet());
		      
		      System.out.println(strSet);
		    
	}

}
