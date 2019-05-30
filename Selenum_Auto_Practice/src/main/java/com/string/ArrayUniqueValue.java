package com.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayUniqueValue {

	public static void main(String[] args) {
		int i = 0;
		Integer arr[] = { 10, 2, 4, 2, 6, 5, 7, 6, 1, 3, 2, 4 };

		// print list value
		List<Integer> list = Arrays.asList(arr);

		System.out.println(list);

		// print unique value
		Set<Integer> set = new HashSet<Integer>(list);

		System.out.println(set);

		// print sorted value
		Set<Integer> treeset = new TreeSet<Integer>(list);

		System.out.println(treeset);

	}

}
