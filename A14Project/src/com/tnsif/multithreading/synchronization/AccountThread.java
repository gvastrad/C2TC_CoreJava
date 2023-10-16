package com.tnsif.multithreading.synchronization;

public class AccountThread extends Thread{
	private Account acc;
    private int amt;
    
	public AccountThread(Account acc, int amt) {
		super();
		this.acc = acc;
		this.amt = amt;
	}


	@Override
	public void run()
	{
		try {
			acc.withdraw(amt);
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
