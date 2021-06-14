package com.capgemini.selfstudy9.shoppinglisthashmap;

import java.util.HashMap;
import java.util.Scanner;

public class ShoppingListMain {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		ShoppingList sl=new ShoppingList();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			
			System.out.println("Enter choice\n1. insert\n2. display IDs\n3. display Name of items\n4. display IDs with Name of items\n5. Sort the list\n6. Replace name of item");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1 : 	hm=sl.create();
						break;
			case 2 : 	sl.displayKey(hm);
						break;
			case 3 : 	sl.displayValue(hm);
						break;
			case 4 : 	sl.displayKeyValue(hm);
						break;
			case 5 : 	sl.sort(hm);
						break;
			case 6 : 	System.out.println("Enter the ID to to replace name : ");
						int id=sc.nextInt();
						sl.replaceName(hm,id);
						break;
			default : System.out.println("Wrong choice");
						break;
						
			}
			System.out.println("Continue \n1. yes\n2. no");
			ch=sc.nextInt();
			if(ch==1)
			{
				continue;
			}
			else
			{
				break;
			}
		}
	}

}
