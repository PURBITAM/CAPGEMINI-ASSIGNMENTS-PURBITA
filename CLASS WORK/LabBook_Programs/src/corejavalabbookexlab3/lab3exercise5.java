package corejavalabbookexlab3;

import java.util.Scanner;
//=======================================
public class lab3exercise5 
{
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.print("Enter the number to be modefied : ");
		Scanner sc=new Scanner(System.in);
		String num=sc.nextLine();
		String[] lines=num.split("\r\n|\r|\n");
		String[] words=num.split("[ ,.]");
		System.out.println("No of Lines : "+lines.length);
		System.out.println("No of Words : "+words.length);
	}

}
