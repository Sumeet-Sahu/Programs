package com.designpatterns;

public class Singleton {

	private static Singleton single;
	
	private Singleton()
	{
		System.out.println("in const1");
	}

	public void print()
	{
		System.out.println("This is the single instance");
	}
	
	public static Singleton getInstance()
	{
		System.out.println("in const2");
		if(single == null)
		{
			single = new Singleton();
			return single;
		}
		else
		{
			return single;
		}
	}
}

class SingletonTest {

	public static void main(String[] args) {
		
		Singleton single = Singleton.getInstance();
		single.print();
		
		methodPrintA(null);
	}
	
	private static void methodPrintA(Object object) 
	{
		System.out.println(" Object");
	}
	
	private static void methodPrintA(Integer[] integerArray) 
	{
		System.out.println("Array");
	}
}

