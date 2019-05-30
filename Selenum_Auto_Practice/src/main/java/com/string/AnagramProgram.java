package com.string;

import java.util.Arrays;
import java.util.Collections;

public class AnagramProgram {

	public static void main(String[] args) {
		char[] arr1 = { 'a', 'b', 'd', 'c' };
		char[] arr2 = { 'b', 'c', 'a', 'd' };

		if (angram(arr1, arr2))
			for (int i = 0; i < arr1.length; i++)
				System.out.print(arr1[i] + " " + arr2[i]);
		else
			System.out.print("Both string is not anagram" + arr1 + "" + arr2);
	}
	private static boolean angram(char[] arr1, char[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for (int i = 0; i < arr1.length; i++)
			if (arr1[i] != arr2[i])
				return false;

			else
				return true;

		return false;

	}

}
