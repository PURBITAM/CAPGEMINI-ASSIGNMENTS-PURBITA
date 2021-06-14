package com.capgemini.lab6.exercise3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumOfSquare 
{
	Scanner sc=new Scanner(System.in);
	Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
	ArrayList<Integer> al=new ArrayList<Integer>();
	int[] arr;
	int num;
	
	public int[] insert(int num) 
	{
		char chr;
		int ch,key;
		this.num=num;
		arr=new int[num];
		System.out.println("enter "+num+" elements : ");
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	
	public Map<Integer, Integer> getSquares(int[] arr2) 
	{
		for(int i=0;i<arr2.length;i++)
		{
			hm.put(arr2[i],arr2[i]*arr2[i]);
		}
		return hm;
	}


	public void print(Map<Integer,Integer> hm2) 
	{
		System.out.println();
		System.out.println("Number with its Square value : ");
		System.out.println("Number => Square");
		for( Map.Entry<Integer,Integer> entry : hm.entrySet() ){
		    System.out.println( entry.getKey() + " => " + entry.getValue() );
		}
	}
	
}
