package com.cg.client;

import com.cg.application.GSNormalAcc;
import com.cg.application.GSPrimeAcc;
import com.cg.application.GSShopFactory;
import com.cg.framework.NormalAcc;
import com.cg.framework.PrimeAcc;
import com.cg.framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           ShopFactory sf =new GSShopFactory();
           PrimeAcc pa=new GSPrimeAcc(123,"Arshiya",1000,false);
           NormalAcc na = new GSNormalAcc(456,"ravi",1000,100);
           pa.bookProduct(pa.getCharges());
           pa.toString();
           na.bookProduct(na.getDeliveryCharge());
           na.toString();
	}

}
