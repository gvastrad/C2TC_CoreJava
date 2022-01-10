package com;
class Box{
	float width,height,depth;
	String label,color="Brown";
	
	float calcvol() {
		return this.width*this.height*this.depth;
	}
	
	String getLabel() {
		return this.label;
	}
}
public class BoxDemo {

	public static void main(String[] args) {
		Box box1=new Box();
		box1.width=3.4f;
		box1.depth=3.1f;
		box1.height=4.5f;
		box1.label="Toys";
		float ans=box1.calcvol();
		System.out.println("Name of Box2: "+box1.getLabel());
		System.out.println("Volume of Box1: "+ans);
		
		Box box2=new Box();
		box2.width=2.5f;
		box2.depth=1.3f;
		box2.height=3.4f;
		box2.label="Scrap";
		float ans2=box2.calcvol();
		System.out.println("Name of Box2: "+box2.getLabel());
		System.out.println("Volume of Box2: "+ans2);

	}

}
