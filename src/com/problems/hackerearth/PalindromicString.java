package com.problems.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * You have been given a String S. You need to find and print whether this string is a palindrome or not. If yes, print "YES" (without quotes), else print "NO" (without quotes).
 * 
 * Input Format
 * The first and only line of input contains the String
 * The String shall consist of lowercase English alphabets only.
 * 
 * Output Format
 * Print the required answer on a single line.
 * 
 * Constraints
 * 1≤|S|≤100
 */

public class PalindromicString {
	public static void main(String[] args) throws IOException {
		System.out.println("PalindromicString.java : Execution started : 19-Jul-2017 1:27:27 AM");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sequence = br.readLine();
		System.out.println(isPalindromicString(sequence));
	}

	private static String isPalindromicString(String sequence) {
		String isPalindromic = "YES";
		for (int i = 0; i <= (sequence.length() / 2); i++) {
			if (sequence.charAt(i) != sequence.charAt(sequence.length() - i-1)) {
				isPalindromic = "NO";
				break;
			}
		}
		return isPalindromic;
	}
}
