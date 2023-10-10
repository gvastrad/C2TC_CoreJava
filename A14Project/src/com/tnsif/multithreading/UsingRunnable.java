package com.tnsif.multithreading;

public class UsingRunnable implements Runnable{
 private int l;
 private int h;
 private String msg;
 
	public UsingRunnable(int l, int h, String msg) {
	super();
	this.l = l;
	this.h = h;
	this.msg = msg;
}
	@Override
	public void run() {
		for (int i = l;i<=h;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Error " + e.getMessage());
			}
			System.out.println(msg + i);
		}
	}
}
