package interfaces;

public class Tiger implements Animal {

	@Override
	public void eat() {
		System.out.println("Tiger eats meat, it carnivorous animal");
		
	}

	@Override
	public void makesSound() {
		System.out.println("Tiger roars");	
	}

}
