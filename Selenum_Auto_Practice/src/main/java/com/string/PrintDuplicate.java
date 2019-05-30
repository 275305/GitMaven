package com.string;

public class PrintDuplicate {

	public static void main(String[] args) {

		// remove duplicate from array
		int c = 0;
		int arr[] = { 1, 2, 3, 4, 1, 2, 3 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					c = c + 1;
				}
			}
			if (c > 1) {
				System.out.println(arr[i] + " ->" + c);
			}
			c = 0;

		}

	}

}
