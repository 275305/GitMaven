package com.string;

public class StringPalindrome {

	public static void main(String[] args) {
		int c = 0, m;

		String str = "nitin";

		char[] arr = str.toCharArray();
		int len = arr.length;

		int j = len - 1;

		m = len / 2;
		for (int i = 0; i < m; i++) {

			if (arr[i] == arr[j]) {
				j = j - 1;
				c = c + 1;	}
		}
		if (c == m)
			System.out.println("String is palindrome");
		else
			System.out.println("not palindrome");

	}

}
