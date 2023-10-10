package com.tnsif.multithreading;

public class RunnableLamdaTest {
	
public static void main(String[] args) {
   Runnable r1 = new Runnable() {
      @Override
      public void run() { // anonymous class
         System.out.println("Runnable with Anonymous Class");
      }
   };
   Runnable r2 = () -> {   // lambda expression
      System.out.println("Runnable with Lambda Expression");
   };
   new Thread(r1).start();
   new Thread(r2).start();
  
}
}
