package selfStudy3;

import java.util.Scanner;

public class Code9RemoveGivenChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter string : ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.print("Enter the character to be removed : ");
		char ch=sc.nextLine().trim().charAt(0);
		String str1="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=ch)
			{
				str1+=str.charAt(i);
			}
		}
		System.out.println("After removing '"+ch+"' from the string, the string is : "+str1);
	}

}
