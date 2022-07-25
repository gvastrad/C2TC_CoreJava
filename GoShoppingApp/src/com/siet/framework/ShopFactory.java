/**
 * 
 */
package com.siet.framework;

/**
 * @author Gayatri Vastrad
 Abstrat Shop factory class
 */
public interface ShopFactory {
	public  PrimeAcc getNewPrimeAcc(int AccNo, String accNm, float charges, boolean isPrime);
	public  NormalAcc getNewNormalAcc(int AccNo, String accNm,float charges);
}
