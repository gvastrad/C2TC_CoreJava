package com.tnsif.basics;

public class CharDemo {
	int b=65;
	public static void main(String[] args) {
		// assigning single character literal
		char ch = 'a';
		System.out.println(ch);

		// assigning number to char
		char ch1 = 65;
		System.out.println(ch1);

		// assigning unicode to char
		char var1 = '\u00A7';
		System.out.println(var1);

		// Unicode representation
		char var2 = '\u20AC';
		System.out.println(var2);

		// ASCI code representation
		int a = 'A';
		System.out.println(a);	
	}
}