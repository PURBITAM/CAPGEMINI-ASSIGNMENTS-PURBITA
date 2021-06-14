package selfStudy4.ShapeAndSubclasses;

import java.util.Scanner;

public class ShapeMain 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter shape : 1. Circle  2. Rectangle");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		double radius,width,length;
		String color;
		boolean filled;
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		Square s=new Square();
		if(ch==1)
		{
			System.out.println("ENTER DETAILS OF CIRCLE : ");
			sc.nextLine();
			System.out.println("enter Color :");
			color=sc.nextLine();
			System.out.println("enter Filled :");
			filled=sc.nextBoolean();
			System.out.println("enter Radius :");
			radius=sc.nextDouble();
			c.setColor(color);
			c.setFilled(filled);
			c.setRadius(radius);
			System.out.println(c.toString());
		}
		else if(ch==2)
		{
			System.out.println("ENTER DETAILS OF RECTANGLE : ");
			sc.nextLine();
			System.out.println("enter Color :");
			color=sc.nextLine();
			System.out.println("enter Filled :");
			filled=sc.nextBoolean();
			System.out.println("enter Width :");
			width=sc.nextDouble();
			System.out.println("enter Length :");
			length=sc.nextDouble();
			if(width==length)
			{
				s.setColor(color);
				s.setFilled(filled);
				s.setWidth(width);
				s.setLength(length);
				System.out.println(s.toString());
			}
			else
			{
				r.setColor(color);
				r.setFilled(filled);
				r.setWidth(width);
				r.setLength(length);
				System.out.println(r.toString());
			}
		}
	}
}
