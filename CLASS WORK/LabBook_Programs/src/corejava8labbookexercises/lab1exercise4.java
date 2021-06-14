package corejava8labbookexercises;

import java.util.Scanner;

public class lab1exercise4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter last number : ");
		int pos=sc.nextInt();
		int flag=0;
		for(int temp=2;temp<=pos;temp++)
		{
			flag=0;
			for(int i=2;i<=Math.sqrt(temp);i++)
			{	
				//System.out.print(temp%i);
				if(temp%i==0)
				{
					flag=1;
					break;
				}
			}
			//System.out.print(flag);
			if(flag==0)
			{
				System.out.println(temp);
			}
		}
	}
	
}
