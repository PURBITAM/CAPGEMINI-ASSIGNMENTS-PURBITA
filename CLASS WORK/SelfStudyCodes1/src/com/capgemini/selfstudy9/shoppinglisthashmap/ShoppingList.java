package com.capgemini.selfstudy9.shoppinglisthashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class ShoppingList 
{
	private int id;
	private String nameOfItem;
	
	public ShoppingList() {
		super();
	}

	public ShoppingList(int id, String nameOfItem) {
		super();
		this.id = id;
		this.nameOfItem = nameOfItem;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameOfItem() {
		return nameOfItem;
	}

	public void setNameOfItem(String nameOfItem) {
		this.nameOfItem = nameOfItem;
	}

	HashMap<Integer,String> hm=new HashMap<Integer,String>();
	Scanner sc=new Scanner(System.in);
	public HashMap<Integer,String> create()
	{
		System.out.println("Enter data : ");
		System.out.println("Enter id : ");
		id=sc.nextInt();
		System.out.println("Enter name of item : ");
		sc.nextLine();
		nameOfItem=sc.nextLine();
		hm.put(id, nameOfItem);
		return hm;
	}
	
	public void displayKey(HashMap<Integer,String> hm1)
	{
		Set<Integer> KeySet=hm.keySet();
		System.out.println("IDs of Shopping List : "+KeySet);
	}
	
	public void displayValue(HashMap<Integer,String> hm1)
	{
		Collection<String> ValueSet =hm1.values();
		System.out.println("Name of Items of Shopping List : "+ValueSet);
	}
	
	public void displayKeyValue(HashMap<Integer,String> hm1)
	{
		Set<Entry<Integer,String>> KeyValueSet =hm1.entrySet();
		System.out.println("IDs and Name of Items of the Shopping List : "+KeyValueSet);
	}
	
	public void sort(HashMap<Integer,String> hm1)
	{
		Map<Integer,String> listSort=new TreeMap<Integer,String>();
		listSort.putAll(hm1);
		System.out.println("Sorted Shopping List : "+listSort);
	}
	
	public void replaceName(HashMap<Integer,String> hm1,int id1)
	{
		Set<Entry<Integer,String>> KeyValueSet =hm1.entrySet();
		System.out.println("Key and Values of the above HashMap : "+KeyValueSet);
		System.out.println("Enter name of item : ");
		nameOfItem=sc.nextLine();
		hm1.replace(id1,nameOfItem);
		System.out.println("Key and Values of the above HashMap after replace : "+KeyValueSet);
	}
}
