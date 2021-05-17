package selfStudy3;

import java.util.Scanner;

public class Code14CheckEmail {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.print("Enter string : ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		if(str.contains("@")&&str.contains("."))
		{
			System.out.println("Email contains '@' and '.'");
		}
		else if(str.contains("@"))
		{
			System.out.println("Email contains '@' but not '.'");
		}
		else if(str.contains("."))
		{
			System.out.println("Email contains '.' but not '@'");
		}
		else
		{
			System.out.println("Email doesn't contain '@' and '.'");
		}
	}

}
