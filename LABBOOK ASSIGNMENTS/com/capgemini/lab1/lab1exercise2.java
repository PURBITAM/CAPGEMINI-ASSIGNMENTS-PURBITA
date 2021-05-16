package com.capgemini.lab1;

import java.util.Scanner;

public class lab1exercise2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter choice");
			System.out.println("red - stop");
			System.out.println("yellow - ready");
			System.out.println("green - go");
			String choice = sc.nextLine();
			choice=choice.toLowerCase();
			switch(choice)
			{
				case "red":System.out.println("stop");
							break;
				case "yellow":System.out.println("ready");
							break;
				case "green":System.out.println("go");
							break;
				default:	System.out.println("wrong choice");
			}
		}
			
	}

}
