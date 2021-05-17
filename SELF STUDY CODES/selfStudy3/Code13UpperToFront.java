package selfStudy3;

import java.util.Scanner;

public class Code13UpperToFront {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter string : ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String upr="";
		String lwr="";
		for(int i=0;i<str.length();i++)
		{
			if((int)(str.charAt(i))>=65 && (int)(str.charAt(i))<=90)
			{
				upr+=str.charAt(i);
			}
			else
			{
				lwr+=str.charAt(i);
			}
		}
		System.out.println("Final String is : "+(upr+lwr));
	}

}
