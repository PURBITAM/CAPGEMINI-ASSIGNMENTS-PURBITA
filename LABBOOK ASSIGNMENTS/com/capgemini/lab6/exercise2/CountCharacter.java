package com.capgemini.lab6.exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharacter 
{
	Scanner sc=new Scanner(System.in);
	Map<Character,Integer> hm=new HashMap<Character,Integer>();
	ArrayList<Character> al=new ArrayList<Character>();
	char[] arr;
	int num;
	
	public char[] insert(int num) 
	{
		char chr;
		int ch,key;
		this.num=num;
		arr=new char[num];
		System.out.println("enter "+num+" elements : ");
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.next().trim().charAt(0);
		}
		return arr;
	}
	
	public Map<Character, Integer> countChars(char[] arr2) 
	{
		al.add(arr2[0]);
		for(int j=1;j<arr2.length;j++)
		{
			for(int i=0;i<al.size();i++)
			{
				if(arr2[j]!=al.get(i))
				{
					al.add(arr2[j]);
				}
			}
		}
		int count;
		for(int i=0;i<al.size();i++)
		{
			count=0;
			for(int j=0;j<arr2.length;j++)
			{
				if(al.get(i)==arr[j])
				{
					count++;
				}
			}
			hm.put(al.get(i),count);
		}
		return hm;
	}


	public void print(Map<Character, Integer> hm2) 
	{
		System.out.println();
		System.out.println("Number of times each character is present in the array : ");
		System.out.println(hm2);
	}
}
