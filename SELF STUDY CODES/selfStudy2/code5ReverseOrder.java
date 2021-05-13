package selfStudy2;

import java.util.Scanner;

public class code5ReverseOrder {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter elements of array : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int loop;
		int temp=0;
		loop=(int)(arr.length/2);
		
		for(int i=0;i<loop;i++)
		{
			temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
		System.out.println("Reversed Array is : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
