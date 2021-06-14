package selfStudy5.Polymorphism2;

import java.util.Scanner;

public class TransactionMain 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account number : ");
		int accNum=sc.nextInt();
		System.out.println("Enter Amount : ");
		double amount=sc.nextDouble();
		int ch;
		while(true)
		{
			System.out.println("Enter choice : ");
			System.out.println("1. Check Balance\n2. Withdraw\n3. Deposit");
			ch=sc.nextInt();
			if(ch==1)
			{
				BalanceInquiry bi=new BalanceInquiry(amount);
				amount=bi.execute();
				System.out.println("Balance is :"+amount);
			}
			else if(ch==2)
			{
				System.out.println("Enter Amount to be withrawn : ");
				double amt=sc.nextDouble();
				Withdrawal w=new Withdrawal(amount,amt);
				amount=w.execute();
				System.out.println("After Withdrawal, Final balance is  : "+amount);
				
			}
			else if(ch==3)
			{
				System.out.println("Enter Amount to be deposited : ");
				double amt=sc.nextDouble();
				Deposit w=new Deposit(amount,amt);
				amount=w.execute();
				System.out.println("After deposit, Final balance is  : "+amount);
			}
			else
			{
				System.out.println("Wrong Choice");
			}
			System.out.println("Want to search again : ");
			System.out.println("1. yes\n2. no");
			ch=sc.nextInt();
			if(ch==1)
			{
				continue;
			}
			else
			{
				break;
			}
		}
	}
}
