package Day_15_Exception_Handling;

public class ExceptionHandlingDemo3 {
	
	static void validate(int age)
	{
	if(age<18)
	throw new ArithmeticException("not valid");
	else
	System.out.println("welcome to vote");
	}
	
	public static void main(String args[])
	{
		try
		{
	validate(7);
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}
	System.out.println("rest of the code...");
	}
	}


