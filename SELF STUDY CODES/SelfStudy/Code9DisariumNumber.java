package SelfStudy;

import java.util.Scanner;

public class Code9DisariumNumber 
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
			sum+=Math.pow(rem,count);
			temp=temp/10;
			//System.out.println(temp);
			count--;
		}
		if(sum==num)
		{
			System.out.println(num+" is a Disarium Number");
		}
		else
		{
			System.out.println(num+" is not a Disarium Number");
		}
	}
}
