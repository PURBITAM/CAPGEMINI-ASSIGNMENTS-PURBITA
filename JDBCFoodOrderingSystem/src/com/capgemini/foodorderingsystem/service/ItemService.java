package com.capgemini.foodorderingsystem.service;

import java.util.Scanner;

import com.capgemini.foodorderingsystem.model.Item;

public class ItemService 
{
	Item itm=new Item();
	
	Scanner sc=new Scanner(System.in);
	int ch,itmId;
	char cont;
	public void addItem(int vId) 
	{
		itm.dbConnection();
		while(true)
		{
			System.out.println("Enter choice");
			System.out.println("1. Add Item");
			System.out.println("2. Update Item");
			System.out.println("3. Delete Item");
			System.out.println("4. Get Items");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1 : 	itm.insertItem(vId);	
						break;
			case 2 : 	System.out.println("Enter Item Id : ");
			            itmId=sc.nextInt();
						itm.updateItem(vId,itmId);
						break;
			case 3 : 	System.out.println("Enter Item Id : ");
			            itmId=sc.nextInt();
						itm.deleteItem(vId,itmId);
						break;
			case 4 : 	System.out.println("All Items : ");
						itm.getItem(vId);
						break;
			}
			System.out.print("do you want to continue Item Operation : ");
			cont = sc.next().trim().charAt(0);
			if(cont=='y')
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
