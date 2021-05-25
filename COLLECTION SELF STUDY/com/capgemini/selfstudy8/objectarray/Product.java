package com.capgemini.selfstudy8.objectarray;

import java.util.Scanner;

public class Product 
{
	private int pid;
	private String pname;
	private double price;
	
	public Product() {
		super();
	}
	
	public Product(int pid, String pname, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}

	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	Product[] p=new Product[3];
	Scanner sc=new Scanner(System.in);
	
	public Product[] createList()
	{
		System.out.println("enter product details : ");
		for(int i=0;i<p.length;i++)
		{
			System.out.println("Enter pid : ");
			pid=sc.nextInt();
			System.out.println("Enter pname : ");
			sc.nextLine();
			pname=sc.nextLine();
			System.out.println("Enter price : ");
			price=sc.nextDouble();
			p[i]=new Product(pid,pname,price);
		}
		return p;
	}
	
	public Product[] deleteById(Product[] p,int id)
	{
		int len=p.length,flag=0,pos=0;
		for(int i=0;i<len;i++)
		{
			if(id==p[i].pid)
			{
				pos=i;
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("product found at " + pos);
					
			if(pos==p.length-1)
			{
				p[pos] = p[len-1];
				len--;
			}
			else if(pos<p.length-1)
			{
				for(int j=pos;j<len;j++)
				{
					if(j+1<len)
					{
						p[pos].pid=p[j+1].pid;
						p[pos].pname=p[j+1].pname;
						p[pos].price=p[j+1].price;
					}
				}
			}
			p[len-1].pid=0;
			p[len-1].pname=null;
			p[len-1].price=0.0;
		}
		
		else if(flag==0)
		{
			System.out.println("no product found");
		}
		return p;
	}
	
	
	public void findProductById(Product[] p,int id)
	{
		for(int i=0;i<p.length;i++)
		{
			if(p[i].getPid()==id)
			{
				System.out.println("product found at : "+i);
				System.out.println("Pid = "+p[i].pid+" Pname : "+p[i].pname+" price : "+p[i].price);
			}
			else
			{
				continue;
			}
		}
	}
	
	public void updateById(Product[] p,int id) {
		for(int i=0;i<p.length;i++) {
			if(p[i].getPid() == id)
			{
				System.out.println("Product found at " + i);
				System.out.println("Enter new name to update for the Product");
				String updatedname=sc.next();
				p[i].setPname(updatedname);
				System.out.println("Pid = "+p[i].pid+" Pname : "+p[i].pname+" price : "+p[i].price);
				break;
			}else {
				System.out.println("No product found");
			}
		}
		System.out.println();
	}
	
	public void display(Product[] p)
	{
		for(int i=0;i<p.length;i++)
		{
			System.out.println("Pid = "+p[i].pid+" Pname : "+p[i].pname+" price : "+p[i].price);
		}
	}
	
}
