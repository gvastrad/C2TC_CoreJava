package Multithreading;

public class UsingRunnable implements  Runnable {
   int h;
   int l;
   String msg;
   
	public UsingRunnable(int h, int l, String msg) {
	this.h = h;
	this.l = l;
	this.msg = msg;
}

	@Override
	public void run() {
		for(int i=h;i>l;i--)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				
			}
			System.out.println(msg+i);
		}
		
	}

}
