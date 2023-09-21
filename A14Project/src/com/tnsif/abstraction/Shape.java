package com.tnsif.abstraction;

public abstract class Shape {
	
	protected float area;
	
	 public Shape() {
		super();
	}

	//abstract method 
	abstract void calArea();
	
	 //concrete method
	 void show()
	 {
		 System.out.println("Area of shape is "+area);
	 }
}
