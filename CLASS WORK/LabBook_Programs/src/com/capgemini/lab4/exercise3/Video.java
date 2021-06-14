package com.capgemini.lab4.exercise3;

public class Video extends MediaItem
{
	String director;
	String genre;
	int year;
	public Video(long uINumber, String title, String director, String genre, int year, int numberOfCopies,int runtime) 
	{
		super(uINumber,title,numberOfCopies,runtime);
		// TODO Auto-generated constructor stub
		this.director = director;
		this.genre = genre;
		this.year = year;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() 
	{
		
		return "Video director = " + director + "\ngenre = " + genre + "\nyear = " + year + " "+super.checkOut();
	}

	public void printVideo()
	{
		String p1=super.toString();
		System.out.println(p1);
		System.out.println(toString());
		System.out.println();
	}
}
