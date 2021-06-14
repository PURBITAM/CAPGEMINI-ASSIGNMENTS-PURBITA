package com.capgemini.lab4.exercise3;

import java.util.Date;

public abstract class Item 
{
	private long UINumber;
	private String title;
	private int numberOfCopies;
	public Item()
	{
		
	}
	public Item(long uINumber, String title, int numberOfCopies) {
		super();
		UINumber = uINumber;
		this.title = title;
		this.numberOfCopies = numberOfCopies;
	}
	
	
	
	public long getUINumber() {
		return UINumber;
	}
	public void setUINumber(long uINumber) {
		UINumber = uINumber;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumberOfCopies() {
		return numberOfCopies;
	}
	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
	
	
	
	@Override
	public String toString() {
		return "Item UINumber=" + UINumber + " \nTitle = " + title + "\nNumber Of Copies  = " + numberOfCopies;
	}
	
	public void print()
	{
		checkIn();
		//System.out.println("Item UINumber=" + UINumber + " \nTitle = " + title + "\nNumber Of Copies  =" + numberOfCopies);
	}
	
	public void checkIn()
	{
		Date dt=new Date();
		System.out.println("Checked In At "+dt);
	}
	
	public String checkOut()
	{
		Date dt=new Date();
		return ("\nChecked Out At "+dt);
	}
}
