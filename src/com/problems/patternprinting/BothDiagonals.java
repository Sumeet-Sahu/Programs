package com.problems.patternprinting;

public class BothDiagonals {

	public static void main(String[] args) {
		System.out.println("BothDiagonals.java : Execution started : 23-Jul-2017 10:21:35 PM");
		int n = 5;
		printBothDiagonals(n);
	}

	private static void printBothDiagonals(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j || (i + j) == (n - 1))
					System.out.print(1);
				else
					System.out.print(0);
			}
			System.out.print("\n");
		}
	}
}
