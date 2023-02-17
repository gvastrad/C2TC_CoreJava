package com.tnsif.basics;

class Sample{
	int a,b;
	
	void show()
	{
		System.out.println("Values are "+a+" " +b);
	}
}
public class FirstProgram {

	public static void main(String[] args) {
		Sample s=new Sample();
		s.show();
		int sum=10+20;
		System.out.println("Sum is " + sum);
	}
}
