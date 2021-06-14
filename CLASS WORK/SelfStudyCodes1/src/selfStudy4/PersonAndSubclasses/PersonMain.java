package selfStudy4.PersonAndSubclasses;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Student sd=new Student();
		Staff st=new Staff();
		
		Scanner sc=new Scanner(System.in);
		String name,address,program,school;
		double fee,pay;
		int year;
		System.out.println("ENTER STUDENT DETAILS : ");
		System.out.print("Enter name : ");
		name=sc.nextLine();
		System.out.print("Enter Address : ");
		address=sc.nextLine();
		System.out.print("Enter Program : ");
		program=sc.nextLine();
		System.out.print("Enter Year : ");
		year=sc.nextInt();
		System.out.print("Enter Fee : ");
		fee=sc.nextDouble();
		sd.setName(name);
		sd.setAddress(address);
		sd.setProgram(program);
		sd.setYear(year);
		sd.setFee(fee);
		System.out.println(sd.toString());
	
		System.out.println("ENTER STAFF DETAILS : ");
		System.out.print("Enter name : ");
		sc.nextLine();
		name=sc.nextLine();
		System.out.print("Enter Address : ");
		address=sc.nextLine();
		System.out.print("Enter School : ");
		school=sc.nextLine();
		System.out.print("Enter Pay : ");
		pay=sc.nextDouble();
		st.setName(name);
		st.setAddress(address);
		st.setSchool(school);
		st.setPay(pay);
		System.out.println(st.toString());
	}

}
