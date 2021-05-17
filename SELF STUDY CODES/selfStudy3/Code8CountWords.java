package selfStudy3;

import java.util.Scanner;

public class Code8CountWords {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.print("Enter string : ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] arr=str.split("[ ,.@$]");
		System.out.println("Number of words in the string : "+arr.length);
	}

}
