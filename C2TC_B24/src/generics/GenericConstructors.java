package generics;

public class GenericConstructors {
private double v;
public <T extends Number>GenericConstructors(T t)
{
	v=t.doubleValue();
}

void show()
{
	System.out.println("Valu of v is: "+v);
}
public static void main(String[] args) {
	  System.out.println("Number to Double Conversion:");
	  GenericConstructors obj=new GenericConstructors(10);
	  obj.show();
	  
	  GenericConstructors obj1=new GenericConstructors(136.8F);
	  obj1.show();
	}

}