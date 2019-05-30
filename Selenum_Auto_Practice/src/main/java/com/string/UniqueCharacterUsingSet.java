package com.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueCharacterUsingSet {
	//print unique character in given String
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String to print unique String");
		    String str=sc.nextLine();
		    		    
		   Set setValue=new HashSet();
		   
		   for(int i=0;i<str.length();i++) {
			   
			   setValue.add(new Character(str.charAt(i)));
			   
		   }
		  			 
			 System.out.print(setValue);
		 
		   		    
	}

}
