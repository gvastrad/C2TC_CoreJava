package Day_15_Exception_Handling;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter student id: ");
		int id=sc.nextInt();
		
		if(id>100)
		{
			System.out.println("Student found");
		}
		else
		{
			try
			{
				throw new StudentIdNotFoundException(id);
			}
			catch(StudentIdNotFoundException se)
			{
				System.out.println(se);	
				System.out.println(se.getMessage());
			}
		}

	}

}
