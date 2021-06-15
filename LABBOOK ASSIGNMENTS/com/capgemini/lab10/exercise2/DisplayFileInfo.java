package com.capgemini.lab10.exercise2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;

public class DisplayFileInfo 
{
	static void p(String s) {
		System.out.println(s);
		}
	public static void main(String args[ ]) 
	{
		try  
		{
			String f="src\\com\\capgemini\\lab10\\file1.txt";
			File file=new File(f);
			FileReader fr=new FileReader(file); 
			BufferedReader br=new BufferedReader(fr); 
			String line;
			System.out.println("File Information : ");
			System.out.println("=====================================================");
			System.out.println("File Exists or not :"+file.exists());
			System.out.println("File readable or not : "+file.canRead());
			System.out.println("File writable or not : "+file.canRead());
			int index = f.lastIndexOf('.');
			System.out.println("Type of file : "+f.substring(index+1)+" file");
			System.out.println("Length of bytes : "+file.length() + " Bytes");
			fr.close(); 
		}  
		catch(IOException e)  
		{  
			e.printStackTrace();  
		}  
		
//		p("File Name: " + f1.getName());
//		p("Path: " + f1.getPath());
//		p("Abs Path: " + f1.getAbsolutePath());
//		p("Parent: " + f1.getParent());
//		p(f1.exists() ? "exists" : "does not exist");
//		p(f1.canWrite() ? "is writeable" : "is not writeable");
//		p(f1.canRead() ? "is readable" : "is not readable");
//		p("is " + (f1.isDirectory() ? "" : "not" + " a directory"));
//		p(f1.isFile() ? "is normal file" : "might be a named pipe");
//		p(f1.isAbsolute() ? "is absolute" : "is not absolute");
//		p("File last modified: " + f1.lastModified());
//		p("File size: " + f1.length() + " Bytes");
		}
}
