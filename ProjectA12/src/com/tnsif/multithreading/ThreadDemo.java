package com.tnsif.multithreading;

public class ThreadDemo {
	public static void main(String[] args)  {
		ChildThread t1 = new ChildThread(5, "First");
		ChildThread t2 = new ChildThread(10, "Second");

		t1.start();
		 t2.start(); 
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		System.out.println("-----------------------End of Main--------------------------");
	}
}


