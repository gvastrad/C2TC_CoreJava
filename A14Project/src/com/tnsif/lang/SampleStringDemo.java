package com.tnsif.lang;

public class SampleStringDemo {

	public static void main(String args[]) {

		// Simple String Operations
		char c[] = { 'I', 'n', 'd', 'i', 'a' };
		String s1 = new String(c);
		String s2 = new String(s1);
		String s3=  new String("India");
		
		// Using concatenation to prevent long lines.
				String longStr = "This is to show " + "how string concatination " + "can happen with additional  "
						+ "operator.";

				System.out.println(longStr);
				String s4="India";
				
				System.out.println(s1+" "+s2+" "+s3);			
}
}
