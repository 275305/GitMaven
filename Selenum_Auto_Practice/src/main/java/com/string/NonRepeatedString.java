package com.string;

import java.util.HashSet;
import java.util.Set;

public class NonRepeatedString {

	public static void main(String[] args) {

		String str = "hyderabad Telangana";

		char[] arr = str.toCharArray();
		// convert set to array
		Set<Character> set = new HashSet<Character>();
		for (char c : str.toCharArray()) {

			set.add(c);

		}

		System.out.print(set);
	}

}
