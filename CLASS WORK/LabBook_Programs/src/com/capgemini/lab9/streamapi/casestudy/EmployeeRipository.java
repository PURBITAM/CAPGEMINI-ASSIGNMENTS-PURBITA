package com.capgemini.lab9.streamapi.casestudy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeRipository {
	
	Integer employeeId;
	String firstName;
	String lastName;
	String email;
	String phoneNumber;
	LocalDate hireDate;
	String designation;
	double salary;
	Integer managerId;
	Employee em;
	static Department dp;
	
	static ArrayList<Employee> al=new ArrayList<Employee>();
	static ArrayList<Department> alDep=new ArrayList<Department>();
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		alDep.add(new Department(11,"ECE",10));
		alDep.add(new Department(22,"CSE",21));
		alDep.add(new Department(33,"IT",32));
		alDep.add(new Department(44,"AEIE",45));
		
		al.add(new Employee(12,"Purbita","Majumdar","pm@a.c","1234567890","2015-01-01","Manager",60000,21,dp));
		al.add(new Employee(12,"Rama","Krishna","rk@b.c","1134567890","2010-01-01","Clerk",40000,21,dp));
		al.add(new Employee(12,"Purvi","Das","pd@a.c","1233567890","2014-01-01","Manager",20000,10,dp));
		al.add(new Employee(12,"Rajesh","Krishna","rk@b.c","1134567890","2000-01-01","Clerk",70000,45,dp));
		al.add(new Employee(12,"Punam","A","pd@a.c","1233567890","2014-01-01","Manager",20000,0,dp));
		al.add(new Employee(12,"Ramji","B","rk@b.c","1134567890","2000-01-01","Clerk",70000,0,dp));
		EmployeeService  es=new EmployeeService();
		es.SumOfSalary(al);
		es.DeptNameCount(al,alDep);
		es.SeniorMostEmp(al);
		es.employeeWithoutDept(al);
		es.DeptWithou(al,alDep);
	}

}
