package com.capgemini.lab6.exercise6;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VoteEligibility 
{
	Scanner sc=new Scanner(System.in);
	Map<Integer,String> hm=new HashMap<Integer,String>();
	Map<Integer,Float> hmAge=new HashMap<Integer,Float>();
	ArrayList<Integer> al=new ArrayList<Integer>();
	double yearsBetween,mBetween;
	Period period;
	LocalDate date1,date2;
	Date dt=new Date();
	float age1;
	int id,ch;
	String age;

	public Map<Integer,String> insert() 
	{
		while(true)
		{
			System.out.println("Enter ID :");
			id=sc.nextInt();
			System.out.println("Enter DOB (yyyy-MM-dd): ");
			age=sc.next();
			hm.put(id,age);
			
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

	public ArrayList<Integer> voterList(Map<Integer, String> hm2) 
	{
		for(Map.Entry<Integer,String> itr:hm2.entrySet())
		{
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			String dt1=sdf.format(dt);
			date1 = LocalDate.parse(itr.getValue());
			date2 = LocalDate.parse(dt1);
			period = date1.until(date2);
			yearsBetween = period.getYears();
			mBetween = (period.getMonths());
			age1=(float) (((yearsBetween*12)+mBetween)/12);
			hmAge.put(itr.getKey(),age1);
		}
		
		for(Map.Entry<Integer,Float> itr:hmAge.entrySet())
		{
			if(itr.getValue()>18)
			{
				al.add(itr.getKey());
			}
		}
		return al;
	}

	
	public void print(ArrayList<Integer> al2) 
	{
		System.out.println("List Of Persons, eligible for Vote are :");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
	}
	
	
}
