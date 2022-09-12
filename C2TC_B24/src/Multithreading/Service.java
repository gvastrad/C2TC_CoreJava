package Multithreading;

public class Service {
	int bal;
	synchronized void withdraw(int amt)
	{
		
		int balance=getBalance();
		System.out.println("Getting balance "+balance);
		bal=balance-amt;
		setBal(bal);
	}

	private void setBal(int bal2) {
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			
		}
		Account.Balance=bal2;
	}

	int getBalance()
	{
		return Account.Balance;
	}
	
}
