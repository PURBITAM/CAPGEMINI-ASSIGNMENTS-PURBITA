package selfStudy2;

import java.util.Scanner;

public class code1UnsortedArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array 1 : ");
		int n1=sc.nextInt();
		System.out.println("enter length of array 2 : ");
		int n2=sc.nextInt();
		int[] arr1=new int[n1];
		int[] arr2=new int[n2];
		System.out.println("enter values of array 1 : ");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("enter values of array 2 : ");
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		System.out.println("merged unsorted array is : ");
		int[] arr3=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++)
		{
			arr3[i]=arr1[i];
		}
		for(int i=arr1.length;i<arr3.length;i++)
		{
			arr3[i]=arr2[i-arr1.length];
		}
		for(int i=0;i<arr3.length;i++)
		{
			System.out.print(arr3[i]+" ");
		}
	}

}
