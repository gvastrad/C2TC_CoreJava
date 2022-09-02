package Collection_Framework;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListDemo {
	//int price;

	public static void main(String[] args) {
		List<Object> al=new ArrayList<Object>();
		Student s2=new Student(102,"Rashmi","ECE");
		al.add(new Integer(10));
		al.add(new Float(22.22f));
		al.add(new Student(101,"Gayatri","CS"));
		al.add(new String("SKSJIT"));
		al.add(s2);
		//al.remove(s2);
		
		List<Comparable> al1=new ArrayList<Comparable>();
		al1.add(new Character('A'));
		al1.add(new Integer(100));
		//System.out.println(price);
		al.addAll(al1);
		Iterator<Object> i1=al.iterator();
		while(i1.hasNext())
		{
			Object obj=i1.next();
			System.out.println(obj);
		}
		
	}

}
