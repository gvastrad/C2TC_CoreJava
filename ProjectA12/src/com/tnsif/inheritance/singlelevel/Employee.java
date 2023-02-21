package com.tnsif.inheritance.singlelevel;

public class Employee {
	
private int id;
String name;
private float salary;


public Employee()
{
	System.out.println("In a default constructor");
}
public Employee(int id, String name, float salary) {
	this();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
void  m1()
{
	System.out.println(id);
}
}
