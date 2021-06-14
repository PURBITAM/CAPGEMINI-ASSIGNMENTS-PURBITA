package com.capgemini.lab4.exercise3;

public class CD extends MediaItem
{
	String artist;
	String genre;
	
	public CD(long uINumber, String title, String artist, String genre, int numberOfCopies,int runtime) 
	{
		super(uINumber,title,numberOfCopies,runtime);
		// TODO Auto-generated constructor stub
		this.artist = artist;
		this.genre = genre;
	}
	
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "artist = " + artist + "\ngenre = " + genre + " "+super.checkOut();
	}

	public void printCD() 
	{
		// TODO Auto-generated method stub
		String p1=super.toString();
		System.out.println(p1);
		System.out.println(toString());
		System.out.println();
	}
	
	
}
