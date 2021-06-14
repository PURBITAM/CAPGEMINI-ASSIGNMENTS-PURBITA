package com.capgemini.lab7.com.cg.eis.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.capgemini.lab7.com.cg.eis.bean.Employee;

public class EmployeeServiceClass implements EmployeeService
{
	String designation,insuranceScheme;
	double salary;
	Scanner sc=new Scanner(System.in);
	public HashMap<Integer,Employee> insuranceCheck(HashMap<Integer, Employee> hm) 
	{
		for(Map.Entry<Integer,Employee> itr:hm.entrySet())
		{
			designation=itr.getValue().getDesignation();
			insuranceScheme=itr.getValue().getInsuranceScheme();
			salary=itr.getValue().getSalary();
			if(salary>=40000 && designation.equals("Manager"))
			{
				insuranceScheme="Scheme A";
			}
			else if((salary>=20000 && salary<40000) && designation.equals("Programmer"))
			{
				insuranceScheme="Scheme B";
			}
			else if((salary>=5000 && salary<20000) && designation.equals("System Associate"))
			{
				insuranceScheme="Scheme C";
			}
			else 	// if(salary<5000 && designation.equals("Clerk")) or any combination of salary and designation
			{
				insuranceScheme="No Scheme";
			}
			itr.getValue().setInsuranceScheme(insuranceScheme);
		}
		
		return hm;
	}
	
}
