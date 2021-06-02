package com.capgemini.lab6.exercise1;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapMain {

	public static void main(String[] args) 
	{	
		ArrayList<String> al=new ArrayList<String>();
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		HashMapGetValue hmgv=new HashMapGetValue();
		hm=hmgv.insert();
		al=hmgv.getValues(hm);
		hmgv.print(al);
	}
}
