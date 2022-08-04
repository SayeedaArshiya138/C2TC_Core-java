package com.cg.client;

import com.cg.application.MMBankFactory;
import com.cg.application.MMCurrentAcc;
import com.cg.application.MMSavingAcc;
import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class ClientA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BankFactory bf = new  MMBankFactory();
		 SavingAcc sa= new  MMSavingAcc(138, "Arshiya", 120000, true);
		 CurrentAcc ca =new MMCurrentAcc(125, "sayeeda", 50000, 20000);
		 sa.withdraw(sa.getAccBal());
		 sa.toString();
		 ca.withdraw(ca.getCreditLimit());
		 ca.toString();
	}

}
