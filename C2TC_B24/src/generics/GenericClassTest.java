package generics;

class GenericTest<T>
{
	T obj;
	void add(T obj)
	{
		this.obj=obj;
	}
	
	T get()
	{
		return obj;
	}
}

public class GenericClassTest {

	public static void main(String[] args) {
		GenericTest<String> obj=new GenericTest<String>();
		obj.add("Hello");
		System.out.println(obj.get());
	}

}