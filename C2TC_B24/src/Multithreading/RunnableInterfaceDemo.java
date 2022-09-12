package Multithreading;

public class RunnableInterfaceDemo {

	public static void main(String[] args) {
		UsingRunnable thread1=new UsingRunnable(10,1,"FIRST");
		UsingRunnable thread2=new UsingRunnable(5,1,"SECOND");
		UsingRunnable1 thread3=new UsingRunnable1("THIRD");
		UsingRunnable1 thread4=new UsingRunnable1("FOUR");
		
		Thread t1=new Thread(thread1);
		Thread t2=new Thread(thread2);
		Thread t3=new Thread(thread3);
		Thread t4=new Thread(thread4);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		try
		{
			t1.join();
		t2.join();
		t3.join();
		t4.join();
		}
		
		catch(Exception e)
		{
			
		}
		System.out.println("Have a nice day");
	}

}
