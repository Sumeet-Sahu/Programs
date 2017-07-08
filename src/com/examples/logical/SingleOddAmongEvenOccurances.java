package com.examples.logical;

public class SingleOddAmongEvenOccurances {

	public static void main(String[] args) {
		int[] array = { 5, 3, 2, 5, 3, 2, 5, 3, 2, 5, 1, 3, 2, 1, 2 };
		int xoredResult = array[0];
		for (int i = 1; i < array.length; i++) {
			xoredResult = xoredResult ^ array[i];
		}
		System.out.println("XOR Result = " + xoredResult);
	}
}
