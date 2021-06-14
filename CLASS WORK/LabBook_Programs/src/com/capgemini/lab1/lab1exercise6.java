package com.capgemini.lab1;

import java.util.Scanner;

class calculateDiff
{
	public int calculateDifference(int n)
	{
		int diff=0;
		int sum1=0,sum2=0;
		for(int i=1;i<=n;i++)
		{
			sum1+=i*i;
		}
		for(int i=1;i<=n;i++)
		{
			sum2+=i;
		}
		sum2=sum2*sum2;
		diff=sum1-sum2;
		return diff;
	}
}
public class lab1exercise6 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter n : ");
		int n=sc.nextInt();
		calculateDiff cd=new calculateDiff();
		int diff=cd.calculateDifference(n);
		System.out.println("The difference between the sum of the squares \nand the square of the sum of the first "+n+" natural numbers : "+diff);
	}

}
