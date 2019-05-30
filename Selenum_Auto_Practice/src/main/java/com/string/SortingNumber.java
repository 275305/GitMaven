package com.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SortingNumber {
	
	public static void main(String[] args) {
		Integer arr[]= {8,3,1,5,2,6,9,7};
		
		Set<Integer> setSort=new HashSet<Integer>(Arrays.asList(arr));
		
		System.out.println("sorted Arrays"+setSort);
		 
	}

}
