package com.tnsif.encapsulation;

public class EmployeeDemo {

	public static void main(String[] args) {
		
			// Create the first object of the class and pass the two arguments with type
			// string and int.
			//System.out.println(Employee.companyName);
			Employee e1 = new Employee();
			e1.id=101;
			e1.name="Shubh";
			//e1.companyName="Infosys";
			System.out.println(e1);
			
			Employee e2 = new Employee();
			e2.id=102;
			e2.name="Sharath";
			System.out.println(e2);
			
			Employee e3 = new Employee();
			e3.id=103;
			e3.name="Jaya";
			System.out.println(e3);
			
			// Similarly, create the second object of the class and pass the two arguments.
			//e = new Employee("Deep", 321);
			//System.out.println(e);

	}

}
