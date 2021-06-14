package com.capgemini.lab5.exercise2;

import java.util.Scanner;

public class NameMain 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Name : ");
		String fname=sc.nextLine();
		System.out.print("Enter Last Name : ");
		String lname=sc.nextLine();
		try
		{
			if((fname==null || fname.isEmpty())&&(lname==null || lname.isEmpty()))
			{
				throw new NameInvalidException("First Name and Last Name not inserted.");
			}
			else if(fname==null || fname.isEmpty())
			{
				throw new NameInvalidException("First Name not inserted.");
			}
			else if(lname==null || lname.isEmpty())
			{
				throw new NameInvalidException("Last Name not inserted.");
			}
			else
			{
				System.out.println("Name is : "+fname+" "+lname);
			}
		}
		catch(NameInvalidException an)
		{
			System.out.println(an.getMessage());
		}
	}
}
