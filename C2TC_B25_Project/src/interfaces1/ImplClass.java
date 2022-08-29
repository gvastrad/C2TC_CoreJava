package interfaces1;

public class ImplClass extends AbstractClass implements I1,I2{

	@Override
	public void show() {
		System.out.println("Hi i am from I2");
		
	}

	@Override
	public void display() {
		System.out.println("Hi i am from I1");
		
	}

	@Override
	public void m2() {
	
		System.out.println("Hi i am from Abstract class");
	}

}
