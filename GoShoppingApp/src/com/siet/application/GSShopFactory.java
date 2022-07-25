package com.siet.application;

import com.siet.framework.NormalAcc;
import com.siet.framework.PrimeAcc;
import com.siet.framework.ShopFactory;

public class GSShopFactory implements ShopFactory {
    PrimeAcc acc1;
    NormalAcc acc2;
	@Override
	public PrimeAcc getNewPrimeAcc(int AccNo, String accNm, float charges, boolean isPrime) {
		acc1=new GSPrimeAcc(AccNo, accNm, charges, isPrime);
		return acc1;
	}

	@Override
	public NormalAcc getNewNormalAcc(int AccNo, String accNm, float charges) {
		acc2=new GSNormalAcc(AccNo, accNm, charges);
		return acc2;
	}

}
