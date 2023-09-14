package com.tnsif.inheritance.singlelevel;

public class Citizen {

	private String name;
	private int adhaarNumber;
	private long phNo;
	private String address;
	
	public Citizen() {
		super();
	}
	public Citizen(String name, int adhaarNumber, long phNo, String address) {
		this();
		this.name = name;
		this.adhaarNumber = adhaarNumber;
		this.phNo = phNo;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAdhaarNumber() {
		return adhaarNumber;
	}
	public void setAdhaarNumber(int adhaarNumber) {
		this.adhaarNumber = adhaarNumber;
	}
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", adhaarNumber=" + adhaarNumber + ", phNo=" + phNo + ", address=" + address
				+ "]";
	}

}
