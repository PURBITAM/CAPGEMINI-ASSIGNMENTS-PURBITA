package SelfStudy;

import java.util.Scanner;

public class Code10HarshadNumber 
{
	public static void main(String[] args) 
	{
		System.out.print("Input a number : ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int count=0,sum=0;
		while(temp>0)
		{
			temp=temp/10;
			count++;
		}
		//System.out.println(count);
		int f,dig,rem;
		temp=num;
		while(count>0)
		{
			rem=temp%10;
			sum+=rem;
			temp=temp/10;
			//System.out.println(temp);
			count--;
		}
		if(num%sum==0)
		{
			System.out.println(num+" is a Harshad Number");
		}
		else
		{
			System.out.println(num+" is not a Harshad Number");
		}
	}
}
