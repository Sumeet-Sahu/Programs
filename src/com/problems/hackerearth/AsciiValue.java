package com.problems.hackerearth;

import java.util.Scanner;

public class AsciiValue {

	public static void main(String[] args) {
		System.out.println("AsciiValue.java : Execution started : 11-Jul-2017 1:37:11 AM");

		Scanner s = new Scanner(System.in);
		Character character = s.next().charAt(0);

		System.out.println((int) character);
	}
}
