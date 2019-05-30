package com.string;

import java.util.Scanner;

public class CountWord {

	public static void main(String[] args) {

		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String str = sc.nextLine();
		char[] arr = str.toCharArray();

		for (char c : arr) {
			if (c != ' ')
				count = count + 1;
		}

		System.out.println("total no of word in string is=" + count);
	}

}
