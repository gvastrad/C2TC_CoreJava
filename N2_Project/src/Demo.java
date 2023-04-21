import java.util.ArrayList;

abstract  class Parent{
	abstract void  m1();
	void m2() {
		
	}
}
class Child extends Parent{

	@Override
	void m1() {
		// TODO Auto-generated method stub
		
	}
@Override	
void m2() {
		
	}
	
}
public class Demo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList obj=new ArrayList();
		obj.add("hi");
		
		Integer i1=new Integer(10);
		obj.add(10);
		
		
		obj.add(i1);
		
			}

}
