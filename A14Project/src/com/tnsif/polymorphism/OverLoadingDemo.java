package com.tnsif.polymorphism;

public class OverLoadingDemo {

	public static void main(String[] args) {
System.out.println("------------------------ Constructor Overloading -----------------------");
		
		Point p = new Point(); //default constructor invoked
		System.out.println(p);

		Point p1 = new Point(14.5f); //single parameter constructor
		System.out.println(p1);

		Point p2 = new Point(12.5f, 20.50f); //two paramters constructor
		System.out.println(p2);
		
		System.out.println("------------------------ Method Overloading -----------------------");
		System.out.println("Addition of two integers : " + MethodOverLoading.addition(10, 20));
		System.out.println("Addition of two floating numbers :" + MethodOverLoading.addition(10.0f, 20.f));
		System.out.println("Addition of one integer and one float :" + MethodOverLoading.addition(10, 20.0f));
		System.out.println("Addition of one float and one integer :" + MethodOverLoading.addition(10.0f, 20));
		System.out.println("Addition of two Strings : " + MethodOverLoading.addition("Hello ", "World"));
	}

}
