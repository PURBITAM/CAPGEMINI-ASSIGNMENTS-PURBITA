package com.capgemini.lab6.exercise6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class VoteEligibilityMain {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		Map<Integer, String> hm=new HashMap<Integer,String>();
		VoteEligibility ve=new VoteEligibility();
		hm=ve.insert();
		al=ve.voterList(hm);
		ve.print(al);
	}

}
