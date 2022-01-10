package general;
class Sample
{
	 int a=10;
     public int b=20;
     private int c=30;
     protected int d=40;
     void display()
     {
    	System.out.println(a+b+c+d); 
     }
}

class derived extends Sample
{
	void display1()
    {
   	System.out.println(a+b+c+d); 
    }
}

public class GitClass {
    
	public static void main(String[] args) {
		System.out.println("Hello");
	}

}
