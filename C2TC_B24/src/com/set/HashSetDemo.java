package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set s=new HashSet();
		s.add(new Float(33.45f));
		s.add(new Float(33.45f));
		s.add(new Float(44.56f));
		s.add(new Integer(100));
		
		
		Iterator i1= s.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}