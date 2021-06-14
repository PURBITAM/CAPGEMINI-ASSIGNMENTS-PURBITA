package com.capgemini.lab4.exercise1;

public class SavingsAccount extends Account
{
	final double minBalance = 500;
	Account obj;
	long accNum;
	double balance;
	Person accHolder;
	
	public SavingsAccount(long accNum, int balance, Person accHolder) 
	{
		
		// TODO Auto-generated constructor stub
	}
	public SavingsAccount(Account obj)
	{
		super(obj.getAccNum(),obj.getBalance(),obj.getAccHolder());
		this.obj=obj;
		this.accNum=obj.getAccNum();
		this.accHolder=obj.getAccHolder();
		this.balance=obj.getBalance();
	}

	public void withdraw(double amt)
	{
		if(balance>=minBalance)
		{
			setBalance(balance+amt);
			b=true;
		}
		else
		{
			b=false;
		}
	}
}
