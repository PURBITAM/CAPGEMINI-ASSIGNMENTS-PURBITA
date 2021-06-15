package com.capgemini.foodorderingsystem.service;

import java.util.Scanner;

import com.capgemini.foodorderingsystem.model.Item;
import com.capgemini.foodorderingsystem.model.Order;

public class OrderService 
{
	Order ord=new Order();
	Item itm=new Item();
	Scanner sc=new Scanner(System.in);
	int ch,itmId;
	char cont;
	public void placeOrder(int custId) 
	{
		ord.dbConnection();
		itm.dbConnection();
		while(true)
		{
			System.out.println("Enter choice");
			System.out.println("1. Place Order");
			System.out.println("2. Delete Order"); // update status
			System.out.println("3. Order details");
			System.out.println("4. Order history");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1 : 	itm.getAllItem();
						System.out.print("Enter Item ID : ");
						int itmId=sc.nextInt();
						System.out.print("Enter quantity : ");
						int qty=sc.nextInt();
						ord.insertOrd(itmId,qty,custId);	
						break;
//			case 2 : 	System.out.println("Enter Item Id : ");
//			            itmId=sc.nextInt();
//						itm.updateItem(custId,itmId);
//						break;
			case 3 : 	ord.orderDetails(custId);
						break;
//			case 4 : 	System.out.println("All Items : ");
//						itm.getItem(custId);
//						break;
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
