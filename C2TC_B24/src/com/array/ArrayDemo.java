package com.array;

import java.util.Scanner;

public class ArrayDemo {

	int intNumbers[];
	ArrayDemo(int i )
	{
	intNumbers= new int[i];
	}
	void populateArray ()
	{
		System.out.println("Please eneter the array elements");
		Scanner sc=new Scanner(System.in);
	for(int i = 0; i < intNumbers.length ; i++)
	{
		
		intNumbers[i] = sc.nextInt();
	}
	}
	void displayContents ()
	{
	for(int i = 0; i <intNumbers.length ; ++i)
	{
	System.out.println("Number " + i + ": " + intNumbers[i]);
	}
	}
	public static void main(String[] args )
	{
	//Accepting array length as command line argument.
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the size of the array");
	int size = sc.nextInt();
	ArrayDemo ad = new ArrayDemo(size);
	//ad.displayContents();
	ad.populateArray();
	ad.displayContents();
	} 
	}

