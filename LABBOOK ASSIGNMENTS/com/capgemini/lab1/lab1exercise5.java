package com.capgemini.lab1;

import java.util.Scanner;

class sumNumber
{
	sumNumber()
	{
		
	}
	public int calculateSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum+=i;
			}
		}
		return sum;
	}
}

public class lab1exercise5 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter n : ");
		int n=sc.nextInt();
		sumNumber sn=new sumNumber();
		int sum=sn.calculateSum(n);
		System.out.println("The sum of first "+n+" natural numbers which are divisible by 3 or 5 : "+sum);
	}

}
