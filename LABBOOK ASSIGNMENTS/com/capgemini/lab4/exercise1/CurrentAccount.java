package com.capgemini.lab4.exercise1;

public class CurrentAccount extends Account
{
	double overdraftLimit=getBalance()-500;
	double limit=0;
	double balance;
	
	public CurrentAccount(long accNum, double balance, Person accHolder) 
	{
		super(accNum, balance, accHolder);
		this.balance = balance;
		// TODO Auto-generated constructor stub
	}

	public void withdraw(double amt)
	{
		limit+=amt;
		if(limit>overdraftLimit)
		{
			b=false;
		}
		else
		{
			setBalance(balance-amt);
			b=true;
		}	
	}
}
