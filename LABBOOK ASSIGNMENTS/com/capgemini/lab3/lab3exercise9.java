package com.capgemini.lab3;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class lab3exercise9 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("enter Start date in the format yyyy-mm-dd");
		Scanner sc=new Scanner(System.in);
		String dt=sc.nextLine();
		LocalDate sd=LocalDate.parse(dt);
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String today=sdf.format(d);
		LocalDate sdt=LocalDate.parse(today);
		Period p=Period.between(sd, sdt);
		String str=p.toString();
		String[] arr=str.split("[PYMD]");
		//System.out.println(arr.length);
		System.out.println("Year : "+arr[1]+" Month : "+arr[2]+" Day : "+arr[3]);
	}

}
