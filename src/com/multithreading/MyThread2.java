package com.multithreading;

public class MyThread2 extends Thread {
	
	public MyThread1 t1 = new MyThread1();

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " T2");
			if (i == 5)
				t1.interrupt();
		}
	}

}
