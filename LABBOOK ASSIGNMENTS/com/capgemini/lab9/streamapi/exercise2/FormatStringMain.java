package com.capgemini.lab9.streamapi.exercise2;

import java.util.Scanner;

public class FormatStringMain {

	public static void main(String[] args) 
	{
		FormatString fs=(str)->{
			String[] ch=str.split("");
			String outputStr="";
			for(int i=0;i<ch.length;i++)
			{
				if(i!=0)
				{
					outputStr+=" ";
				}
				outputStr+=ch[i];
			}
			return outputStr;
		};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String : ");
		String str=sc.next();
		System.out.println("Formatted string : "+fs.formatString(str));
	}

}
