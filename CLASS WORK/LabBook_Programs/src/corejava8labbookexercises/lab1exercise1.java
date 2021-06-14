package corejava8labbookexercises;

import java.util.Scanner;

public class lab1exercise1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of digits : ");
		int n=sc.nextInt();
		int num=0,sum=0;
		int tempN=n;
		int tempNum,count;
		while(true)
		{
			count=0;
			System.out.println("enter number of "+n+" digits : ");
			num=sc.nextInt();
			tempNum=num;
			while(tempNum>0)
			{
				tempNum=tempNum/10;
				count++;
			}
			//System.out.println(count);
			if(count==n)
			{
				break;
			}
		}
		tempNum=num;
		int r;
		while(tempNum>0)
		{
			r=tempNum%10;
			sum=sum+r*r*r;
			tempNum/=10;
		}
		System.out.println("the sum of the cubes of the digits "+sum);
	}
}
