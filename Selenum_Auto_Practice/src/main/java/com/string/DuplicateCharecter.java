package com.string;

import java.util.Scanner;

public class DuplicateCharecter {
	// print the duplicate character from given string
	public static void main(String[] args) {
		int c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String str = sc.nextLine();
		System.out.println(str);
		char[] arr = str.toCharArray();
		System.out.println(arr.length);

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					c = c + 1;
				}
			}

			if (c > 1 && arr[i] != ' ')
				System.out.println(arr[i] + " : " + c);
			c = 0;
		}

	}

}
