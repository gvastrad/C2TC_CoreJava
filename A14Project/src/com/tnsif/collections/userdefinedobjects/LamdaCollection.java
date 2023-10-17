package com.tnsif.collections.userdefinedobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LamdaCollection {
	public static void main(String[] args) {
	
	// User Defined Type
			ArrayList<Student> studentList = new ArrayList<Student>();
			Student s1 = new Student(11, "Pooja", 78);
			studentList.add(s1);
			s1 = new Student(21, "Nikita", 85);
			studentList.add(s1);
			s1 = new Student(13, "Deepa", 68);
			studentList.add(s1);
			s1 = new Student(41, "Neha", 72);
			studentList.add(s1);
			System.out.println(studentList);
			
			//Collections.sort(studentList); //CTE
			System.out.println("------------------------------------------");
			Comparator<Student> comp1 = (st1, st2) -> (int)(st1.getPer() - st2.getPer());
			Collections.sort(studentList,comp1); 
			System.out.println("Student details in Ascending order of Per : "+studentList);
}
}