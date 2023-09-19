package com.tnsif.polymorphism;

public class OverridingDemo {

	public static void main(String[] args) {
		Bank rbi=new Bank();

		System.out.println(rbi.getRateOfInterest());
//		Dynamic binding assigning child class object to parent class reference variable.
		rbi = new SBI();
		System.out.println(rbi.getRateOfInterest());

		rbi = new ICICI();
		System.out.println(rbi.getRateOfInterest());

	}

}

