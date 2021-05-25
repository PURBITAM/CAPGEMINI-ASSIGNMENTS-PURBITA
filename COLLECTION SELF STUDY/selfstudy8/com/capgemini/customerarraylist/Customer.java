package selfstudy8.com.capgemini.customerarraylist;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Customer 
{
	private int cid;
	private String custname;
	private double age;
	private String dob;
	private String email;
	private long mobilenumber;
	
	Date dt=new Date();
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	String dt1=sdf.format(dt);
	LocalDate date1;
	LocalDate date2 = LocalDate.parse(dt1);
	Period period;
	double yrsBtw;
	double mBtw;
	
	public Customer() {
		super();
	}
	public Customer(int cid, String custname, double age, String dob, String email, long mobilenumber) {
		super();
		this.cid = cid;
		this.custname = custname;
		this.age = age;
		this.dob = dob;
		this.email = email;
		this.mobilenumber = mobilenumber;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public double getAge() {
		return age;
	}
	public void setAge(long age) {
		this.age = age;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(int mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	ArrayList<Customer> alc=new ArrayList<Customer>();
	Scanner sc=new Scanner(System.in);
	
	public ArrayList<Customer> insert()
	{
		int cidFlag=0,nameflag=0,emailflag=0,ageflag=0,mnoflag=0;
		System.out.println("Enter Details of customer : ");
		System.out.print("Enter cid : ");
		try
		{
			cid=sc.nextInt();
			String cidstr=""+cid;
			int count=0,ch;
			for(int i=0;i<cidstr.length();i++)
			{
				ch=(int)cidstr.charAt(i);
				if(ch>=48&&ch<=57)
				{
					count++;
				}
			}
			boolean checkcid=(cid==0||cid<0||cidstr.isEmpty()||cidstr==null||(count!=cidstr.length()));
			if(checkcid)
			{
				throw new InvalidCidException("id show be greater than 0 and should not be null");
			}
		}
		catch(InvalidCidException c)
		{
			System.out.println(c.getMessage());
			return alc;
		}
		System.out.print("Enter custname : ");
		try
		{
			sc.nextLine();
			custname=sc.nextLine();
			int count=0,ch;
			for(int i=0;i<custname.length();i++)
			{
				ch=(int)custname.charAt(i);
				if((ch>=65&&ch<=90) || (ch>=97 && ch<=122))
				{
					count++;
				}
			}
			boolean checkName=(count==custname.length());
			if(!checkName)
			{
				throw new InvalidNameException("Name must contain only alphabets");
			}
		}
		catch(InvalidNameException n)
		{
			System.out.println(n.getMessage());
			return alc;
		}
		
		System.out.print("Enter dob (YYYY-MM-DD): ");
		try
		{
			dob=sc.nextLine();
			date1 = LocalDate. parse(dob);
			period = date1. until(date2);
			yrsBtw = period.getYears();
			mBtw = (period.getMonths());
			age=(((yrsBtw*12)+mBtw)/12);
			boolean checkAge=((age==0)||(age<0)||(age>100));
			if(checkAge)
			{
				throw new InvalidAgeException("Age is not appropriate. Data can't be inserted.");
			}
		}
		catch (InvalidAgeException a)
		{
			System.out.println(a.getMessage());
			return alc;
		}
		System.out.print("Enter email : ");
		try
		{
			email=sc.nextLine();
			boolean checkemail=Pattern.matches("^[a-zA-Z0-9._-]+@(.+)+\\.(.+)$",email);
			if(!checkemail)
			{
				throw new InvalidEmailException("should be in the format xyz@abc.cde and can include '.','_','-'");
			}
		}
		catch (InvalidEmailException e)
		{
			System.out.println(e.getMessage());
			return alc;
		}
		
		System.out.print("Enter mobile number : ");
		try
		{
			mobilenumber=sc.nextLong();
			String mno=""+mobilenumber;
			boolean checkmno=Pattern.matches("[789]{1}[0-9]{9}",mno);
			if(!checkmno)
			{
				throw new InvalidMobNoException("Mobile number should be of 10 digits and first three digits should be combination of 7,8,9");
			}
		}
		catch (InvalidMobNoException mn) 
		{
			System.out.println(mn.getMessage());
			return alc;
		}
		alc.add(new Customer(cid,custname,age,dob,email,mobilenumber));
		return alc;
	}
	
	public void display(ArrayList<Customer> al)
	{
		System.out.println("========================================");
		for(int i=0;i<al.size();i++)
		{
			System.out.println("Customer id : "+al.get(i).cid);
			System.out.println("Customer name : "+al.get(i).custname);
			System.out.println("Customer age : "+al.get(i).age);
			System.out.println("Customer DOB : "+al.get(i).dob);
			System.out.println("Customer email : "+al.get(i).email);
			System.out.println("Customer mobile number : "+al.get(i).mobilenumber);
			System.out.println("========================================");
			
		}
	}
	
	public void updateById(ArrayList<Customer> alc2, int id) 
	{
		for(int i=0;i<alc.size();i++)
		{
			if(alc2.get(i).getCid()==id)
			{
				System.out.println("Enter the new name : ");
				sc.nextLine();
				alc2.get(i).setCustname(sc.nextLine());
				break;
			}
		}
	}
	
	public void findProductById(ArrayList<Customer> alc2, int id1) 
	{
		for(int i=0;i<alc.size();i++)
		{
			if(alc2.get(i).getCid()==id1)
			{
				System.out.println("========================================");
				System.out.println("Customer id : "+alc2.get(i).cid);
				System.out.println("Customer name : "+alc2.get(i).custname);
				System.out.println("Customer age : "+alc2.get(i).age);
				System.out.println("Customer DOB : "+alc2.get(i).dob);
				System.out.println("Customer email : "+alc2.get(i).email);
				System.out.println("Customer mobile number : "+alc2.get(i).mobilenumber);
				System.out.println("========================================");
			}
		}
	}
	
	public void deleteById(ArrayList<Customer> alc2, int id2) 
	{
		for(int i=0;i<alc.size();i++)
		{
			if(alc2.get(i).getCid()==id2)
			{
				alc2.remove(i);
			}
		}
	}
	
	
}
