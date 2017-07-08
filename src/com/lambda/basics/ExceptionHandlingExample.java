package com.lambda.basics;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {

		int[] someNumbers = { 1, 3, 4, 5, 0, 9, 8, 4, 2 };
		int key = 5;

		performOperation(someNumbers, key, wrapperLambda((v, k) -> System.out.println(k / v)));

	}

	private static void performOperation(int[] someNumbers, int key, BiConsumer<Integer, Integer> biConsumer) {
		for (int i : someNumbers) {
			// System.out.println("in performOperation");
			biConsumer.accept(i, key);
		}
	}

	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> biConsumer) {
		return (v, k) -> {

			try {
				// System.out.println("in wrapperLambda");
				biConsumer.accept(v, k);
			} catch (ArithmeticException e) {
				System.out.println("ArithmeticException occured " + e.getMessage() + " Values ["+v+ " ," +k+"]");
			}
		};
	}
}
