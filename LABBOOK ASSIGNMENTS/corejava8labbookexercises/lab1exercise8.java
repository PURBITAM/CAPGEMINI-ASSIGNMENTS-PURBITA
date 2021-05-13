package corejava8labbookexercises;

import java.util.Scanner;

class checkN
{
	public boolean checkNumber(int n)
	{
		int temp=n;
		while(temp>2)
		{
			temp=temp/2;
			System.out.println(temp);
		}
		if(temp==2)
		{
			return true;
		}
		return false;
	}
}
public class lab1exercise8 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter n : ");
		int n=sc.nextInt();
		checkN cn=new checkN();
		boolean check=cn.checkNumber(n);
		if(check)
		{
			System.out.println("It is a power of 2");
		}
		else
		{
			System.out.println("It is not a power of 2");
		}
	}

}
