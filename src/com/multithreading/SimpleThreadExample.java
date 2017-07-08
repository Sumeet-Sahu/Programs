package com.multithreading;

public class SimpleThreadExample {

	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(i + " T1");
					if(i==5)
						;
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(i + " T2");
					if (i == 2)
						try {
							t1.join();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}

			}
		});

		System.out.println("=========== THREAD PROPERTIES ================");

		System.out.println("NAME : " + t1.getName());
		System.out.println("PRIORITY : " + t1.getPriority());
		System.out.println("ID : " + t1.getId());
		System.out.println("STATE : " + t1.getState());

		System.out.println("ALIVE : " + t1.isAlive());
		System.out.println("DAEMON : " + t1.isDaemon());
		t1.setDaemon(true);
		System.out.println("DAEMON : " + t1.isDaemon());
		
		t1.start();
		t2.start();
		
		
	}

}
