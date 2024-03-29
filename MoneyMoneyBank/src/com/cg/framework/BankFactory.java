package com.cg.framework;

public abstract class BankFactory {
	public abstract SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, float isSalaried);
	public abstract CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit);
}
