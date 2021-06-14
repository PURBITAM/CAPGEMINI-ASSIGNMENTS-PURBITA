package com.capgemini.lab4.exercise2.com.cg.eis.pl;

import java.util.Scanner;

import com.capgemini.lab4.exercise2.com.cg.eis.bean.Employee;
import com.capgemini.lab4.exercise2.com.cg.eis.service.Service;

public class MainClass 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee ID : ");
		int id=sc.nextInt();
		System.out.println("Enter Employee Name : ");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.println("Enter Employee Designation (MANAGER/OFFICER/CLERK/ASSISTANT): ");
		String designation=sc.nextLine();
		System.out.println("Enter Employee Salary : ");
		double salary=sc.nextDouble();
		
		
		Service e=new Service(id,name,salary,designation);
		e.findIns();
	}

}
