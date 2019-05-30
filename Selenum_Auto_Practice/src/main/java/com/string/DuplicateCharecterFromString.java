package com.string;

public class DuplicateCharecterFromString {
	// print the duplicate character from string
	public static void main(String[] args) {

		int i, j, c = 0;
		String str = "abc def abc";

		char[] arr = str.toCharArray();

		for (i = 0; i < str.length(); i++) {
			for (j = i; j < str.length(); j++) {
				if (arr[i] == arr[j] && arr[i] != ' ') {
					c = c + 1;
				}
			}

			if (c > 1) {
				System.out.println(arr[i] + " " + c);
			}
			c = 0;
		}

	}

}
