package com.capgemini.lab4.exercise1;

public class Person 
{
	private String name;
	private float age;
	public Person()
	{
		
	}
	
	public Person(String name, float age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public float getAge() {return age;}
	public void setAge(float age) {this.age = age;}

	@Override
	public String toString() {
		return "Account Holder Name = " + name + "\nAccount Holder Age = " + age;
	}
	
}
