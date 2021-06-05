package com.capgemini.lab7.com.cg.eis.pl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.capgemini.lab7.com.cg.eis.bean.Employee;
import com.capgemini.lab7.com.cg.eis.service.EmployeeServiceClass;

public class EmployeePL 
{
	int id;
	String name,designation,insuranceScheme;
	double salary;
	Scanner sc=new Scanner(System.in);
	//ArrayList<Employee> ale=new ArrayList<Employee>();
	HashMap<Integer,Employee> hm=new HashMap<Integer, Employee>();
	
	public HashMap<Integer,Employee> create()
	{
		System.out.println("===================== INSERT EMPLOYEE DETAILS ==========================");
		int ch=0;
		while(true)
		{
			System.out.print("Enter ID : ");
			id=sc.nextInt();
			System.out.print("Enter name :");
			name=sc.next();
			System.out.print("Enter salary : ");
			salary=sc.nextDouble();
			System.out.println("Enter Designation : ");
			System.out.println("1. Manager");
			System.out.println("2. Programmer");
			System.out.println("3. System Associate");
			System.out.println("4. Clerk");
			ch=sc.nextInt();
			if(ch==1)
			{
				designation="Manager";
			}
			else if(ch==2)
			{
				designation="Programmer";
			}
			else if(ch==3)
			{
				designation="System Associate";
			}
			else if(ch==4)
			{
				designation="Clerk";
			}
			else 
			{
				System.out.println("Wrong designation.");
				continue;
			}
			//ale.add(new Employee(id,name,salary,designation,insuranceScheme));
			hm.put(id,new Employee(id,name,salary,designation,insuranceScheme));
			System.out.println("--------------------------------------");
			System.out.print("Want to insert more : 1.yes  2.no : ");
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
		return hm;
	}


	public void print(HashMap<Integer, Employee> hm2) 
	{
		System.out.println("=====================EMPLOYEE DETAILS ==================================");
		if(hm2.size()==0)
		{
			System.out.println("No details available");
		}
		else
		{
			for(Map.Entry<Integer,Employee> itr:hm2.entrySet())
			{
				System.out.println("Enployee ID \t\t\t:"+itr.getValue().getId());
				System.out.println("Enployee Name \t\t\t:"+itr.getValue().getName());
				System.out.println("Enployee Salary \t\t:"+itr.getValue().getSalary());
				System.out.println("Enployee Designation \t\t:"+itr.getValue().getDesignation());
				System.out.println("Enployee Insurance Scheme \t:"+itr.getValue().getInsuranceScheme());
				System.out.println("========================================================================");
			}
		}
	}
	
	public void employeeCheckIns(HashMap<Integer, Employee> hm) 
	{
		System.out.println("Enter Insurance Scheme : ");
		System.out.println("1. Scheme A");
		System.out.println("2. Scheme B");
		System.out.println("3. Scheme C");
		System.out.println("4. No Scheme");
		int ins=sc.nextInt();
		String insScheme="";
		switch(ins)
		{
			case 1 : 	insScheme="Scheme A";
						break;
			case 2 : 	insScheme="Scheme B";
						break;
			case 3 : 	insScheme="Scheme C";
						break;
			case 4 : 	insScheme="No Scheme";
						break;
			default :	insScheme="Wrong scheme chosen";
						break;
		}
		int flag=0;
		System.out.println("=====================EMPLOYEE DETAILS ==================================");
		if(insScheme.equals("Wrong scheme chosen"))
		{
			System.out.println(insScheme);
			System.out.println("========================================================================");
		}
		else
		{
			System.out.println("INSURANCE SCHEME : "+insScheme.toUpperCase()+"\n");
			for(Map.Entry<Integer,Employee> itr:hm.entrySet())
			{
				if(insScheme.equalsIgnoreCase(itr.getValue().getInsuranceScheme()))
				{
					flag=1;
					System.out.println("Enployee ID \t\t\t:"+itr.getValue().getId());
					System.out.println("Enployee Name \t\t\t:"+itr.getValue().getName());
					System.out.println("Enployee Salary \t\t:"+itr.getValue().getSalary());
					System.out.println("Enployee Designation \t\t:"+itr.getValue().getDesignation());
					System.out.println("Enployee Insurance Scheme \t:"+itr.getValue().getInsuranceScheme());
					System.out.println("========================================================================");
				}
			}
			if(flag==0 || hm.size()==0)
			{
				System.out.println("Employee details not found under Insurance Scheme : "+insScheme.toUpperCase());
				System.out.println("========================================================================");
			}
		}
		
	}

	public HashMap<Integer, Employee> delete(HashMap<Integer, Employee> hm2) 
	{
		System.out.println("Enter ID to delete : ");
		id=sc.nextInt();
		for(Map.Entry<Integer,Employee> itr:hm2.entrySet())
		{
			if(id==itr.getKey())
			{
				hm2.remove(id);
				break;
			}
		}
		return hm2;
	}
}
