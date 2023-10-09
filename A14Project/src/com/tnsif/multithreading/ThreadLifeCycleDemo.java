package com.tnsif.multithreading;

public class ThreadLifeCycleDemo extends Thread {

@Override
	public void run() {
	System.out.println("In side run() Thread is alive or not? " + this.isAlive());
	int num = 0;
	while (num < 4) {
		num++;
		System.out.println("num = " + num);
		
		try {
			sleep(2000);
			System.out.println("In not runnable stage, Thread is alive or not? " + this.isAlive());
		} catch (InterruptedException exp) {
			System.err.println("Thread Interrupted ...");
		}
	}
}

public static void main(String[] args) {
Thread myThread =new ThreadLifeCycleDemo();
System.out.println("Before Runnable stage Thread is alive or not? " + myThread.isAlive());
myThread.start();
try {
myThread.join();
}
catch (InterruptedException exp) {
	System.err.println("Thread Interrupted ...");
}
System.out.println("After complete execution of Thread ,it is alive or not? " + myThread.isAlive());
}
}