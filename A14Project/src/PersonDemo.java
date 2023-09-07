import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		/*
		 * Person p1=new Person(); p1.setName("gayatri"); p1.setGender("Female");
		 * p1.setAge(18); p1.setIncome(10000); p1.setTax(100); System.out.println(p1);
		 * 
		 * Person p2=new Person("Yashashree",20000,"female",19,200);
		 * System.out.println(p2);
		 */
		Scanner ob = new Scanner(System.in);
		
		String name,gender;
		int age,income;
		System.out.println("Enter Person Name : ");
		name = ob.next();
		System.out.println("Enter age: ");
		age = ob.nextInt();
		System.out.println("Enter gender: ");
	    gender = ob.next();
		System.out.println("Enter taxable income: ");
	   income = ob.nextInt();
		
		
		//Person object and initialize values using setter
				Person person = new Person();
				person.setName(name);
				person.setAge(age);
				person.setGender(gender);
				person.setIncome(income);
							
				
				//display person details using toString() method
				//System.out.println(person);
				
				//System.out.println(person1);
				
				TaxCalculation calc = new TaxCalculation();
				calc.calculateTax(person); //tax calculation
				System.out.println("After calculating tax : ");
				System.out.println(person);
	}
}
