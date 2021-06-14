package selfStudy2;

import java.util.Scanner;

public class code3CountDuplicate1 
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
			arr[i]=sc.nextInt();     //1 1 1 2 4 4
		}
		
		int count=1,cnt=0,dupi=0,flag=0;
		int[] uniq=new int[n];
		uniq[0]=arr[0];	
		for(int i=1;i<arr.length;i++)
		{
			flag=0;
			for(int j=0;j<count;j++)
			{
				if(uniq[j]==arr[i])
				{
					flag=1;	
					break;
				}
			}
			if(flag==0)
			{
				uniq[count]=arr[i];
				count++;
				
			}
		}
		cnt=count;
		int[] dup=new int[cnt];
		for(int i=0;i<cnt;i++)
		{
			count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(uniq[i]==arr[j])
				{
					count++;
				}
			}
			dup[i]=count;
		}
		count=0;
		for(int i=0;i<dup.length;i++)
		{
			if(dup[i]>1)
			{
				count++;
			}
		}
		
		System.out.println("the duplicate integers are : ");
		if(count==0)
		{
			System.out.println("no value");
		}
		else
		{
			for(int j=0;j<dup.length;j++)
			{
				if(dup[j]>1)
				{
					System.out.println(uniq[j]);
				}
			}
		}
		
		System.out.println("number of duplicated values are : "+count);
		
	}
}
