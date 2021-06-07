package com.capgemini.lab9.streamapi.exercise3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class AuthenticationMain {

	public static void main(String[] args) {
		
		Authentication au=(uname,pwd)->{
			boolean boolUn=Pattern.matches("^[a-zA-Z0-9]+$",uname);
			boolean boolPwd=Pattern.matches("^[a-zA-Z]+(.+)$",pwd);
			if(boolUn&&boolPwd)
			{
				return true;
			}
			return false;
		};
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Username (alphabets or digits): ");
		String uname=sc.nextLine();
		System.out.print("Enter Password (must start with alphabets): ");
		String pwd=sc.nextLine();
		
		boolean check=au.authenticationMehtod(uname, pwd);
		if(check)
		{
			System.out.println("Username Password verified");
		}
		else
		{
			System.out.println("Username or Password is incorrect");
		}
	}

}
