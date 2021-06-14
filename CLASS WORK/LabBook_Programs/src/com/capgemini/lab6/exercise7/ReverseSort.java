package com.capgemini.lab6.exercise7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseSort {
	
	int[] arr;
	String str;
	Scanner sc=new Scanner(System.in);
	StringBuilder sb = new StringBuilder();
	ArrayList<Integer> al=new ArrayList<Integer>();
	public int[] insert(int n) 
	{
		arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}

	public int[] getSorted(int[] arr) 
	{
		String str;
		for(int i=0;i<arr.length;i++)
		{
			str=""+arr[i];
			sb = new StringBuilder();
			arr[i]=Integer.parseInt(sb.append(str).reverse().toString());
		}
		for(int i=0;i<arr.length;i++)
		{
			al.add(arr[i]);
		}
		Collections.sort(al);
		for(int i=al.size()-1;i>=0;--i)
		{
			arr[i]=al.get(i);
		}
		return arr;
	}

	public void print(int[] arr) 
	{
		System.out.println("After reversing the number and sorting the list : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
