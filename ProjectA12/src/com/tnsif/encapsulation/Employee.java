package com.tnsif.encapsulation;

public class Employee {
	// Declare instance variables.
		 String name;
		 int id;
		
		// Declare a static variable companyName with data type String and assign value
		// TNS which is common for all the objects.
		static String companyName = "TNS";

		@Override
		public String toString() {
			return "Employee [name=" + name + ", id=" + id  +"companyName=" +companyName+"]";
		}
}
