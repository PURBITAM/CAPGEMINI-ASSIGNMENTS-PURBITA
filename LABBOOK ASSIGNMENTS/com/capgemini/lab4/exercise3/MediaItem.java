package com.capgemini.lab4.exercise3;

public class MediaItem extends Item
{
	private int runtime;
	
	public MediaItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MediaItem(long uINumber, String title, int numberOfCopies,int runtime) {
		super(uINumber, title, numberOfCopies);
		this.runtime=runtime;
		// TODO Auto-generated constructor stub
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	@Override
	public String toString() 
	{
		print();
		System.out.println(super.toString());
		return "runtime = " + runtime;
	} 
	
	
}
