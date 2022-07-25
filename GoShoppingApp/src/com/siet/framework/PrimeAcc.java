package com.siet.framework;

public class PrimeAcc extends ShopAcc {

private boolean isPrime;
private static final float deliveryCharges=0;


public static float getDeliverycharges() {
	return deliveryCharges;
}

public PrimeAcc(int accNo, String accNm, float charges,boolean isPrime) {
	super(accNo, accNm, charges);
	this.isPrime=isPrime;
}

@Override
public void bookProduct(float charges) {
	// TODO Auto-generated method stub
	
}


public boolean isPrime() {
	return isPrime;
}

public void setPrime(boolean isPrime) {
	this.isPrime = isPrime;
}

@Override
public String toString() {
	return "PrimeAcc [isPrime=" + isPrime + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
			+ ", getCharges()=" + getCharges() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + "]";
}

}
