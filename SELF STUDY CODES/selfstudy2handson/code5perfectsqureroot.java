package selfstudy2handson;

import java.util.Scanner;

public class code5perfectsqureroot 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number : ");
		int r=sc.nextInt();
		
		if(Math.sqrt(r)==(int)Math.sqrt(r))
		{
			System.out.println("this is a perfect square");
		}
		else
		{
			System.out.println("this is not a perfect square");
		}
	}
}
