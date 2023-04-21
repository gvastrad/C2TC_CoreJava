package com.tnsif.lamdaexpressions;

public class LamdaWithoutParameter {

	public static void main(String[] args) {
		
		Statement s = () -> "Hello World!!";
		System.out.println(s.show());


	}

}