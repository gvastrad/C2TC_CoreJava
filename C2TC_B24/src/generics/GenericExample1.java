package generics;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericExample1 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("India");
		list.add("Pakisthan");
		//list.add(new Integer(10));
		
		String country=list.get(0);
		System.out.println("element is "+ country);
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

	}

}
