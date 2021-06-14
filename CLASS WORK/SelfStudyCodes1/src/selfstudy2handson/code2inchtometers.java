package selfstudy2handson;

import java.util.Scanner;

public class code2inchtometers 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of a in inch : ");
		int a=sc.nextInt();
		System.out.print("a in meter : ");
		System.out.println((a*0.0254)+" meters");
	}
}
