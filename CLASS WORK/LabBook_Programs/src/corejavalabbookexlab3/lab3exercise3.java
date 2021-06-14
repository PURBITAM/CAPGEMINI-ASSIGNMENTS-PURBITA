package corejavalabbookexlab3;

import java.util.Scanner;

public class lab3exercise3 
{
	public String alterString(String str)
	{
		String retStr="";
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
			   ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'))
			{
				retStr+=(char)(((int)ch)+1);
			}
			else
			{
				retStr+=ch;
			}
		}
		return retStr;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.print("enter String to be altered : ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		lab3exercise3 le=new lab3exercise3();
		String retStr=le.alterString(str);
		System.out.println("Altered String is : "+retStr);
	}

}
