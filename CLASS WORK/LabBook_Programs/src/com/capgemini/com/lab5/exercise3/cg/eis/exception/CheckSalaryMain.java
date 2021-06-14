package com.capgemini.com.lab5.exercise3.cg.eis.exception;

import java.util.Scanner;

public class CheckSalaryMain 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Employee Salary : ");
		double salary=sc.nextDouble();
		try
		{
			if(salary<3000)
			{
				throw new EmployeeException("Salary inserted, is below INR 3000.");
			}
			else
			{
				System.out.println("Salary is : "+salary);
				System.out.println("Salary is above INR 3000.");
			}
		}
		catch(EmployeeException an)
		{
			System.out.println(an.getMessage());
		}
	}
	
}
