package com.tnsif.service;

import com.tnsif.entities.Student;

public interface StudentService 
{
	public abstract Student findStudentById(int id);
	public abstract void addStudent(Student student);
	public abstract void removeStudent(Student student);
	public abstract void updateStudent(Student student);
}