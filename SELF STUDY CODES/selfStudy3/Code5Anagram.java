package selfStudy3;

import java.util.Scanner;

public class Code5Anagram {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String : ");
		String str1=sc.nextLine();
		System.out.println("Enter Second String : ");
		String str2=sc.nextLine();
		int count1=0,count2=0,flag=0;
		for(int i=0;i<str1.length();i++)
		{
			for(int j=0;j<str2.length();j++)
			{
				if(str1.charAt(i)==str2.charAt(j))
				{
					flag=1;
				}
			}
			if(flag==1)
			{
				count1++;
			}
		}
		flag=0;
		for(int i=0;i<str2.length();i++)
		{
			for(int j=0;j<str1.length();j++)
			{
				if(str2.charAt(i)==str1.charAt(j))
				{
					flag=1;
				}
			}
			if(flag==1)
			{
				count2++;
			}
		}
		if(count1==count2)
		{
			System.out.println("Two strings are anagram");
		}
		else
		{
			System.out.println("Two strings are not anagram");
		}
	}

}
