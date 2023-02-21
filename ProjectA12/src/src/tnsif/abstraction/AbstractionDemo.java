package src.tnsif.abstraction;

public class AbstractionDemo {

	public static void main(String[] args) {
	
		//For abstract classes we can't create objects
		//RBI onj=new RBI();
		
		SBI obj=new SBI();
		float interest=obj.getRateOfInterest();
		System.out.println("The rate of interest in SBI is "+interest);
			
		RBI obj1=new HDFC();
		interest=obj1.getRateOfInterest();
		System.out.println("The rate of interest in SBI is "+interest);
	}

}
