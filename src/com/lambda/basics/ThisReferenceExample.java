package com.lambda.basics;

public class ThisReferenceExample {

	public void doProcess(int a, Process p) {
		p.process(a);
	}

	public static void main(String[] args) {
		ThisReferenceExample obj = new ThisReferenceExample();
		obj.execute();
	}

	private void execute() {
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();

		thisReferenceExample.doProcess(10, new Process() {

			@Override
			public void process(int i) {
				System.out.println("Value of i is " + i);
				System.out.println(this);
			}

			public String toString() {
				return "This is anonymous inner class for Process";
			}
		});

		
		System.out.println("Inside Execute this:"+this);
		
		thisReferenceExample.doProcess(10, p -> {
			System.out.println(p);
			System.out.println(this);
		});

	}

}
