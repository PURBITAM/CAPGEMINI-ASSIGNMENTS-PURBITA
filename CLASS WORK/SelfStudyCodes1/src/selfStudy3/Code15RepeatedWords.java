package selfStudy3;

import java.util.Arrays;
import java.util.Scanner;

public class Code15RepeatedWords {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Enter string : ");
			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
			String[] arr=str.split(" ");
			int max=0,count=0;
			char ch;
			String[] chArr=new String[1];
			chArr[0]=arr[0];
			int k=2;
			for(int i=0;i<arr.length;i++)
			{
				count=0;
				for(int j=0;j<chArr.length;j++)
				{
					if(!(arr[i].equalsIgnoreCase(chArr[j])))
					{
						count++;
					}
				}
				if(count==chArr.length)
				{
					chArr=Arrays.copyOf(chArr,k);
					chArr[k-1]=arr[i];
					k++;
				}
				
			}
			int[] arrCount=new int[chArr.length];
			for(int i=0;i<chArr.length;i++)
			{
				count=0;
				for(int j=0;j<arr.length;j++)
				{
					if(arr[j].equalsIgnoreCase(chArr[i]))
					{
						count++;
					}
				}
				arrCount[i]=count;
			}
			
			if(chArr.length==arr.length)
			{
				System.out.print("Repeated words are : ");
				System.out.println(0);
			}
			else
			{
				System.out.println("Repeated words are : ");
				for(int j=0;j<chArr.length;j++)
				{
					if(arrCount[j]>1)
					{
						System.out.println(chArr[j].toLowerCase()+" ");
					}
				}
			}
			
		}
}
