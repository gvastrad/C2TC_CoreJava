package com.tnsif.basics;

public class FoorLoopExample {
	public static void main(String[] args) 
	{	
		for(int i = 5; i<=1000 ;i+=5)   //(int i = 1000; i<=1;i--)
		{	
			System.out.print("Value of i:");
			System.out.println(i);
		}
		
		//Generating multiplication table
		int num=2;
		for(int i = 1; i<=10 ;i++)   //(int i = 1000; i<=1;i--)
		{	
			System.out.println(num+" * "+i+" = "+num*i);
			//System.out.println(i);
		}
	}
}

