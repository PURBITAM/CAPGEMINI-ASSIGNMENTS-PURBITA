package com.capgemini.lab8.exercise2;

import java.util.Timer;

public class DisplayTimerMain 
{
	public static void main(String []args) 
	{
		DisplayTimer dt = new DisplayTimer();
		Thread t = new Thread(dt);
		t.start();
	}
}
