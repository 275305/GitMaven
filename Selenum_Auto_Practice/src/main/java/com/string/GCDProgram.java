package com.string;

public class GCDProgram {

	public static void main(String[] args) {

		int a = 10, b = 5;

		System.out.println(gcd(a, b));

	}

	private static int gcd(int a, int b) {

		if (b == 0)
			return a;

		else
			return gcd(b, a % b);

	}

}
