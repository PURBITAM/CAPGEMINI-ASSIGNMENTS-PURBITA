package com.capgemini.lab4.exercise2.com.cg.eis.service;

import com.capgemini.lab4.exercise2.com.cg.eis.bean.Employee;

public class Service extends Employee
{

	int id;
	String name;
	double salary;
	String designation;
	String insuranceScheme;
	
	public Service(int id, String name, double salary,String designation) 
	{
		//super(id, name, salary, designation, designation);
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation=designation;
	}
	public void findIns()
	{
		String str="\n======================== ";
		String str0="============================================================";
		String str1=" ========================== \nPremium per year : INR 2000 + INR 280 (s.Tax 14%) = INR 2280\nMedical expenses coverage of INR 2 lacs\n"+str0;
		String str2=" ========================== \nPremium per year : INR 5000 + INR 700 (s.Tax 14%) = INR 5700\nMedical expenses coverage of INR 4 lacs\n"+str0;
		if(salary>=10000 && salary<=50000 && designation.toUpperCase().equals("MANAGER"))
		{
			insuranceScheme="Scheme A"+str+"Scheme A"+str1;
		}
		else if(salary>50000 && designation.toUpperCase().equals("MANAGER"))
		{
			insuranceScheme="Scheme B"+str+"Scheme B"+str2;
		}
		else if(salary>=10000 && salary<=50000 && designation.toUpperCase().equals("OFFICER"))
		{
			insuranceScheme="Scheme C"+str+"Scheme C"+str1;
		}
		else if(salary>50000 && designation.toUpperCase().equals("OFFICER"))
		{
			insuranceScheme="Scheme D"+str+"Scheme D"+str2;
		}
		else if(salary>=10000 && salary<=50000 && designation.toUpperCase().equals("CLERK"))
		{
			insuranceScheme="Scheme E"+str+"Scheme E"+str1;
		}
		else if(salary>50000 && designation.toUpperCase().equals("CLERK"))
		{
			insuranceScheme="Scheme F"+str+"Scheme F"+str2;
		}
		else if(salary>=10000 && salary<=50000 && designation.toUpperCase().equals("ASSISTANT"))
		{
			insuranceScheme="Scheme G"+str+"Scheme G"+str1;
		}
		else if(salary>50000 && designation.toUpperCase().equals("ASSISTANT"))
		{
			insuranceScheme="Scheme H"+str+"Scheme H"+str2;
		}
		else if(!(designation.toUpperCase().equals("ASSISTANT")||designation.toUpperCase().equals("CLERK")||
				designation.toUpperCase().equals("CLERK")||designation.toUpperCase().equals("MANAGER")))
		{
			insuranceScheme="Wrong Designation Chosen";
		}
		else if(salary<10000)
		{
			insuranceScheme="Sorry! No Scheme Available. Scheme avalilable from INR 10,000";
		}
		setInsuranceScheme(insuranceScheme);
		Employee e=new Employee(id,name,salary,designation,insuranceScheme);
		System.out.println(e.toString());
	}
}
