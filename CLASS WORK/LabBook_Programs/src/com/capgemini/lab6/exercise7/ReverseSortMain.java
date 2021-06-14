package com.capgemini.lab6.exercise7;

import java.util.Scanner;

public class ReverseSortMain 
{
	public static void main(String[] args) {
		int[] arr;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Integers, want to insert : ");
		int n=sc.nextInt();
		arr=new int[n];
		ReverseSort rs=new ReverseSort();
		arr=rs.insert(n);
		arr=rs.getSorted(arr);
		rs.print(arr);
	}
}
