package com.lambda.basics;

public class ClosuresAndEffectivelyFinal {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		perform(a, x -> System.out.println(a + b));

	}

	private static void perform(int a, Process p) {
		p.process(a);
	}
}

interface Process {
	public void process(int i);
}