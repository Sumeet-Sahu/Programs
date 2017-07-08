package com.strings;

public class InternTest {

	public static void main(String[] args) {

		String str = "abc";
		String str3 = "abcdef";
		String str2 = str+"def";
		
		System.out.println("Value = "+str3 == str2);

		String strX = "abc";
		String strX3 = "abcdef";
		String strX2 = (strX+"def").intern();
		
		System.out.println("ValueX = "+strX3.intern() == strX2.intern());
		System.out.println("Intern check XXXXXXXXX");
		System.out.println(strX2.intern() == strX3.intern());
		
		System.out.println("Equals check = "+strX2.equals(strX3));
		System.out.println("Intern check = "+strX2.intern() == strX3.intern());
		System.out.println("S2 intern = "+strX2.intern() +" ###### S3 intern = "+strX3.intern());
		System.out.println("S2 intern = "+strX2.hashCode() +" ###### S3 intern = "+strX3.hashCode());
		
		
	}
	
	public int add(int a,int b){
		return a+b;
	}

//	public float add(int a,int b){
//		return a+b;
//	}
}
