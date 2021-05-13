package corejava8labbookexercises;

import java.util.Scanner;

public class lab1exercise3 
{
	public static void main(String[] args) 
	{
		int num1=1,num2=1,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter position : ");
		int pos=sc.nextInt();
		//System.out.println(num1);
		//System.out.println(num2);
		
		sum=num1+num2;
		for(int i=0;i<pos-3;i++)
		{
			
			int prev=sum;
			sum=sum+num2;
			num2=prev;
		}
		System.out.println(sum);
	}
}
