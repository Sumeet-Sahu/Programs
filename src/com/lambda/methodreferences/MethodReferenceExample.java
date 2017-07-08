package com.lambda.methodreferences;

public class MethodReferenceExample {

	public static void main(String[] args) {

		//printMessage();
		
		Thread t = new Thread(() -> printMessage());
		
		t.start();
		
		t = new Thread(MethodReferenceExample::printMessage);
		
		t.start();
	}
	
	public static void printMessage(){
		System.out.println("Hello...");
	}

}
