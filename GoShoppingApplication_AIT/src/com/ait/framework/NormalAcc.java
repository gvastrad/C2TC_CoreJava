package com.ait.framework;

public class NormalAcc extends ShopAcc{
	private float deliveryCharges;

	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges);
		this.deliveryCharges=deliveryCharges;
	}
	@Override
	public void bookProduct(float charges) {

	}
	@Override
	public String toString() {
		return "NormalAcc [deliveryCharges=" + deliveryCharges + ", getAccNo()=" + getAccNo() + ", getAccNm()="
				+ getAccNm() + ", getCharges()=" + getCharges() + "]";
	}
	public float getDeliveryCharges() {
		return deliveryCharges;
	}
	
}
