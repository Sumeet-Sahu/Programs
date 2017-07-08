package com.examples.logical;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SingleEvenAmongOddOccurances {

	public static void main(String[] args) {
		Integer[] array = { 5, 3, 2, 5, 3, 2, 5, 3, 2, 5, 1 };
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(array));

		int xoredResult = array[0];
		for (int i = 1; i < array.length; i++) {
			xoredResult = xoredResult ^ array[i];
		}
		System.out.println("Result = " + xoredResult);

		for (int value : set) {
			xoredResult = xoredResult ^ value;
		}

		System.out.println("Result = " + xoredResult);
	}
}
