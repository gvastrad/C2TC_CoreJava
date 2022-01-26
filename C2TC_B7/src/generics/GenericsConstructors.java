package generics;

public class GenericsConstructors {
private double v;
public <T extends Number>GenericsConstructors(T t)
{
	v=t.doubleValue();
}

void show()
{
	System.out.println("Valu of v is: "+v);
}
public static void main(String[] args) {
	  System.out.println("Number to Double Conversion:");
	  GenericsConstructors obj=new GenericsConstructors(10);
	  obj.show();
	  
	  GenericsConstructors obj1=new GenericsConstructors(136.8F);
	  obj1.show();
	}

}
