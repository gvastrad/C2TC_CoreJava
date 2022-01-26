package Day_16_Collection_Framework;

import java.util.Vector;
import java.util.Enumeration;
import java.util.List;

public class Enumeration_Ex {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		vector.add(1);
		vector.add(4);
		vector.add(3);
		vector.add(5);
		vector.add(2);

		Enumeration<Integer> elements = vector.elements();
		while (elements.hasMoreElements()) {
			Integer n = elements.nextElement();
			System.out.println(n);
		}
        System.out.println("------------------------------------------");
		System.out.println(vector);
	}

}
