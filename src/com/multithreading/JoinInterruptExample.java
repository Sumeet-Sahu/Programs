package com.multithreading;

public class JoinInterruptExample implements Runnable{

	Thread t1 = new Thread(this,"Sumeet");
	Thread t2 = new Thread(this,"Rahul");
	
	private void initT() {
		// TODO Auto-generated method stub

		System.out.println("INIT...");
		t1.start();
		t2.start();

	}
	public static void main(String[] args) {
	
		System.out.println("MAIN ............");
		JoinInterruptExample jie = new JoinInterruptExample();
		jie.initT();
	
	}

	@Override
	public void run() {

		System.out.println(this.getClass().getName());
		if(this.getClass().getName().equalsIgnoreCase("Sumeet"))
		{
			System.out.println("start of sumeet thread");
			try {
				t2.join();
				System.out.println("After join sumeet thread");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		if(this.getClass().getName().equalsIgnoreCase("Rahul")){
			System.out.println("Start of Rahul thread");
			t1.interrupt();
		}
	}

}
