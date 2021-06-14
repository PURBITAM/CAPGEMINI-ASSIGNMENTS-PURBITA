package com.capgemini.lab9.concurrentpatterns.exercise1;

public class RunnableTwo implements Runnable{
	public void run()
	{
		while(true)
		{
			System.out.println("Executing task two");
			try
			{
				Thread.sleep(10000);
			}
			catch(Throwable e)
			{
				e.printStackTrace();
			}
		}
	}
}
