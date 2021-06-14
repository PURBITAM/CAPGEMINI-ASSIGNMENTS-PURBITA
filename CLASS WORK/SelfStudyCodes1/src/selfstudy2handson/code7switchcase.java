package selfstudy2handson;

import java.util.Scanner;

public class code7switchcase 
{
	public static void main(String[] args) {
		char[] arr=new char[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array values");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.next().trim().charAt(0);
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'||
			   arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
			{
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			if((int)arr[i]<48 || ((int)arr[i]>57 &&
			   (int)arr[i]<65) || ((int)arr[i]>90 && 
			   (int)arr[i]<97) || (int)arr[i]>122 )
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}
