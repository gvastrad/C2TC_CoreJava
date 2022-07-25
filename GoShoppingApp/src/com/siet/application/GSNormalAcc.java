package com.siet.application;

import com.siet.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {

	public GSNormalAcc(int accNo, String accNm, float charges) {
		super(accNo, accNm, charges);
		// TODO Auto-generated constructor stub
	}
	
	

	public void bookProduct(float charges)
	{
		System.out.println("Dear Normal User, Your Charges are: "+charges+" with Delivery Charges is: "+getDeliveryCharges());
	}

	@Override
	public String toString() {
		return "GSNormalAcc [accNo=" + getAccNo() + ", charges=" + getCharges() + ", deliveryCharges=" +getDeliveryCharges() + "]";
	}

}
