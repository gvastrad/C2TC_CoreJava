package com.tnsif.lang;

class Sample{
	
	public void m2() {
		
	}
}

class Demo{

	public Demo() {
		// resource allocate
		System.out.println("In constructor");
	}
	
	protected void finalize() throws Throwable {
		// resource cleanup code
		System.out.println("In Finalize");
	}
	
	public Sample m1(){
		return new Sample();
	}
}

public class ObjectDemoClass {

	public static void main(String[] args) {
		Sample s = new Sample();
		Sample s1 = new Sample();
		System.out.println(s.getClass().getName()); 
		System.out.println(s1.getClass().getName()); 
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s.equals(s1));
		System.out.println(s==s1);
		
		Demo d = new Demo();
		System.out.println(d.hashCode());
		Demo d1=d;
		//Demo d1 = new Demo();
		System.out.println(d1.hashCode());
		d = null;
		System.gc();
		//System.out.println(d1);
	}

}
