package com.ait.application;

import com.ait.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
	}
	public void bookProduct(float charges)
	{
		System.out.println("Dear Normal Account User, Your Product Charges are: "+getCharges() +"delivery charge"+ getDeliveryCharges());
	}

}
