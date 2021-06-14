package corejavalabbookexlab3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class lab3exercise1 
{
	public static void main(String[] args) 
	{
		System.out.println("Incert comma seperated integers : ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		StringTokenizer st=new StringTokenizer(str,",");
		int len=st.countTokens();
		int[] arr=new int[len];
		int i=0,dig; //1,2,3,4,5
		System.out.print("All the integers are : ");
		arr[i]=3;
		while(st.hasMoreTokens())
		{
			arr[i]=Integer.parseInt(st.nextToken(","));
			System.out.print(arr[i]+" ");
			i++;
		}
		System.out.println();
		int sum=0;
		for(i=0;i<len;i++)
		{
			sum+=arr[i];
		}
		System.out.println("Sum : "+sum);
	}
}
