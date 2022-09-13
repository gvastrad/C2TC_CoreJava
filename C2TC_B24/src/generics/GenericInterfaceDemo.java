package generics;


interface MinMax<T extends Comparable<T> > {
    T min();
    T max();
}
public class GenericInterfaceDemo<T extends Comparable<T> > 
implements MinMax<T>
{
    T[] values;
    GenericInterfaceDemo(T[] obj)
    {
    	values=obj;
    }
	@Override
	public T min() {
		T o1=values[0];
		
		 for (int i = 1; i < values.length; i++)
	            if (values[i].compareTo(o1) < 0)
	                o1 = values[i];
		 return o1;
		
	}

	@Override
	public T max() {
		T o1=values[0];
		
		 for (int i = 1; i < values.length; i++)
	            if (values[i].compareTo(o1) > 0)
	                o1 = values[i];
		 return o1;
	}

	public static void main(String s[])
	{
		Float arr[] = { 3.22f, 6.8f, 222.8f, 88.9f, 6.0f };
		GenericInterfaceDemo<Float> obj1=new GenericInterfaceDemo<Float>(arr);
		
		System.out.println("Minimum value is : "+obj1.min());
		System.out.println("Maximum value is : "+obj1.max());
	}
}

