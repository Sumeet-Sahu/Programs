package com.strings;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = "Sumeet";
		System.out.println("Welcome to string experiments " + string);

		System.out.println("Equality test for pooled objects");
		String s1 = "Test";
		String s2 = "Test";
		System.out.println("s1 == s2 :" + (s1 == s2));
		System.out.println("s1.equals(s2) :" + s1.equals(s2));

		String s3 = new String("Test");
		final String s4 = s3.intern();

		System.out.println(s2 == s3);
		System.out.println(s3 == s4);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s3));

		/////////////////////

		Object obj = new Object();

		String sx = "Rahul".intern();
		System.out.println("String intern check " + sx);
		String sx1 = sx.intern();
		String sx2 = new String("Rahul").intern();
		System.out.println("String intern check 2 " + (sx1.equals(sx2)));
		System.out.println("String intern check 2 " + (sx == (sx2)));
	}

}
