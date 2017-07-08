package com.multithreading;

public class MyThread1 extends Thread {

	MyThread2 t2 = new MyThread2();

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 5)
				try {
					t2.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
