package com.capgemini.lab6.exercise2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharacterMain {

	public static void main(String[] args) {
		//ArrayList<String> al=new ArrayList<String>();
		
		Map<Character,Integer> hm=new HashMap<Character,Integer>();
		CountCharacter cc=new CountCharacter();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of characters, want to insert : ");
		int num=sc.nextInt();
		char[] arr=new char[num];
		arr=cc.insert(num);
		hm=cc.countChars(arr);
		cc.print(hm);
	}

}
