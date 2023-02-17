package com.tnsif.inheritance.singlelevel;

public class SingleLevelInheritance {
	
public static void main(String args[]) {
	Employee e1=new Employee();
	e1.setId(101);
	e1.name="Gayatri";
	e1.setSalary(10000.0f);
	System.out.println(e1);
	e1.m1();
	
	Employee e2=new Employee(103,"Sahana",2000.0f);
	System.out.println(e2);
	
	Manager m1=new Manager("C2TC");
	m1.setId(102);
	m1.setName("Vikas");
	m1.setSalary(100000.0f);
	//m1.setDepartmentName("C2TC");
	System.out.println(m1);
}
}
