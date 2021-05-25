package selfstudy8.com.capgemini.flowerhashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Flower 
{
	private int fid;
	private String fname;
	private double price;
	private double perKg;
	private int qty;
	
	public Flower() {
		super();
	}
	public Flower(int fid, String fname, double price, double perKg, int qty) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.price = price;
		this.perKg = perKg;
		this.qty = qty;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPerKg() {
		return perKg;
	}
	public void setPerKg(double perKg) {
		this.perKg = perKg;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	HashSet<Flower> fhs=new HashSet<Flower>();
	public HashSet<Flower> createList()
	{
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("Enter the details of Flower : ");
			System.out.print("Enter the fid : ");
			int fid = sc.nextInt();
			System.out.print("Enter the fname : ");
			String fname = sc.next();
			System.out.print("Enter the price : ");
			double price = sc.nextDouble();
			System.out.print("Enter the perKg : ");
			double perKg = sc.nextDouble();
			System.out.print("Enter the qty : ");
			int qty = sc.nextInt();
			fhs.add(new Flower(fid,fname,price,perKg,qty));
		}
		return fhs;
	}
	Scanner sc=new Scanner(System.in);
	Flower st;
	public void updateById(HashSet<Flower> hs,int id)
	{
		Iterator<Flower> itr=hs.iterator();
		while(itr.hasNext())
		{
			st=itr.next();
			if(st.getFid()==id)
			{
				System.out.println("Enter the fname : ");
				st.setFname(sc.nextLine());
			}
		}
	}
	
	public void display(HashSet<Flower> hs)
	{
		Iterator<Flower> itr=hs.iterator();
		while(itr.hasNext())
		{
			st=itr.next();
			System.out.println("fid : "+st.getFid()+" fname : "+st.getFname()+" price : "+st.getPrice()+" perKg : "+st.getPerKg()+" qty : "+st.getQty());
		}
	}
	
	public void deleteById(HashSet<Flower> hs,int id)
	{
		Iterator<Flower> itr=hs.iterator();
		while(itr.hasNext())
		{
			st=itr.next();
			if(st.getFid()==id)
			{
				itr.remove();
			}
		}
	}
	
	public void findProductById(HashSet<Flower> hs,int id)
	{
		int flag=0;
		Iterator<Flower> itr=hs.iterator();
		while(itr.hasNext())
		{
			st=itr.next();
			if(st.getFid()==id)
			{
				flag=1;
				System.out.println("fid : "+st.getFid()+" fname : "+st.getFname()+" price : "+st.getPrice()+" perKg : "+st.getPerKg()+" qty : "+st.getQty());
			}
		}
		if(flag==0)
		{
			System.out.println("fid doesn't exist");
		}
	}
}
