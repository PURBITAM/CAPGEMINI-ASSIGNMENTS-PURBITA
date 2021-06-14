package com.capgemini.lab2;

import java.util.Arrays;
import java.util.Scanner;
/*
 Exercise 3: Create a method which accepts an integer array, reverse the 
 numbers in the array and returns the resulting array in sorted order.
 */
public class lab2exercise3 {

	public int[] getSorted(int[] arr)
	{
		Arrays.sort(arr);
		int[] arr1=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			arr1[i]=arr[arr.length-i-1];
		}
		return arr1; 
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		sc.nextLine();
		System.out.println("enter values of array 1 : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		lab2exercise3 le=new lab2exercise3();
		int[] arr1=le.getSorted(arr);
		System.out.println("Resulting array is : ");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
	}
}
