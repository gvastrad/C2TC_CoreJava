package Multithreading;

class Producer extends Thread
{
	MyData1 d;
	public Producer(MyData1 dat) {d=dat;}
	public void run()
	{
		int i =1;
		while(true)
		{
			try {
				d.set(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Producer : "+i);
			i++;
		}
	}
}
class Consumer extends Thread
{
	MyData1 d;
	public Consumer(MyData1 dat) {d=dat;}
	public void run()
	{
		while(true)
		{
			try {
				System.out.println("Consumer : "+d.get());
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
public class InterThreadCommunication {

	public static void main(String[] args) {
		MyData1 d = new MyData1();
		Producer p = new Producer(d);
		Consumer c = new Consumer(d);
		p.start();
		c.start();
		

	}

}
