package com.capgemini.lab9.streamapi.exercise1;

import java.util.Scanner;

public class LambdaMain {
	
	public static void main(String[] args) {
		LambdaInterface li=(x,y)->{
			return (long)(Math.pow(x,y));
		};
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter base number : ");
		int x=sc.nextInt();
		System.out.print("Enter exponent value : ");
		int y=sc.nextInt();
		System.out.println(x+" to the power "+y+" = "+li.powVal(x,y));
	}
}
