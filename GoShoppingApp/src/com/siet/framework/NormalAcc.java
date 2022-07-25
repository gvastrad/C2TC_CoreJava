package com.siet.framework;

public class NormalAcc extends ShopAcc{
	
	private final float  deliveryCharges=50;
	
	public NormalAcc(int accNo, String accNm, float charges) {
		super(accNo, accNm, charges);
	}

	public float getDeliveryCharges() {
		return deliveryCharges;
	}

	@Override
	public void bookProduct(float charges) {
	
	}

}
