package com.capgemini.lab6.exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapGetValue 
{	
	Scanner sc=new Scanner(System.in);
	HashMap<Integer,String> hm=new HashMap<Integer,String>();
	ArrayList<String> al=new ArrayList<String>();
	
	public HashMap<Integer, String> insert() 
	{
		String str;
		int ch,key;
		while(true)
		{
			System.out.print("Enter Key : ");
			key=sc.nextInt();
			System.out.print("Enter Value : ");
			str=sc.next();
			hm.put(key, str);
			System.out.print("want to add more : 1. yes  2. no => ");
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
	
	public ArrayList<String> getValues(HashMap<Integer, String> hm2) {
		for(String stritr : hm2.values())
		{
			al.add(stritr);
		}
		return al;
	}

	public void print(ArrayList<String> al2) 
	{
		System.out.println();
		System.out.println("The values of the map in sorted order : ");
		Collections.sort(al2);
		for(int i=0;i<al2.size();i++)
		{
			System.out.println(al2.get(i));
		}
	}

}
