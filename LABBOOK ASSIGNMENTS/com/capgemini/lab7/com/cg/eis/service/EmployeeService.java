package com.capgemini.lab7.com.cg.eis.service;

import java.util.HashMap;

import com.capgemini.lab7.com.cg.eis.bean.Employee;

public interface EmployeeService 
{
	public HashMap<Integer,Employee> insuranceCheck(HashMap<Integer, Employee> hm);
}
