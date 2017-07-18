package com.problems.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringToggleCase {
	public static void main(String[] args) throws IOException {
		System.out.println("StringToggleCase.java : Execution started : 12-Jul-2017 2:10:41 AM");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sequence = br.readLine();
        StringBuilder toggledString = new StringBuilder(sequence.length());
        for (int i=0;i<sequence.length();i++) {
			if(Character.isLowerCase(sequence.charAt(i))) {
				toggledString.append(Character.toUpperCase(sequence.charAt(i)));
			}
			else {
				toggledString.append(Character.toLowerCase(sequence.charAt(i)));
			}
		}
        System.out.println(toggledString);
	}
}
