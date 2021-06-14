package selfStudy3;

import java.util.Scanner;

public class Code10CheckTypeOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter string : ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.print("Enter position of character : ");
		int pos=sc.nextInt();
		pos-=1;
		int ch=str.charAt(pos);
		
		if(ch>=48 &&ch<=57)
		{
			System.out.println("This character is a digit");
		}
		else if((ch>=65 &&ch<=90)||(ch>=97 &&ch<=122))
		{
			System.out.println("This character is an alphabet");
		}
		else
		{
			System.out.println("This character is a symbol");
		}
	}

}
