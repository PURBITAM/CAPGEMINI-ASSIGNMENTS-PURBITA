package corejavalabbookexlab3;

import java.util.Scanner;

public class lab3exercise4 
{
	public int modifyNumber(String num)
	{
		int len=num.length();
		int sum=0,diff=0;
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<len;i++)
		{
			if(i<len-1)
			{
				diff=Math.abs(((int)(num.charAt(i)))-((int)(num.charAt(i+1))));
				sb.append(diff);
			}
			else if(i==(len-1))
			{
				sb.append(num.charAt(i));
			}
		}
		sum=Integer.parseInt(sb.toString()); //    StringBuffer to int
		return sum;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.print("Enter the number to be modefied : ");
		Scanner sc=new Scanner(System.in);
		String num=sc.nextLine();
		
		lab3exercise4 le=new lab3exercise4();
		int retNum=le.modifyNumber(num);
		System.out.println("The modefied Number is : "+retNum);
		
		
	}

}
