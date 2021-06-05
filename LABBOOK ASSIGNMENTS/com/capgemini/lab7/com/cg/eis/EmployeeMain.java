package com.capgemini.lab7.com.cg.eis;

import java.util.HashMap;
import java.util.Scanner;

import com.capgemini.lab7.com.cg.eis.bean.Employee;
import com.capgemini.lab7.com.cg.eis.pl.EmployeePL;
import com.capgemini.lab7.com.cg.eis.service.EmployeeServiceClass;

public class EmployeeMain {

	public static void main(String[] args) 
	{
		EmployeePL epl=new EmployeePL();
		Employee e=new Employee();
		EmployeeServiceClass es=new EmployeeServiceClass();
		HashMap<Integer,Employee> hm=new HashMap<Integer,Employee>();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter choice : ");
			System.out.println("1. Insert Employee Details");
			System.out.println("2. Delete Employee Details");
			System.out.println("3. Find Insurance Scheme");
			System.out.println("4. Find Employees under given Insurance Scheme");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1 :	hm=epl.create();
						break;
			case 2 :	hm=epl.delete(hm);
						epl.print(hm);
						break;
			case 3 :	hm=es.insuranceCheck(hm);
						epl.print(hm);
						break;
			case 4 :	hm=es.insuranceCheck(hm);
						epl.employeeCheckIns(hm);
						break;
			}
			System.out.println("--------------------------------------");
			System.out.print("Want to Continue Operation : 1.yes  2.no : ");
			ch=sc.nextInt();
			if(ch==1)
			{
				continue;
			}
			else
			{
				System.out.println("========================================================================");
				break;
			}
		}
		
		
		
	}

}
