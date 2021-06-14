package selfstudy2handson;

import java.util.Scanner;

public class code3areaperimeter 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of length : ");
		int a=sc.nextInt();
		System.out.println("enter value of breadth : ");
		int b=sc.nextInt();
		System.out.println("area of rectangle : ");
		System.out.println(a*b);
		System.out.println("perimeter of rectangle : ");
		System.out.println(2*(a+b));
	}
	
}
