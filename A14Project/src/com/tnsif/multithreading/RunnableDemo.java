package com.tnsif.multithreading;

public class RunnableDemo {
	public static void main(String[] args) {
		UsingRunnable ur = new UsingRunnable(10, 20, "Thread1");
		UsingRunnable ur1 = new UsingRunnable(5, 10, "Thread2");
		Thread t1=new Thread(ur);
		Thread t2=new Thread(ur1);
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
