package com.tnsif.multithreading.synchronization;

public class DepositLimitExceedsException extends Exception {

     public DepositLimitExceedsException() {
		super("Daily limit of deposit is eceeded");
	}
	public DepositLimitExceedsException(String message) {
		super(message);
	}
}
