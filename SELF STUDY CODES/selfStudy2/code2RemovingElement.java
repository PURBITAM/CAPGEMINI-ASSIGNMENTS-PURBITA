package selfStudy2;

import java.util.Scanner;

public class code2RemovingElement {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array : ");
		int len=sc.nextInt();
		int[] arr=new int[len];
		System.out.println("enter elements of array : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter index of element to be removed : ");
		int n=sc.nextInt();
		for(int i=n-1;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
