package com.capgemini.foodorderingsystem.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Item 
{
	static Connection con=null;
	static Statement stmt=null;
	static PreparedStatement pstmt=null;
	static ResultSet rs=null;
	static Scanner sc=new Scanner(System.in);
	
	public Connection dbConnection() 
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:PURBITAORACL","system","PURBITA1234");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public void createTableItem() 
	{
		try {
			stmt=con.createStatement();
			String createTable="create table item(itemId number,itemName varchar2(10),itemVid number)";
			int i=stmt.executeUpdate(createTable);
			if(i==0) 
			{
				System.out.println("Table Created Successfully");
			}
			else 
			{
				System.out.println("Table Not Created Successfully");
			}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				stmt.close();
			}
			catch(SQLException e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	int itemId,itemVid;
	String itemName;
	
	public void readItemDetails()
	{
		System.out.println("ENTER CUSTOMER DETAILS : ");
		System.out.print("Enter Item ID : ");
		itemId=sc.nextInt();
		System.out.print("Enter Item Name : ");
		sc.nextLine();
		itemName=sc.nextLine();
		System.out.print("Enter Vendor Id : ");
		itemVid=sc.nextInt();
	}
	public int insertCustomer()
	{
		try 
		{
			String insertData="insert into item values(?,?,?)";
			pstmt=con.prepareStatement(insertData);
			readItemDetails();
			pstmt.setInt(1,itemId);
			pstmt.setString(2,itemName);
			pstmt.setInt(3,itemVid);
			
			int i = pstmt.executeUpdate();
			if(i!=0) 
			{
				System.out.println("data inserted successfully");
				return itemId;
			}
			else 
			{
				System.out.println("data is not inserted successfully");
				return 0;
			}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				pstmt.close();
			}
			catch(SQLException e) 
			{
				e.printStackTrace();
			}
		}
		return 0;
	}
}
