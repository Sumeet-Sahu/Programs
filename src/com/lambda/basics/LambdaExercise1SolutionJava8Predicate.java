package com.lambda.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaExercise1SolutionJava8Predicate {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Sumeet", "Sahu", 25), new Person("Rahul", "Roshan", 24),
				new Person("Jeetendra", "Rane", 42), new Person("Sameer", "Chandekar", 24));

		// Step1: Sort by last name

		Collections.sort(people, (p1, p2) -> p1.getlName().compareTo(p2.getlName()));

		// Step2: Create method to print all list items
		System.out.println("============= All People sorted with last name=====================");
		printConditionallyDynamicBehaviour(people, p1 -> true, p -> System.out.println(p));

		// Step3: Create a method to print all persons that don't have last name
		// starting with "C"
		System.out.println("============= All People without C (lastName) Static =====================");
		printConditionallyDynamicBehaviour(people, p1 -> !p1.getlName().startsWith("C"), p -> System.out.println(p));

		System.out.println("============= All People without R (lastName) Dynamic =====================");
		printConditionallyDynamicBehaviour(people, p1 -> !p1.getlName().startsWith("R"), p -> System.out.println(p.getfName() + " "+p.getlName()));

	}

	
	//With use of Predicate interface you don't need to create another custom functional interface.
	// Predicate is generic interface with one abstract method 'test'
	private static void printConditionallyDynamic(List<Person> people, Predicate<Person> predicate) {
		for (Person person : people) {
			if (predicate.test(person))
				System.out.println(person);
		}
	}
	
	private static void printConditionallyDynamicBehaviour(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person person : people) {
			if (predicate.test(person))
				consumer.accept(person);
		}
	}
	

}
