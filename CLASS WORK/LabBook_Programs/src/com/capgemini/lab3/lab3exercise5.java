package com.capgemini.lab3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class lab3exercise5 
{
	
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new FileReader("D:\\sample.txt"));
		String currentLine = reader.readLine();
		int lineCount=0,word=0,ch=0;
		String[] arrWord;
		String[] arrChar;
		while (currentLine != null)
        {
			lineCount++;
			arrWord=currentLine.split("[ ,.]");
			word=word+arrWord.length;
			for(int i=0;i<arrWord.length;i++)
			{
				ch=ch+arrWord[i].length();
			}
			currentLine = reader.readLine();
        }
		System.out.println("Number of Characters : "+ch);
		System.out.println("Number of lines : "+lineCount);
		System.out.println("Number of words : "+word);
	}

}
