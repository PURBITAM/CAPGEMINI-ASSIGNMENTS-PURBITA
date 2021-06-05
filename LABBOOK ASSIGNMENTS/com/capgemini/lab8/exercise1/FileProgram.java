package com.capgemini.lab8.exercise1;

import java.util.Iterator;

public class FileProgram 
{
	public static void main(String[] args) throws InterruptedException {
		CopyDataThread t=new CopyDataThread();
		t.start();
	}
}
