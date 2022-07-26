package com.ait.client;

import com.ait.application.GSNormalAcc;
import com.ait.application.GSPrimeAcc;
import com.ait.application.GoShopFactory;

public class GoShoppingClient {

	public static void main(String[] args) {
		GoShopFactory obj=new GoShopFactory();
		//Prime Account creation
		GSPrimeAcc gayatri=(GSPrimeAcc) obj.getNewPrimeAcc(123, "Gayatri", 500.0f, true);
		gayatri.bookProduct(gayatri.getCharges());
		
		//Normal Account creation
		
		GSNormalAcc geeta=(GSNormalAcc) obj.getNewNormalAcc(121, "Geeta", 600.0f,30.0f);
		geeta.bookProduct(geeta.getCharges());

	}

}
