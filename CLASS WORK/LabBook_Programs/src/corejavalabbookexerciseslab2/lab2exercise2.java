package corejavalabbookexerciseslab2;

import java.util.Arrays;
import java.util.Scanner;
/*
 Exercise 2: Create a method that can accept an array of String objects and 
 sort in alphabetical order. The elements in the left half should be completely 
 in uppercase and the elements in the right half should be completely in lower 
 case. Return the resulting array.
 */
public class lab2exercise2 
{
	public String[] sortStrings(String[] arr)
	{
		Arrays.sort(arr);
		if(arr.length%2==0)
		{
			for(int i=0;i<arr.length/2;i++)
			{
				arr[i]=arr[i].toUpperCase();
			}
			for(int i=(arr.length)/2;i<arr.length;i++)
			{
				arr[i]=arr[i].toLowerCase();
			}
		}
		else
		{
			for(int i=0;i<(int)((arr.length)/2)+1;i++)
			{
				arr[i]=arr[i].toUpperCase();
			}
			for(int i=(int)((arr.length)/2)+1;i<arr.length;i++)
			{
				arr[i]=arr[i].toLowerCase();
			}
				
		}
		return arr; 
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array : ");
		int n=sc.nextInt();
		String[] arr=new String[n];
		sc.nextLine();
		System.out.println("enter values of array 1 : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextLine();
		}
		lab2exercise2 le=new lab2exercise2();
		String[] arr1=le.sortStrings(arr);
		System.out.println("Resulting array is : ");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
	}

}
