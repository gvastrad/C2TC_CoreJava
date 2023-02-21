package com.tnsif.polymorphism;

public class Calculation {
	
	int add(int a,int b) {
		int c=a+b;
		return c;
	}
	float add(int a,float b) {
		float c=a+b;
		return c;
	}

	float add(float a,int b) {
		float c=a+b;
		return c;
	}
}
