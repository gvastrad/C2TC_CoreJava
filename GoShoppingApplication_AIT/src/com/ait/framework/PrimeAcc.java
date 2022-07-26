package com.ait.framework;

public  class PrimeAcc extends ShopAcc {
private boolean isPrime;
private static final float deliveryCharges=0;

public boolean isPrime() {
	return isPrime;
}

public static float getDeliverycharges() {
	return deliveryCharges;
}

public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
	super(accNo, accNm, charges);
	this.isPrime = isPrime;
}

@Override
public void bookProduct(float charges) {

}

@Override
public String toString() {
	return "PrimeAcc [isPrime=" + isPrime + ", isPrime()=" + isPrime() + ", getAccNo()=" + getAccNo() + ", getAccNm()="
			+ getAccNm() + ", getCharges()=" + getCharges() + "]";
}

}
