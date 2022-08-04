package com.cg.application;

import com.cg.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc{
	
	

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}

	public void withdraw(float creditLimit) {
		
		System.out.println("Account balance after withdrawal: " +getAccBal()+ "and creditLimit provided is:" +getCreditLimit());
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [getaccBal=" + getAccBal()+ ", getcreditLimit=" +getCreditLimit()+ ", getCreditLimit()="
				+ getCreditLimit() + ", toString()=" + super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()="
				+ getAccNm() + ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	

	

	

}
