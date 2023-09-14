package com.tnsif.inheritance.hirarchial;

public class Student extends Person{
	private int rollNo;
	private String clas;
	private float perc;

	public Student() {
		
	}

	public Student(String name, String city,int rollNo,String clas, float perc) {
		super(name,city);
		
		this.rollNo = rollNo;
		this.clas = clas;
		this.perc = perc;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

	public float getPerc() {
		return perc;
	}

	public void setPerc(float perc) {
		this.perc = perc;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", clas=" + clas + ", perc=" + perc + ", Name=" + getName()
				+ ", City=" + getCity() + "]";
	}
}
