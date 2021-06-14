package com.capgemini.lab6.exercise5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindSecondSmallest 
{
	int[] arr;
	Scanner sc=new Scanner(System.in);
	ArrayList<Integer> al=new ArrayList<Integer>();
	
	public int[] insert(int n) 
	{
		arr=new int[n];
		System.out.println("Enter Integers : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}

	public int[] getSecondSmallest(int[] arr) 
	{
//		for(int i=0;i<arr.length;i++)
//		{
//			al.add(arr[i]);
//		}
		al.add(arr[0]);
		for(int j=1;j<arr.length;j++)
		{
			for(int i=0;i<al.size();i++)
			{
				if(arr[j]!=al.get(i))
				{
					al.add(arr[j]);
				}
			}
		}
		Collections.sort(al);
		for(int i=0;i<al.size();i++)
		{
			arr[i]=al.get(i);
		}
		return arr;
	}

	public void print(int[] arr2) 
	{
		if(arr2.length==1)
		{
			System.out.println("Only one element present,second element doesn't exist");
		}
		else
		{
			int first=arr2[0],count=0;
			for(int i=1;i<arr2.length;i++)
			{
				if(arr2[i]==first)
				{
					count++;
				}
			}
			if(count==arr2.length-1)
			{
				System.out.println("All the elements of array are equal");
			}
			else
			{
				System.out.print("Second smallest element in the array : "+arr2[1]);
			}
			
		}
		
	}
}
