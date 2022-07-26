package com.ait.framework;

public interface ShopFactory {
	public PrimeAcc getNewPrimeAcc(int AccNo, String accNm, float charges, boolean isPrime);
	public NormalAcc getNewNormalAcc(int AccNo, String accNm, float charges, float deliveryCharges);
}
