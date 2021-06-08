package com.capgemini.lab9.streamapi.casestudy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeService 
{
	
// Find out the sum of salary of all employees ======================================================
	public void SumOfSalary(ArrayList<Employee> al) 
	{
		Double sumVal=al.stream()
						.mapToDouble(Employee::getSalary)
						.sum();
		System.out.println("Sum Of Salary Of All Employees : "+sumVal);
		System.out.println();
	}
	
	
// List out department names and count of employees in each department ===============================
	public void DeptNameCount(ArrayList<Employee> al,ArrayList<Department> alDep) 
	{
		System.out.println("List out department names and count of employees in each department");
		System.out.println("Manager ID : No of employees");
		al.stream() 
		  .collect(Collectors.groupingBy(Employee::getManagerId,Collectors.counting()))
		  .forEach((managerId,countVal)->{System.out.println(managerId+" : "+countVal);});

		Map<Integer, Long> sortedMap= al.stream() 
				  .collect(Collectors.groupingBy(Employee::getManagerId,Collectors.counting()));

		System.out.println("Department Name : No of employees");
		for(Map.Entry<Integer,Long> itr:sortedMap.entrySet())
		{
			alDep.stream().filter(obj->obj.getManagertId()==itr.getKey())
							.forEach((dptnm)->System.out.println(dptnm.getDepartmentName()+" "+itr.getValue()));
		}
		System.out.println();
	}

// Find out the senior most employee of an organization ===========================================
	public void SeniorMostEmp(ArrayList<Employee> al) 
	{
		System.out.println("Senior most employee of an organization : ");
		Optional<Employee> ldt=al.stream() 
		  .collect(Collectors.minBy(Comparator.comparing(Employee::getHireDate)));
		al.stream().filter(obj->(obj.getHireDate().equals(ldt.get().getHireDate()))).forEach((s)->System.out.println(s.getFirstName()+" "+s.getLastName()));

		System.out.println();
		
	}


// Find out employees without department. =========================================================
	public void employeeWithoutDept(ArrayList<Employee> al) 
	{
		System.out.println("Employees without department");
		al.stream() 
		  .forEach((s)->{if(s.getManagerId()==0) {System.out.println(s.getFirstName()+" "+s.getLastName());}});
		System.out.println();
	}
	
// Find departments with highest count of employees ================================================
	public void DeptWithou(ArrayList<Employee> al,ArrayList<Department> alDep) 
	{
		System.out.print("Departments with highest count of employees : ");
		Map<Integer, Long> sortedMap= al.stream() 
				  .collect(Collectors.groupingBy(Employee::getManagerId,Collectors.counting()));

		Map<Integer, Long> sortedMap1 = al.stream() 
		  .collect(Collectors.groupingBy(Employee::getManagerId,Collectors.counting()));

		sortedMap1.remove(0);
		Optional<Entry<Integer, Long>> maxEntry = sortedMap1.entrySet()
		        .stream()
		        .max((Entry<Integer, Long> e1, Entry<Integer, Long> e2) -> e1.getValue()
		        .compareTo(e2.getValue()));
		
		for(Map.Entry<Integer,Long> itr:sortedMap1.entrySet())
		{
			alDep.stream().filter(obj->obj.getManagertId()==maxEntry.get().getKey());
			System.out.println(alDep.get(0).getDepartmentName());
			break;
		}
		System.out.println();
	}
	
}
