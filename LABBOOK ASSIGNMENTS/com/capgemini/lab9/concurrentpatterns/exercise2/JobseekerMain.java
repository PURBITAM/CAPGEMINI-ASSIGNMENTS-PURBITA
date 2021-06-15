package com.capgemini.lab9.concurrentpatterns.exercise2;

import java.util.Scanner;

public class JobseekerMain 
{
	public static void main(String[] args) {
		System.out.print("Enter username : ");
		Scanner sc=new Scanner(System.in);
		String username=sc.next();
		JobseekerValidate jv=new JobseekerValidate();
		boolean b=(jv.usernameValidate(username));
		if(b)
		{
			System.out.println("Username Is Valid");
		}
		else
		{
			System.out.println("Username Is Invalid");
		}
	}
}
