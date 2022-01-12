package Day_15_Exception_Handling;

import java.io.IOException;

public class ExceptionHandlingDemo4 {
	void m()throws IOException
	{
	throw new IOException("device error");//checked exception
	}
	void n()throws IOException
	{
	m();
	}
	void p()
	{
	try
	{
	n();
	}
	catch(Exception e){System.out.println("exception handled");}
	}
	public static void main(String args[])
	{
  ExceptionHandlingDemo4 obj=new ExceptionHandlingDemo4();
	obj.p();
	System.out.println("normal flow...");
	}

}
