package Day_15_Exception_Handling;

public class ExceptionHandlingDemo1 {

	public static void main(String[] args) {
		try {
		int data=100/0;
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}
		System.out.println("Exception Handling Demo");

	}

}
