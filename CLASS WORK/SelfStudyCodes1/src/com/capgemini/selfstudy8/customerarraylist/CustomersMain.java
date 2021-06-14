package com.capgemini.selfstudy8.customerarraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


public class CustomersMain {

	public static void main(String[] args) throws InvalidAgeException, InvalidMobNoException, InvalidEmailException, InvalidCidException, InvalidNameException 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Customer c=new Customer();
		ArrayList<Customer> alc=new ArrayList<Customer>();
		while(true)
		{
			
			System.out.println("Enter choice\n1. insert\n2. update\n3. delete\n4. display all\n5. display by id");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1 : 	alc=c.insert();
						break;
			case 2 : 	System.out.println("Enter the customer id to be updated : ");
						int id=sc.nextInt();
						c.updateById(alc,id);
						break;
			case 3 : 	System.out.println("Enter the customer id to be deleted : ");
						int id2=sc.nextInt();
						c.deleteById(alc,id2);
						break;
			case 4 : 	if(alc==null)
						{
							System.out.println("Nothing to print");
						}
						else
						{
							c.display(alc);
						}
						break;
			case 5 : 	System.out.println("Enter the customer id to see details : ");
						int id1=sc.nextInt();
						c.findProductById(alc,id1);
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
