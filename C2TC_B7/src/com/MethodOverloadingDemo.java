package com;

public class MethodOverloadingDemo {
	int add(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
	
	float add(float a, float b)
	{
		return a+b;
	}
	
	float add(int a,float b,int c)
	{
		return a+b+c;
	}
	
	float add(float a,int b, int c)
	{
		return a+b+c;
	}
	public static void main(String[] args) {
		MethodOverloadingDemo obj=new MethodOverloadingDemo();
		System.out.println(obj.add(10,10));
		System.out.println(obj.add(3.45f,5.67f));
		System.out.println(obj.add(10,20.22f,67));
		System.out.println(obj.add(24.67f,20,100));


	}

}
