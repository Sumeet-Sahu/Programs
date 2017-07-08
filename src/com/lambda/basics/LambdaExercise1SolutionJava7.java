package com.lambda.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExercise1SolutionJava7 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Sumeet", "Sahu", 25), new Person("Rahul", "Roshan", 24),
				new Person("Jeetendra", "Rane", 42), new Person("Sameer", "Chandekar", 24));

		// Step1: Sort by last name

		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getlName().compareToIgnoreCase(o2.getlName());
			}
		});

		// Step2: Create method to print all list items
		System.out.println("============= All People =====================");
		printAll(people);

		// Step3: Create a method to print all persons that dont have last name
		// starting with "C"
		System.out.println("============= All People without C (lastName) Static =====================");
		printConditionallyStatic(people);

		System.out.println("============= All People without R (lastName) Dynamic =====================");
		printConditionallyDynamic(people, new Condition() {

			@Override
			public boolean testPerson(Person person) {
				return !person.getlName().startsWith("R");
			}
		});

		System.out.println("============= All People with S (firstName) Dynamic =====================");
		printConditionallyDynamic(people, new Condition() {

			@Override
			public boolean testPerson(Person person) {
				return person.getfName().startsWith("S");
			}
		});

	}

	private static void printConditionallyDynamic(List<Person> people, Condition condition) {
		for (Person person : people) {
			if (condition.testPerson(person))
				System.out.println(person);
		}
	}

	private static void printConditionallyStatic(List<Person> people) {
		for (Person person : people) {
			if (!(person.getlName().startsWith("C") || person.getlName().startsWith("c")))
				System.out.println(person);
		}
	}

	private static void printAll(List<Person> people) {
		for (Person person : people) {
			System.out.println(person);
		}
	}
}
