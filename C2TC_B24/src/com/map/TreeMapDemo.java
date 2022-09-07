package com.map;

import java.util.TreeMap;
import java.util.Map;
public class TreeMapDemo {
	 public static void main(String args[])
	 
	 {
	TreeMap<Integer,String> map=new TreeMap<Integer,String>();  
    map.put(108,"Amit");    
    map.put(102,"Ravi");    
    map.put(101,"Vijay");    
    map.put(103,"Rahul");    
   // map.put(null, "Xaviour");
   map.put(105, null);
      //removing entry based on key
   //get an enrty
   //replace an entry
    for(Map.Entry m:map.entrySet()){    
     System.out.println(m.getKey()+" "+m.getValue());   
}
	 }
}
