package com.tnsif.client;

import com.tnsif.entities.Student;
import com.tnsif.service.StudentService;
import com.tnsif.service.StudentServiceImpl;

public class Client {

	
	
	public static void main(String[] args) 
	{
		StudentService service = new StudentServiceImpl();
		
		
		//Create operation
		/*
		 * Student student1=new Student(); student1.setId(2); student1.setName("Raina");
		 * service.addStudent(student1);
		 */
		 
		//Updation
		/*
		 * Student student = new Student(); student=service.findStudentById(0);
		 * student.setName("M S Dhoni"); service.updateStudent(student);
		 */
		 
		//Retrieval
		/*
		 * student=service.findStudentById(4);
		 * System.out.print("ID:"+student.getStudentid());
		 * System.out.println(" Name:"+student.getName());
		 */
		//Deletion
		
		 Student student=service.findStudentById(4);
		 service.removeStudent(student);
		 
		//Retrieval
			Student student2=new Student();
			 student2=service.findStudentById(0);
			  System.out.print("ID:"+student2.getId());
			  System.out.println(" Name:"+student2.getName());
			  
			  student2=service.findStudentById(2);
			  System.out.print("ID:"+student2.getId());
			  System.out.println(" Name:"+student2.getName());
			  
				/*
				 * student2=service.findStudentById(4);
				 * System.out.print("ID:"+student2.getId());
				 * System.out.println(" Name:"+student2.getName());
				 */
			 
		 
	}

}