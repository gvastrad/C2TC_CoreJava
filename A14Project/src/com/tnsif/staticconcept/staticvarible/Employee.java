package com.tnsif.staticconcept.staticvarible;

public class Employee {

	// Declare instance variables.
	    private String name;
		private int id;
		
		// Declare a static variable companyName with data type String and assign value
		// TNS which is common for all the objects.
		final static String COMPANY_NAME = "TNSIF";

		public Employee(String name, int id) {
			this.name = name;
			this.id = id;
		}

		@Override
		public String toString() {
			return "Employee [name=" + name + ", id=" + id + ", Company= "+COMPANY_NAME+"]";
		}
}
