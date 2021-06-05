package com.capgemini.lab8.exercise1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDataThread extends Thread
{
	public void run()
	{
		try {
			fileHandle();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void fileHandle() throws IOException
	{
		File file1 = new File("src\\com\\capgemini\\lab8\\source.txt");
		File file2=new File("src\\com\\capgemini\\lab8\\target.txt");
		BufferedReader br = new BufferedReader(new FileReader(file1));
		BufferedWriter writer = new BufferedWriter(new FileWriter(file2));
		
	    String str="ABCD EFGH";
	    //writer.write(str);
	    
		String st;
		  while ((st = br.readLine()) != null)
		  {
			  for(int i=0;i<st.length();i++)
				{
					//System.out.println(i);
				  	writer.write(st.charAt(i));
					if((i+1)%10==0)
					{
						try {
							writer.write("|\n");
							System.out.println("10 characters are copied");
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					
				}
		  }
		  writer.close();
	}
}
