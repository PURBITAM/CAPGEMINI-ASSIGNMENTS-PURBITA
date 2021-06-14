package com.capgemini.lab4.exercise1;

import java.util.Scanner;

public class Exercise1MainClass 
{
	static int i=0;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		long smithId=++i;
		long kathyId=++i;
		
		Account acd=new CurrentAccount(smithId,2000,new Person("Smith",40));
		SavingsAccount sa=new SavingsAccount(acd);
		
		Account ack=new CurrentAccount(kathyId,3000,new Person("Kathy",45));
		SavingsAccount sak=new SavingsAccount(ack);
		acd.deposit(2000);
		sa.deposit(2000);
		System.out.println(acd.toString());
		if(acd.b&&sa.b)
		{
			System.out.println("Account Balance : "+acd.getBalance());
		}
		else if(!(acd.b))
		{
			System.out.println("Account Balance : "+acd.getBalance());
			System.out.println("\nOverdraft limit exceeded. OverDraft limit is "+(acd.getBalance()-500));
		}
		else if (!(sa.b))
		{
			System.out.println("\naccount should hav minimumbalance of INR 500");
		}
		
		System.out.println();
		ack.withdraw(2000);
		sak.withdraw(2000);
		System.out.println(ack.toString());
		if(ack.b&&sak.b)
		{
			System.out.println("Account Balance : "+ack.getBalance());
		}
		else if(!(ack.b))
		{
			System.out.println("Account Balance : "+ack.getBalance());
			System.out.println("\nOverdraft limit exceeded. OverDraft limit is "+(ack.getBalance()-500));
		}
		else if (!(sak.b))
		{
			System.out.println("\naccount should hav minimumbalance of INR 500");
		}
	}

}
