package com.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.addElement(new Integer(20));
		v.addElement(new Integer(30));
		v.addElement(new Integer(40));
		v.addElement(new Integer(50));
		
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			Object o=e.nextElement();
			System.out.println(o);
		}

	}

}
