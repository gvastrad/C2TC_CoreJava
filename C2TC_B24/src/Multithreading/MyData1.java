package Multithreading;

class MyData1{
	int value=0;
	boolean flag=true;
	synchronized void set(int v) throws InterruptedException
	{
		while(flag!=true) try{wait();}catch(Exception e) {}
		
		value=v;
		flag=false;
		notify();
	}
	synchronized int get() throws InterruptedException
	{
		int x=0;
		while(flag!=false)  
			try{
				wait();
				}
		catch(Exception e)
		{
			
		}
		
		x=value;
		flag=true;
		notify();
		return x;
	}
}
