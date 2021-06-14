package com.capgemini.lab4.exercise3;

abstract public class WrittenItem extends Item
{
	private String author;

	public WrittenItem() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public WrittenItem(long uINumber, String title, int numberOfCopies, String author) 
	{
		super(uINumber, title, numberOfCopies);
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() 
	{	
		print();
		System.out.println(super.toString());
		return "Author name = " + author;
	}
	
	
}
