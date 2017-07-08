package com.lambda.methodreferences;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.lambda.basics.Person;

public class MethodReferenceExample2 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Sumeet", "Sahu", 25), new Person("Rahul", "Roshan", 24),
				new Person("Jeetendra", "Rane", 42), new Person("Sameer", "Chandekar", 24));

		// Step1: Sort by last name

		Collections.sort(people, (p1, p2) -> p1.getlName().compareTo(p2.getlName()));

		// Step2: Create method to print all list items
		System.out.println("============= All People sorted with last name=====================");
		printConditionallyDynamicBehaviour(people, p1 -> true, System.out::println);
	}

	
	private static void printConditionallyDynamicBehaviour(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person person : people) {
			if (predicate.test(person))
				consumer.accept(person);
		}
	}
	


}
