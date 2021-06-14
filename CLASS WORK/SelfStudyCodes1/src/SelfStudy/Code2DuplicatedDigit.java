package SelfStudy;
import java.util.Scanner;

public class Code2DuplicatedDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num,count=0;
		while(temp>0)
		{
			temp=temp/10;
			count++;
		}
		temp=num;
		int[] arr=new int[count];
		for(int i=0;i<count;i++)
		{
			arr[i]=temp%10;
			temp=temp/10;
		}
		for(int i=count-1;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				
				if((arr[i]==arr[j])&&(i!=j))
				{
					System.out.println(arr[i]);
				}
			}
		}
	}
}
