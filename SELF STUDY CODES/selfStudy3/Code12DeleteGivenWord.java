package selfStudy3;

import java.util.Scanner;

public class Code12DeleteGivenWord {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.print("Enter string : ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.print("Enter word to be deleted : ");
		String word=sc.nextLine();
		String str1=str.replaceAll(word,"");
		str1=str1.replaceAll("  "," ");
		System.out.print("After deleting the word '"+word+"' the string is : "+str1);
	}

}
