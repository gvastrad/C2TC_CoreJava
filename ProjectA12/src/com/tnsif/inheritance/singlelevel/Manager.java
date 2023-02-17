package com.tnsif.inheritance.singlelevel;

public class Manager extends Employee {
private String departmentName;

public String getDepartmentName() {
	return departmentName;
}
public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}

public Manager(String departmentName) {
	super();
	this.departmentName = departmentName;
}

}
