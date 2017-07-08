package com.strings;

public class StringReplaceTest {

	public static void main(String[] args) {

		String baseStatement = "My name is sumeet. sumeet lives in pune";

		String statement;
		
		System.out.println("Base string is == " + baseStatement);

		statement = baseStatement.replace("sumeet", "rahul");

		System.out.println("Updated string is == " + statement);
		
		statement = baseStatement.replaceAll("sumeet", "rahul");
		
		System.out.println("Updated string is == " + statement);

	}

}
