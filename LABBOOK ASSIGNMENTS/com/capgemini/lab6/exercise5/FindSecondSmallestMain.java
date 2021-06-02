package com.capgemini.lab6.exercise5;

import java.util.ArrayList;
import java.util.Scanner;

public class FindSecondSmallestMain 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		FindSecondSmallest fss=new FindSecondSmallest();
		Scanner sc=new Scanner(System.in);
		int[] arr;
		System.out.println("Enter number if Integers, want to insert : ");
		int n=sc.nextInt();
		arr=new int[n];
		arr=fss.insert(n);
		arr=fss.getSecondSmallest(arr);
		fss.print(arr);
	}
}
