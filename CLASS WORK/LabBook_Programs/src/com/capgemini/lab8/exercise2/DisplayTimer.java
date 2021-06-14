package com.capgemini.lab8.exercise2;

import java.util.Date;

public class DisplayTimer implements Runnable
{
	@Override
	public void run() 
	{
		while(true)
		{
			System.out.println("[" + new Date() + "] ");
			try 
			{
				Thread.sleep(10000);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
