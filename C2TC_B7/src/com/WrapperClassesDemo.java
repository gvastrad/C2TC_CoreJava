package com;

public class WrapperClassesDemo {

	public static void main(String[] args) {
		// Unboxing
		Integer i=new Integer(10);
		System.out.println(i);
		int b=i.intValue();
		System.out.println(b);
		
		//Autoboxing
		int a=100;
		Integer i1=a;
		System.out.println(i1);
		
	}

}
