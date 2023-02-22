package com.tnsif.interfaces;


public class IntefaceDemo {

	public static void main(String[] args) {
	
		SBI obj=new SBI();
		float interest=obj.getRateOfInterest();
		System.out.println("The rate of interest in SBI is "+interest);
			
		RBI obj1=new HDFC();
		interest=obj1.getRateOfInterest();
		System.err.println("The rate of interest in SBI is "+interest);
	}

}
