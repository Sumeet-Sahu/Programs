package com.lambda.methodreferences;

import java.util.Arrays;
import java.util.List;

import com.lambda.basics.Person;

public class StreamsExample {
	

	public static void main(String[] args) {

		StreamsExample str = new StreamsExample();
		List<Person> people = Arrays.asList(new Person("Sumeet", "Sahu", 25), new Person("Rahul", "Roshan", 24),
				new Person("Jeetendra", "Rane", 42), new Person("Sameer", "Chandekar", 24));
		
		people.stream()
		.filter(p -> !p.getlName().startsWith("R"))
		.filter(p -> p.getfName().contains("u"));
		//.forEach(System.out::println);
		//.forEach(p -> System.out.println(p.getfName()));
		//.forEach(str::display);
	}
	
	public void display(Person p){
		System.out.println(p);
	}

}
