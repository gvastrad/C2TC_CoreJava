package com.list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
	List ll=new LinkedList();
	Student s1=new Student(1,"Vidya","Mech");
    ll.add(s1);
    Student s2=new Student(2,"Indrani","CS");
    ll.add(s2);
    ll.add(new Integer(100));
    ll.add(0, new Employee(123,"Harry",10000));
    ll.remove(s1);
    ll.add(new Integer(100));
    ListIterator li=ll.listIterator();
    while(li.hasNext())
    {
    	Object o=li.next();
    	System.out.println(o);
    }
	}

}
