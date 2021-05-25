package com.capgemini.selfstudy8.flowerhashset;

import java.util.HashSet;
import java.util.Scanner;

import selfstudy8.Product;

public class FlowerMain {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Flower f=new Flower();
		HashSet<Flower> hs=new HashSet<Flower>();
	while(true)
	{
		
		System.out.println("Enter choide\n1. create\n2. update\n3. delete\n4. display all\n5. display by id");
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1 : 	hs=f.createList();
					break;
		case 2 : 	System.out.println("Enter the fid to be updated : ");
					int id=sc.nextInt();
					f.updateById(hs,id);
					break;
		case 3 : 	System.out.println("Enter the fid to be deleted : ");
					int id2=sc.nextInt();
					f.deleteById(hs,id2);
					break;
		case 4 : 	f.display(hs);
					break;
		case 5 : 	System.out.println("Enter the fid to see details : ");
					int id1=sc.nextInt();
					f.findProductById(hs,id1);
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
