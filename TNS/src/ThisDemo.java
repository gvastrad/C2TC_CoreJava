
public class ThisDemo {

	int num1;
	int num2;
	
	ThisDemo(int num1)
	{
		this.num1=num1;
	}
	
	ThisDemo(int num1, int num2)
	{
		this(num1);
		this.num2=num2;
	}
	void display()
	{
		System.out.println("num1 "+num1);
		System.out.println("num2 "+num2);
	}
	
	public static void main(String[] args) {
		
		ThisDemo  obj2=new ThisDemo(200,300);
		obj2.display();

	}

}
