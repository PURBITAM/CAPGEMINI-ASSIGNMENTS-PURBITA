package selfstudy2handson;

import java.util.Scanner;

public class code6integerarray1 
{
	public static void main(String[] args) 
	{
		int[] marks = new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values : ");
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=sc.nextInt();
		}
		for(int i=0;i<marks.length;i++)
		{
			if(marks[i]==0)
			{
				System.out.print(marks[i]+" ");
				continue;
			}
		}
		System.out.println();
		for(int i=0;i<marks.length;i++)
		{
			if(marks[i]==0)
			{
				break;
			}
			//System.out.print(marks[i]+" ");
		}
	}
}
