package com.capgemini.lab6.exercise3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumOfSquareMain {

	public static void main(String[] args) {
		ArrayList<Character> al=new ArrayList<Character>();
		Map<Integer, Integer> hm=new HashMap<Integer,Integer>();
		NumOfSquare nos=new NumOfSquare();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of Integers, want to insert : ");
		int num=sc.nextInt();
		int[] arr=new int[num];
		arr=nos.insert(num);
		hm=nos.getSquares(arr);
		nos.print(hm);
	}

}
