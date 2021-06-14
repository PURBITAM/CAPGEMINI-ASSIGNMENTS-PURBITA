package com.capgemini.lab2;
/*
 Exercise 4: Create a method which accepts an integer array and 
 removes all the duplicates in the array. Return the resulting 
 array in descending order.
 */
import java.util.Arrays;
import java.util.Scanner;

public class lab2exercise4 {

	public int[] modifyArray(int[] arr)
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
		return uniq;
	}

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
		lab2exercise4 lb=new lab2exercise4();
		int[] uniqArr=lb.modifyArray(arr);
		System.out.println("array of unique integers in descending order : ");
		for(int i=uniqArr.length-1;i>=0;i--)
		{
			System.out.print(uniqArr[i]+" ");
		}
	}

}
