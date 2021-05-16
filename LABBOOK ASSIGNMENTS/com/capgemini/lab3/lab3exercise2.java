package com.capgemini.lab3;

import java.util.Scanner;

public class lab3exercise2 
{
	public String getImage(String str)
	{
		StringBuffer sb=new StringBuffer();
		sb.append(str);
		sb.reverse();
		String retStr=str+"|"+sb;
		return retStr;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String to be reversed : ");
		String str=sc.nextLine();
		lab3exercise2 le=new lab3exercise2();
		String retStr=le.getImage(str);
		System.out.println(" mirror image of a String "+str+" : "+retStr);
	}
}
