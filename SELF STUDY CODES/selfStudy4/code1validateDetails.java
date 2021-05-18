package selfStudy4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class code1validateDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name : ");
		String name=sc.next();
		String regexName="^(?=.{8,})(?=.*[a-z])(?=.*[A-Z])(?=.*[,_-]).*$";
		Pattern pName=Pattern.compile(regexName);
		Matcher matcherName=pName.matcher(name);
		boolean b1=matcherName.matches();
		System.out.println("name is "+b1);
		
		System.out.println("Enter the email : ");
		String email2=sc.next();
		String regexEmail2="^[a-zA-Z0-9+_.-]+@(.+)+\\.(.+)$";
		Pattern pattern2=Pattern.compile(regexEmail2);
		Matcher matcher2=pattern2.matcher(email2);
		boolean b2=matcher2.matches();
		System.out.println("email is "+b2);
		
		System.out.println("Enter the Password : ");
		String pwd=sc.next();
		String regexPwd="^(?=.{8,})(?=.*[a-z])(?=.*[A-Z])(?=.*[,_-]).*$";
		Pattern pPwd=Pattern.compile(regexPwd);
		Matcher matcherPwd=pPwd.matcher(pwd);
		boolean b3=matcherPwd.matches();
		System.out.println("password is "+b3);
		
		System.out.println("Enter the City : ");
		String city=sc.next();
		String regexCity="^(?=.*[a-zA-Z]).*$";
		Pattern pCity=Pattern.compile(regexCity);
		Matcher matcherCity=pCity.matcher(city);
		boolean b4=matcherCity.matches();
		System.out.println("city is "+b4);
		
		System.out.println("Enter the PIN : ");
		String PIN=sc.next();
		String regexPIN="^\\d{6}$";
		//String regexPIN="^(?=.{6})(?=.\\d).*$";
		Pattern pPIN=Pattern.compile(regexPIN);
		Matcher matcherPIN=pPIN.matcher(PIN);
		boolean b5=matcherPIN.matches();
		System.out.println("PIN is "+b5);
		
		System.out.print("enter mobile no : ");
		String mno=sc.next();
		boolean result=Pattern.matches("[789]{1}[0-9]{9}", mno);
		System.out.println("mobile no is "+result);
	}

}
/*
 purbitaM_
 purbitaM@fgfhfh.fgfd
 purbitaM_123
 zffgfghhfg
 434458
  */