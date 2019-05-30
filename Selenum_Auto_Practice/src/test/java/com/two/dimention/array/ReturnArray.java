package com.two.dimention.array;

import java.util.Arrays;

public class ReturnArray {
		
	static String[][] arryData={ {"hyd"},{"Mumbai"}};
	public static String[][] getArrayData() {
	
	return arryData;

    }
	public static void main(String[] args) {
		
		String[][] arr=getArrayData();
		    System.out.println(Arrays.toString(arr));
	}


	

	
	
}