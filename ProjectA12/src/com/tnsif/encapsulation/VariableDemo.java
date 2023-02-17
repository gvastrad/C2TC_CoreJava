package com.tnsif.encapsulation;

public class VariableDemo {
	//class variables
	 final static int a=10;
	float b=23.22f;	
	void m1()
	{
		int c=10;
		System.out.println(" the values of a and b are "+a+" "+b);
		System.out.println(" the values of c is "+c);
	}
	
	void m2()
	{
		
		System.out.println(" the values of a and b are "+a+" "+b);
	}
	
	public static void main(String args[])
	{
		System.out.println(VariableDemo.a);
		VariableDemo obj=new VariableDemo();
		obj.m1();
	}
}
