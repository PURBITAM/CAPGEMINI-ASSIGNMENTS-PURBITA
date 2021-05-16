package com.capgemini.lab2;

import java.util.Arrays;
import java.util.Scanner;
/*
  Exercise 1: Create a method which accepts an array of integer 
  elements and return the second smallest element in the array
  */
class findNum
{
	public int getSecondSmallest(int[] arr)
	{
		Arrays.sort(arr);
		
		int inr=1,flag=0;
		
		int[] uniq=new int[0];
		uniq=Arrays.copyOf(uniq,inr);
		uniq[0]=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			flag=0;
			for(int j=0;j<uniq.length;j++)
			{
				if(uniq[j]==arr[i])
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				inr++;
				uniq=Arrays.copyOf(uniq,inr);
				uniq[inr-1]=arr[i];
			}
		}
		System.out.println();
		return uniq[1];
	}
}
public class lab2exercise1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter values of array 1 : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		findNum fn=new findNum();
		int smallNum=fn.getSecondSmallest(arr);
		System.out.println("Second smallest number : "+smallNum);
	}
}
