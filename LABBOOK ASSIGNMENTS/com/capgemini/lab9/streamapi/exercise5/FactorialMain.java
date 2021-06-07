package com.capgemini.lab9.streamapi.exercise5;

import java.util.Scanner;

public class FactorialMain {

	public static void main(String[] args) {
		Scanner sm = new Scanner(System.in);
		FactorialInterface fact = (number)->{
			int num=1;
			for(int i=0;i<=number;i++) {
				if(i==0)
					num=1;
				else
					num=num*i;
			}
			return num;
		};
		System.out.print("Enter the number : ");
		int number = sm.nextInt();
		System.out.println("\nFactorial of "+number+" : "+fact.factorial(number));
		
		sm.close();
	}

}
