package com.capgemini.lab4.exercise3;

public class Book extends WrittenItem
{

	public Book(long UINumber,String title,String author,int numberOfCopies) 
	{
		super(UINumber,title,numberOfCopies,author);
		// TODO Auto-generated constructor stub
	}
	
	public void printBook()
	{
		String p1=super.toString();
		System.out.println(p1+super.checkOut());
		System.out.println();
	}
	
	
}
