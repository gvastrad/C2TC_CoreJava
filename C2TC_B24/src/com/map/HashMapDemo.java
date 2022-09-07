package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		   map.put(7,"Mango");  //Put elements in Map  
		   map.put(2,"Apple");    
		   map.put(3,"Banana");   
		   map.put(5,"Grapes");   
		   map.put(null, null);
		   map.put(null, "berry");
		   map.put(5, null);
		 System.out.println("Iterating Hashmap...");  
		   
		   for(HashMap.Entry m1 : map.entrySet()){    
		    System.out.println(m1.getKey()+" "+m1.getValue());    
		   }  

	}

}
