package selfstudy2handson;

import java.util.Scanner;

public class code4circleareaperimeter 
{
	static final float PI=3.14f;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of radius : ");
		int r=sc.nextInt();
		System.out.println("area of rectangle : ");
		System.out.println(PI*r*r);
		System.out.println("perimeter of rectangle : ");
		System.out.println(2*PI*r);
		sc.close(); //close the scanner
		
	}
}
