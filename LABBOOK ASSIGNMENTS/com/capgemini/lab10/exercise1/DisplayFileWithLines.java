package com.capgemini.lab10.exercise1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DisplayFileWithLines 
{
	public static void main(String args[])  
	{  
		try  
		{  
			File file=new File("src\\com\\capgemini\\lab10\\file1.txt");
			FileReader fr=new FileReader(file); 
			BufferedReader br=new BufferedReader(fr); 
			String line;  
			int inr=1;
			while((line=br.readLine())!=null)  
			{  
				System.out.print("Line "+inr++);
				System.out.println(" -> "+line);
			}  
			fr.close(); 
		}  
		catch(IOException e)  
		{  
			e.printStackTrace();  
		}  
	}  
}
