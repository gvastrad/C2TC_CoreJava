package Multithreading;

public class WithDrawThread extends  Thread{
	
	Service s;
	int amt;
	public WithDrawThread(Service s, int amt) {
		this.s = s;
		this.amt = amt;
	}
	
	public void run()
	{
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			
		}
		s.withdraw(amt);
	}

}
