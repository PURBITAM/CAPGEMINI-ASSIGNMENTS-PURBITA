package com.capgemini.lab6.exercise4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ScholarshipEligibilityMain 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
		Map<Integer,String> hmOut=new HashMap<Integer,String>();
		ArrayList<Integer> al=new ArrayList<Integer>();
		ScholarshipEligibility se=new ScholarshipEligibility();
		hm=se.Insert();
		hmOut=se.getStudents(hm);
		se.print(hmOut);
	}
}
