package selfStudy2;

import java.util.Scanner;

public class code4SumOfNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter elements of array : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int evenSum=0,oddSum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				evenSum+=arr[i];
			}
			else
			{
				oddSum+=arr[i];
			}
		}
		System.out.println("sum of numbers of even index : "+evenSum);
		System.out.println("sum of numbers of odd index : "+oddSum);
	}
}
