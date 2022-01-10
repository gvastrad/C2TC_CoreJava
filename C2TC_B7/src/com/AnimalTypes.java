package com;
class Animal{
	int legs;
	String name,color;
	
	public Animal() {
		System.out.println("This is default constructor.");
	}

	public Animal(String name) {
		this();
		this.name = name;
	}
	
	public Animal(String name, String color) {
		this(name);
		this.color = color;
	}

	public Animal(int legs, String name, String color) {
		this(name,color);
		this.legs = legs;
	}
	
	void display()
	{
		System.out.println("Animal Description:");
		System.out.printf("Color:%s Name:%s with %d legs\n",this.color,this.name,this.legs);
	}
}

public class AnimalTypes {

	public static void main(String[] args) {
			Animal obj=new Animal(4,"Cat", "White");
			obj.display();
			
			Animal obj2=new Animal("Dog","Blue");
			obj2.display();
			
			Animal obj3=new Animal(6,"SpiderMan","Brown");
			obj3.display();
}

}
