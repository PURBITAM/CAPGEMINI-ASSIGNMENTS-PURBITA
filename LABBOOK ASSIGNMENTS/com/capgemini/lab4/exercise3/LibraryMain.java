package com.capgemini.lab4.exercise3;

import java.util.Scanner;

public class LibraryMain 
{
	static long UINumber;
	static String title,artist,genre,director,author;
	static int numberOfCopies,year,runtime;
	static Scanner sc=new Scanner(System.in);
	public static void bookMethod()
	{
		System.out.println("Enter UINumber : ");
		UINumber=sc.nextLong();
		System.out.println("Enter Title : ");
		sc.nextLine();
		title=sc.nextLine();
		System.out.println("Enter Number Of Copies : ");
		numberOfCopies=sc.nextInt();
		System.out.println("Enter Author : ");
		sc.nextLine();
		author=sc.nextLine();
		Book it=new Book(UINumber,title,author,numberOfCopies);
		System.out.println();
		System.out.println("===BOOK DETAILS===");
		it.printBook();
	}
	public static void JournalMethod()
	{
		System.out.println("Enter UINumber : ");
		UINumber=sc.nextLong();
		System.out.println("Enter Title : ");
		sc.nextLine();
		title=sc.nextLine();
		System.out.println("Enter Number Of Copies : ");
		numberOfCopies=sc.nextInt();
		System.out.println("Enter Author : ");
		sc.nextLine();
		author=sc.nextLine();
		System.out.println("Enter Year : ");
		year=sc.nextInt();
		JournalPaper jp=new JournalPaper(UINumber,title,author,year,numberOfCopies);
		System.out.println("===JOURNAL PAPER DETAILS===");
		jp.printJournal();
	}
	public static void VideoMethod()
	{
		System.out.println("Enter UINumber : ");
		UINumber=sc.nextLong();
		System.out.println("Enter Title : ");
		sc.nextLine();
		title=sc.nextLine();
		System.out.println("Enter Number Of Copies : ");
		numberOfCopies=sc.nextInt();
		System.out.println("Enter Director : ");
		sc.nextLine();
		director=sc.nextLine();
		System.out.println("Enter Genre : ");
		genre=sc.nextLine();
		System.out.println("Enter Year : ");
		year=sc.nextInt();
		System.out.println("Enter Run Time : ");
		runtime =sc.nextInt();
		Video v=new Video(UINumber,title,director,genre,year,numberOfCopies,runtime);
		System.out.println("===VIDEO DETAILS===");
		v.printVideo();
	}
	public static void CDMethod()
	{
		System.out.println("Enter UINumber : ");
		UINumber=sc.nextLong();
		System.out.println("Enter Title : ");
		sc.nextLine();
		title=sc.nextLine();
		System.out.println("Enter Number Of Copies : ");
		numberOfCopies=sc.nextInt();
		System.out.println("Enter Director : ");
		sc.nextLine();
		artist=sc.nextLine();
		System.out.println("Enter Genre : ");
		genre=sc.nextLine();
		System.out.println("Enter Run Time : ");
		runtime =sc.nextInt();
		CD cd=new CD(UINumber,title,artist,genre,numberOfCopies,runtime);
		System.out.println("===CD DETAILS===");
		cd.printCD();
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		while(true)
		{
			System.out.println("Enter Choice : \n1. Book\n2. Journal Paper\n3. Video \n4. CD");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1: {
							bookMethod();
							break;
						}
				case 2: {
							JournalMethod();
							break;
						}
				case 3: {
							VideoMethod();
							break;
						}
				case 4: {
							CDMethod();
							break;
						}
			}
			System.out.println("Want More : \n1.YES\n2.NO");
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
