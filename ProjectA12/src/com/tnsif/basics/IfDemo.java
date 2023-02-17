package com.tnsif.basics;

import java.util.Scanner;

public class IfDemo {
	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the value of x");
		int x =sc.nextInt();
		if (x != 5)
			System.out.println("Value of x is not eaqual to 5");
		System.out.println("Value of x is 5");
	}

}
