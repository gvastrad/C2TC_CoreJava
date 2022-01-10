package general;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Sum is"+(a+b));
		Main obj=new Main();
		System.out.println(obj.getClass());
		System.out.println(obj.hashCode());
		
	}

}
