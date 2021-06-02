package com.capgemini.lab6.exercise4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ScholarshipEligibility 
{
	Scanner sc=new Scanner(System.in);
	Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
	Map<Integer,String> hmOut=new HashMap<Integer,String>();
	ArrayList<Integer> al=new ArrayList<Integer>();
	int regno,marks,ch;
	public Map<Integer,Integer> Insert() 
	{
		while(true)
		{
			System.out.println("Enter Registration number :");
			regno=sc.nextInt();
			System.out.println("Enter marks : ");
			marks=sc.nextInt();
			hm.put(regno,marks);
			System.out.println("Want to continue 1. yes  2. no : ");
			ch=sc.nextInt();
			if(ch==1)
			{
				continue;
			}
			else
			{
				break;
			}
		}
		return hm;
	}
	
	public Map<Integer, String> getStudents(Map<Integer, Integer> hm2) 
	{
		for(Map.Entry<Integer,Integer> itr:hm2.entrySet())
		{
			if(itr.getValue()>=90)
			{
				hmOut.put(itr.getKey(),"Gold");
			}
			else if(itr.getValue()>=80 && itr.getValue()<90)
			{
				hmOut.put(itr.getKey(),"Silver");
			}
			else if(itr.getValue()>=70 && itr.getValue()<80)
			{
				hmOut.put(itr.getKey(),"Bronze");
			}
		}
		return hmOut;
	}

	public void print(Map<Integer, String> hmOut2) 
	{
		System.out.println("\nThe students eligible for the medals along with the medal type : ");
		for(Map.Entry<Integer,String> itr:hmOut2.entrySet())
		{
			System.out.println("Student Registration Number : "+itr.getKey()+", Medal Type : "+itr.getValue());
		}
	}
	
	
	
	
}
