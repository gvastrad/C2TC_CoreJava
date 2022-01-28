package com;
public class StaticDemo {
	
	static int a = 10;
    static int b;
	static int c=25 ;
	static void func1()
	{
		System.out.println("The Values are");
		System.out.println("a value is "+a);
		System.out.println("b value is "+b);
		System.out.println("c value is "+c);
	}
	static void func2()
	{
	  int d= 19;
		System.out.println("d Values is"+d);
		System.out.println("c Value is"+c);
		 
	}
	
	static
	{
		System.out.println("Hi I am in static block ");
		// System.exit(0); 
		
	}
	
	public static void main(String[] args) {
		System.out.println("c Value is" +StaticDemo.c);
		StaticDemo obj=new StaticDemo();
		obj.func1();
		StaticDemo.func2();
	}

}
