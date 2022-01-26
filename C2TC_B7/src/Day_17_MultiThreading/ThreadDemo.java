package Day_17_MultiThreading;

public class ThreadDemo {

	public static void main(String[] args) {
		Ex thread1 = new Ex("First", 2000);
		Ex thread2 = new Ex("Second", 3000);

		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
		}

		catch (Exception e) {

		}
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}
			System.out.println("main" + i);
		
		}
	}
}
