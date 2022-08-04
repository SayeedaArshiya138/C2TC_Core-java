package com.cg.framework;

public abstract class SavingAcc extends BankAcc {
	private boolean isSalaried;
	private static final float MINBAL=0;
	
	public void withdraw(float accBal) {
		System.out.println("Account balance after withdrawal: " +accBal);
	}
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
}
