package com.tnsif.lamdaexpressions;

@FunctionalInterface
interface Message{  
    public void greet(String name);    
 } 

@FunctionalInterface
interface Message1{  
    public void greet1(String name);    
 } 

public class WithoutLambdaExpression { 
	  
	    public static void main(String[] args) {  
	        
	    	//without lambda, Message implementation using anonymous class  
	        Message m=new Message(){  
	            public void greet(String name){
	            	System.out.println("Hello "+name);}  	           
	        };  
	        m.greet("Aniket");  
	        
	        //Using Lambda Expression
	        Message m1=(name)->{  
	            System.out.println("Hello "+name);  
	        };  
	        
	        m1.greet("Nikhil");
	        m1.greet("Gayatri");
	        
	        Message1 m2=(name)->{
	        	System.out.println("Hello "+name);  
	        };
	        
	        m2.greet1("Manisha");
	    }  
	}  
