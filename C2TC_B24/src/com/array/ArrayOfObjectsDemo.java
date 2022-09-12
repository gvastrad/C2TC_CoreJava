package com.array;
import com.list.Student;
public class ArrayOfObjectsDemo {

	public static void main(String[] args) {
		Student arr[];
		arr=new Student[5];
       // Student s=new Student(101,"Harry","CS");
        
        arr[0]=new Student(101,"Harry","CS");
        arr[1]=new Student(102,"Potter","Mech");
        arr[2]=new Student(103,"John","CS");
        arr[3]=new Student(104,"Smith","EEE");
        arr[4]=new Student(105,"David","ECS");
        
        for(int i=0;i<arr.length;i++)
        {
        	System.out.println("The element at index" +i+"is");
        	System.out.println(arr[i].getId()+" "+arr[i].getName()+" "+arr[i].getBranch());
        } 
        
        
	}

}
