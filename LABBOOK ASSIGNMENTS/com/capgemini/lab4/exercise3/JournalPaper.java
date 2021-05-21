package com.capgemini.lab4.exercise3;

public class JournalPaper extends WrittenItem
{
	private int year;

	public JournalPaper(int year) 
	{
		super();
		this.year = year;
	}
	public JournalPaper(long UINumber,String title,String author,int year,int numberOfCopies) 
	{
		super(UINumber,title,numberOfCopies,author);
		this.year=year;
		// TODO Auto-generated constructor stub
	}
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	} 
	
	
	
	@Override
	public String toString() {
		return "Journal Paper year = " + year + " "+super.checkOut();
	}
	public void printJournal()
	{
		String p1=super.toString();
		System.out.println(p1);
		System.out.println(toString());
		System.out.println();
	}
	
}
