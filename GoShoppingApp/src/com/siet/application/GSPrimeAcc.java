package com.siet.application;

import com.siet.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {

	
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bookProduct(float charges) {
		System.out.println("Dear Prime User, Your Product Charges are: "+getCharges());	
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [getCharges()=" + getCharges() + ", toString()=" + super.toString() + ", isPrime()="
				+ isPrime() + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}


}
