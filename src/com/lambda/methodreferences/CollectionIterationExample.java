package com.lambda.methodreferences;

import java.util.Arrays;
import java.util.List;

import com.lambda.basics.Person;

public class CollectionIterationExample {

	public static void main(String[] args) {	
		
		List<Person> people = Arrays.asList(new Person("Sumeet", "Sahu", 25), new Person("Rahul", "Roshan", 24),
				new Person("Jeetendra", "Rane", 42), new Person("Sameer", "Chandekar", 24));
		
		System.out.println("========== Using typical for loop =================");
		for(int i =0; i<people.size();i++){
			System.out.println(people.get(i));
		}
		
		System.out.println("========== Using for in loop =================");
		for (Person person : people) {
			System.out.println(person);
		}
		
		System.out.println("========== Using foreach method =================");
		people.forEach(p -> System.out.println(p));
		people.forEach(System.out::println);

	}

}
