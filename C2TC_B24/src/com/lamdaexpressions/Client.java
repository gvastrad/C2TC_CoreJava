package com.lamdaexpressions;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Predicate;
public class Client {
	
	public static void main(String args[])
	{
MaxFinder mf=(num1, num2)->num1>num2?num1:num2;
int max=mf.maximum(10, 40);
System.out.println(max);
Supplier s1=()->new Integer(10);
System.out.println(s1.get().toString());

BooleanSupplier bs=()->{ return true;};
System.out.println(bs.getAsBoolean());


Predicate<Integer> predicate = num -> num%2==0;
System.out.println(predicate.test (24));
System.out.println(predicate.test(21));
}
}
