package com.tnsif.staticconcept.staticvarible;

public class EmployeeDemo {

	public static void main(String[] args) {
		// Create the first object of the class and pass the two arguments with type
		// string and int.
		//System.out.println(Employee.companyName);
		Employee e = new Employee("Shubh", 123);
		System.out.println(e);
		
		// Similarly, create the second object of the class and pass the two arguments.
		Employee e1 = new Employee("Deep", 321);
		System.out.println(e1);
		
		Employee e2 = new Employee("Gayatri", 321);
		System.out.println(e2);
		
		System.out.println("The compnay name is "+ Employee.COMPANY_NAME);
	}
}
