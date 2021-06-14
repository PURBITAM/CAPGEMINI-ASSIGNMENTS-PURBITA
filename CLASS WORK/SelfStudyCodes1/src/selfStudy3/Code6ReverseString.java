package selfStudy3;

import java.util.Scanner;

public class Code6ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter string : ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String revstr="";
		for(int i=str.length()-1;i>=0;i--)
		{
			revstr+=str.charAt(i);
		}
		System.out.println("Reversed String is : "+revstr);
	}

}
