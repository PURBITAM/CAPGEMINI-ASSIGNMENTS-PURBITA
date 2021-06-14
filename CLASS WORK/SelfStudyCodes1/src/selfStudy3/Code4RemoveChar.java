package selfStudy3;

import java.util.Scanner;

public class Code4RemoveChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String : ");
		String str1=sc.nextLine();
		System.out.println("Enter Second String : ");
		String str2=sc.nextLine();
		String str3="";
		int count=0,flag=0;
		for(int i=0;i<str1.length();i++)
		{
			flag=0;
			for(int j=0;j<str2.length();j++)
			{
				if(str1.charAt(i)==str2.charAt(j))
				{
					flag=1;
				}
			}
			if(flag==0)
			{
				str3+=str1.charAt(i);
			}
		}
		System.out.println("After removing characters from the first string which are present in the second string");
		System.out.println("The final string is : "+str3);
	}

}
