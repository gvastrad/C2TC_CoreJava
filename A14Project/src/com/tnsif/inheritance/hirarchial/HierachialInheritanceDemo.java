package com.tnsif.inheritance.hirarchial;

public class HierachialInheritanceDemo {

	public static void main(String[] args) {
		Person p=new Person();
		System.out.println("----------------- Person Details ---------------------");
		System.out.println(p);
		
		Person p1;
		p1 = new Person("Dhruv", "Mumbai");
	
		System.out.println("Person Details "+p1);
		
		p1=new Employee("Nikhil", "Mumbai", 101, 67000.00f, "Sales");
		
		System.out.println("Employee Details "+p1);
		
		p1=new Student("Pankaj", "Pune", 101,"FE", 88.0f);
		System.out.println("Student Details "+p1);
	}

}
