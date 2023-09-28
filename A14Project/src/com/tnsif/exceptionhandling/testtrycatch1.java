package com.tnsif.exceptionhandling;

public class testtrycatch1
{
public static void main(String args[])
{
	try
	{
	int data=50/0;
	//without the problem
	//int data=50/5;
	}
	catch(ArithmeticException e)
	{
	e.printStackTrace();
	System.out.println("The denominator must be greater than zero");
	}
	finally {
		System.out.println("Simple finally block");
	}
	System.out.println("rest of the code...");
	}
}