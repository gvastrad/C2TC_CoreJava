package com.tnsif.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	private int sid;
	
	private String sname;
	
	public Student(int id, String name) {
		this.sid = id;
		this.sname = name;
	}

	public Student() {
	}

	public int getId() {
		return sid;
	}

	public void setId(int id) {
		this.sid = id;
	}

	public String getName() {
		return sname;
	}

	public void setName(String name) {
		this.sname = name;
	}
}
