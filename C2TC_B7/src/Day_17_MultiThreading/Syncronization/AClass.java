package Day_17_MultiThreading.Syncronization;

public class AClass {
	int bal;
	
synchronized void deposit(int amt)
{
	System.out.println("Getting balance...");
	int oldbal=getBalance();
	bal=oldbal+amt;
	setBalance(bal);
}
synchronized void withdraw(int amt)
{
	System.out.println("Getting balance...");
	int oldbal=getBalance();
	if(amt>oldbal)
	{
		System.out.println("InsufficientBalance !!!");
	}
	else
	{
	bal=oldbal-amt;
	}
	setBalance(bal);
}
int getBalance()
{
	return Account.Balance;
}
void setBalance(int amt)
{
	try
	{
		Thread.sleep(3000);
	}
	catch(Exception e)
	{
		
	}
	Account.Balance=amt;
}
}
