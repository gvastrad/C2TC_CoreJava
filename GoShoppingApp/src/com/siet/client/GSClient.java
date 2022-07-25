package com.siet.client;

import com.siet.application.GSNormalAcc;
import com.siet.application.GSPrimeAcc;
import com.siet.application.GSShopFactory;

public class GSClient {
  
	public static void main(String[] args) {
		GSShopFactory factory=new GSShopFactory();
		//Creating Normal Account
		
	 GSNormalAcc gsn=(GSNormalAcc) factory.getNewNormalAcc(1212,"Gayatri",500.00f);
		 gsn.bookProduct(gsn.getCharges());
		
		//Creating Prime Account
		GSPrimeAcc gsp=(GSPrimeAcc) factory.getNewPrimeAcc(12122, "Bharathi", 600.0f, true);
		gsp.bookProduct(gsp.getCharges());
	}

}
