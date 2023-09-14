package com.tnsif.inheritance.hirarchial;

public class Employee extends Person{
	
	private int empId;
	private String deptName;
	private float empSalary;
	
	public Employee() {
		
	}

	public Employee(String name, String city,int empId, float salary, String dept) {
		super(name,city);
		this.empId = empId;
		this.deptName = dept;
		this.empSalary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", deptName=" + deptName + ", empSalary=" + empSalary + ", Name="
				+ getName() + ", City=" + getCity() + "]";
	}
	
}
