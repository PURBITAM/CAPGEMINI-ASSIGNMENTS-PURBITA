package selfStudy3;

import java.util.Scanner;

public class Code11SubstringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter string : ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.print("Start of substring : ");
		int start=sc.nextInt();
		start=start-1;
		System.out.print("End if substring : ");
		int end=sc.nextInt();
		if((start<end) && (end<=str.length()))
		{
			String substr=str.substring(start,end);
			int loop=0,temp=0,count=0,n,flag=0;
			if(substr.length()%2==0)
			{
				loop=substr.length()/2;
			}
			else if(substr.length()%2!=0)
			{
				loop=(int)(substr.length()/2);
			}
			temp=loop;
			n=0;
			while(temp>0)
			{
				if(substr.charAt(substr.length()-1-n)==substr.charAt(n))
				{
					count++;
				}
				n++;
				temp--;
			}
			if(loop==count)
			{
				System.out.println("Substring is Palindrome");
			}
			else
			{
				System.out.println("Substring is not Palindrome");
			}
		}
		else
		{
			System.out.println("Wrong start or end index inserted");
		}
		
	}

}
