package com.tnsif.inheritance.singlelevel;

public class Student extends Citizen {
   private int rollNo;
   private String collegeName;   
   
    public Student() {
	
}
	public Student(int rollNo,String collegeName,String name, int adhaarNumber, long phNo, String address) {
		super(name, adhaarNumber, phNo, address);
		this.rollNo=rollNo;
		this.collegeName=collegeName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", Name=" + getName()
				+ ", AddharNumber=" + getAdhaarNumber() + ", Phone=" + getPhNo() + ", Address="
				+ getAddress() + ", ]";
	}

}
