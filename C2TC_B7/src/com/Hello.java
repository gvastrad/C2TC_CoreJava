package com;
public class Hello {

	public static void main(String[] args) {
		/*
		 * some notes 
		 * 1.Implicit(widening) 
		 * convert lower -> higher 
		 * byte->short,int,long
		 * 
		 * 2.Explicit 
		 * Convert Higher -> lower
		 * 
		 */
		
		
		 int value =9/2; float value2=10f/6f; double value3=10d/6d;
		 System.out.println("Value 1 ="+value);
		 System.out.println("Value 2 ="+value2);
		 System.out.println("Value 3 ="+value3);
	
		 
		 int marker=512; double percentage=marker*0.46f; //type casting
		 System.out.println("Percentage: "+percentage);
		 
		 typeCastingEx2();
		 preOperators();
		 
		 String var=new String("Hello Mate.");
		 System.out.println(var);
		 
		 postOperators();
		 
	}
	
	public static void typeCastingEx2()
	{
		float f=10.532f;
		long l=(long)f;
		System.out.println(l);
	}
	
	public static void preOperators() {
		int x=10,y=20;
		System.out.println(x+y);
		System.out.println("pre decrement: "+(--x));
		System.out.println("pre increment: "+(++y));
		System.out.println("Original value of x: "+x);
		System.out.println("Original value of y: "+y);
		
	}
	
	public static void postOperators() {
		int x=10,y=20;
		System.out.println(x+y);
		System.out.println("post decrement: "+(x--));
		System.out.println("post increment: "+(y++));
		System.out.println("Original value of x: "+x);
		System.out.println("Original value of y: "+y);
	}
}
