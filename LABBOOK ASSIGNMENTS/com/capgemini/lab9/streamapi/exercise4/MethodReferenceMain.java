package com.capgemini.lab9.streamapi.exercise4;

import java.util.Scanner;

public class MethodReferenceMain 
{
	private String name;
    private int age;
 
    // Constructor
     public MethodReferenceMain() {
		super();
	}
     
    public MethodReferenceMain(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
 
	public int getAge() { return age; }
    public String getName() { return name; }
    
    public void setAge(int age) { this.age = age; }
    public void setName(String name) { this.name = name; }
    
	public void printDetails()
	{	

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Name : ");
		String name=sc.next();
		System.out.print("Enter Age : ");
		int age=sc.nextInt();
		MethodReferenceMain mm=new MethodReferenceMain(name,age);
		System.out.println("Name : "+mm.getName());
		System.out.println("Age : "+mm.getAge());
	}


	public static void main(String[] args) 
	{
		MethodReferenceMain mrm=new MethodReferenceMain();
		MethodReferenceClass mr=mrm::printDetails;
		mr.referenceMethod();
	}
}
