package com.capgemini.lab3;

import java.util.Scanner;

public class lab3exercise8 
{
	public boolean checkString(String str)
	{
		int count=0;
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)<=str.charAt(i+1))
			{
				count++;
			}
		}
		if(count+1==str.length())
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Enter string : ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		lab3exercise8 le=new lab3exercise8();
		boolean b=le.checkString(str);
		if(b)
		{
			System.out.println("Positive String");
		}
		else
		{
			System.out.println("not a positive String");
		}
	}

}
