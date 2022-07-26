package com.ait.framework;

public abstract class ShopAcc {
	private int accNo;
	private String accNm;
	private float charges;
	
	public ShopAcc(int accNo, String accNm, float charges) {
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}

	public int getAccNo() {
		return accNo;
	}

	public String getAccNm() {
		return accNm;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

	public float getCharges() {
		return charges;
	}

abstract public void bookProduct(float charges);

@Override
public String toString() {
	return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + ", getAccNo()=" + getAccNo()
			+ ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges() + "]";
}

}
