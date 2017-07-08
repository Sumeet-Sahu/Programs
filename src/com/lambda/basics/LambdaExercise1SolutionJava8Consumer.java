package com.lambda.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExercise1SolutionJava8Consumer {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Sumeet", "Sahu", 25), new Person("Rahul", "Roshan", 24),
				new Person("Jeetendra", "Rane", 42), new Person("Sameer", "Chandekar", 24));

		// Step1: Sort by last name

		Collections.sort(people, (p1, p2) -> p1.getlName().compareTo(p2.getlName()));

		// Step2: Create method to print all list items
		System.out.println("============= All People sorted with last name=====================");
		printConditionallyDynamic(people, p1 -> true);

		// Step3: Create a method to print all persons that don't have last name
		// starting with "C"
		System.out.println("============= All People without C (lastName) Static =====================");
		printConditionallyDynamic(people, p1 -> !p1.getlName().startsWith("C"));

		System.out.println("============= All People without R (lastName) Dynamic =====================");
		printConditionallyDynamic(people, p1 -> !p1.getlName().startsWith("R"));

	}

	
	//With use of Predicate interface you don't need to create another custom functional interface.
	// Predicate is generic interface with one abstract method 'test'
	private static void printConditionallyDynamic(List<Person> people, Predicate<Person> predicate) {
		for (Person person : people) {
			if (predicate.test(person))
				System.out.println(person);
		}
	}

}
