package com.capgemini.lab5.exercise1;

import java.util.Scanner;

public class AgeCheckMain 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Age : ");
		int age=sc.nextInt();
		try
		{
			if(age<15)
			{
				throw new AgeInvalidException("age is below of 15.");
			}
			else
			{
				System.out.println("Age is valid.");
			}
		}
		catch(AgeInvalidException an)
		{
			System.out.println(an.getMessage());
		}
	}
}
