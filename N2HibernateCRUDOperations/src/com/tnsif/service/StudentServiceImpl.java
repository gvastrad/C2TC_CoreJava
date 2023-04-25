package com.tnsif.service;

import com.tnsif.dao.StudentDao;
import com.tnsif.dao.StudentDaoImpl;
import com.tnsif.entities.Student;

public class StudentServiceImpl implements StudentService{
	private StudentDao studentdao;
	
	public StudentServiceImpl()
	{
		studentdao=new StudentDaoImpl();
	}
	

	@Override
	public Student findStudentById(int id) {
		//no need of transaction, as it's an read operation
		Student student =studentdao.getStudentById(id);
		return student;
	}

	@Override
	public void addStudent(Student student) {
		studentdao.beginTransaction();
		studentdao.addStudent(student);
		studentdao.commitTransaction();		
	}

	@Override
	public void removeStudent(Student student) {
		studentdao.beginTransaction();
		studentdao.removeStudent(student);
		studentdao.commitTransaction();		
	}

	@Override
	public void updateStudent(Student student) {
		studentdao.beginTransaction();
		studentdao.updateStudent(student);
		studentdao.commitTransaction();
	}
		

}
