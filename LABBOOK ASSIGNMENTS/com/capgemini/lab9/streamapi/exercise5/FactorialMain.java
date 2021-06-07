package com.capgemini.lab9.streamapi.exercise5;

import java.util.Scanner;

public class FactorialMain {

	public int calculateFactorial(int n) {
		int result = 1;
		for(int i=1; i<=n; i++) {
			result = result * i;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sm = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = sm.nextInt();
		FactorialMain fm=new FactorialMain();
		FactorialInterface f = fm::calculateFactorial;
		System.out.println("Factorial of "+number+" : "+f.factorial(number));
	}

}
