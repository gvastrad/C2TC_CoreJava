package com;
class car
{
	final int max_speed=120;
	void controlSpeed()
	{
	//	max_speed=180; This will generate an error you Can't change value of final stated variables.
	System.out.println("Max Speed value is " +max_speed);
	}
}
public class FinalKeywordDemo {

	public static void main(String[] args) {
		car obj=new car();
		obj.controlSpeed();
}
}
