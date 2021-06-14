package com.capgemini.lab4.exercise1;

public class Account 
{
	private long accNum;
	private double balance;
	private Person accHolder;
	boolean b=true;
	
	public Account()
	{}
	
	public Account(long accNum, double balance, Person accHolder) 
	{
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}
	
	
	public long getAccNum() {return accNum;}
	public double getBalance() {return balance;}
	public Person getAccHolder() {return accHolder;}
	
	public void setAccNum(long accNum) {this.accNum = accNum;}
	public void setBalance(double balance) {this.balance = balance;}
	public void setAccHolder(Person accHolder) {this.accHolder=accHolder;}

	public void deposit(double amt)
	{
		this.balance=balance+amt;
	}
	
	public void withdraw(double amt)
	{
		this.balance=balance-amt;
		
	}

	@Override
	public String toString() {
		return "==== Account Details of "+accHolder.getName()+" ======= \nAccount Number = " + accNum + "\n" + accHolder.toString();
	}
	
	
}
