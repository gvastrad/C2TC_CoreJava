package com.tnsif.lang;

public class StringOperationsDemo {

	public static void main(String[] args) {
		String s1 = new String("  Indian  ");
        String s2=s1.toUpperCase();
        
        System.out.println(s1);
        System.out.println(s2);
        
        System.out.println("The length of s1 is "+s1.length());
        System.out.println(s1.substring(2, 5));
		System.out.println(s2.substring(2));
		System.out.println(s1.trim());
		System.out.println(s1.isEmpty());
		// String Comparison
				
				String s3 = new String("Good Evening");
				String s4 = s3;
				System.out.println(s3 + " equals " + s4 + " -> " + s3.equals(s4));
				
				System.out.println(s3 + " equals " + s4 + " -> " + (s3==s4));
	}

}
