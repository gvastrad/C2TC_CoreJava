package Collection_Framework;

import java.util.ListIterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack st=new Stack();
		st.push(new Float(22.34f));
        st.push(new Integer(234));
        st.push(new Student(34,"ABC","CS"));
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        ListIterator li=st.listIterator();
        while(li.hasNext())
        {
        	Object o=li.next();
        	System.out.println(o);
        }
       // st.pop();
        
	}

}
