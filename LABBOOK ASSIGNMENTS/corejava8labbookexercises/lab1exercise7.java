package corejava8labbookexercises;

import java.util.Scanner;

class checkNum
{
	public boolean checkNumber(int n)
	{
		int cnt=0,len=0;
		int temp=n,t2,leftDig,rightDig;
		while(temp>0)
		{
			temp=temp/10;
			len++;
		}
		//System.out.println(len);
		temp=n;
		while(temp/10!=0)
		{
			leftDig=temp%10;
			t2=(temp%100)/10;
			rightDig=t2;
			if(rightDig<=leftDig)
			{
				cnt++;
			}
			//System.out.println(cnt);
			temp=temp/10;
		}
		if(cnt==len-1)
		{
			return true;
		}
		return false;
	}
}

public class lab1exercise7 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter n : ");
		int n=sc.nextInt();
		checkNum cn=new checkNum();
		boolean check=cn.checkNumber(n);
		if(check)
		{
			System.out.println("It is an increasing number");
		}
		else
		{
			System.out.println("It is not an increasing number");
		}
		
	}

}
