package com.capgemini.foodorderingsystem.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

public class Order 
{
	static Connection con=null;
	static Statement stmt=null;
	static PreparedStatement pstmt=null;
	static ResultSet rs=null;
	static Scanner sc=new Scanner(System.in);
	Date dt=new Date();
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
	
	public void createTableOrderFood() 
	{
		try {
			stmt=con.createStatement();
			String createTable="create table orderfood(orderId number,ItemId number,orderDate varchar(20),orderCustId number,orderQty number,orderStatus varchar(10))";
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
	
	public void insertOrd(int itmId, int qty, int custId) 
	{
		try 
		{
			String insertData="insert into orderfood values(?,?,?,?,?,?)";
			pstmt=con.prepareStatement(insertData);
			System.out.println("Enter order id : ");
			pstmt.setInt(1,sc.nextInt());
			pstmt.setInt(2,itmId);
			pstmt.setString(3,""+dt);
			pstmt.setLong(4,custId);
			pstmt.setInt(5,qty);
			pstmt.setString(6,"PLACED");
			
			int i = pstmt.executeUpdate();
			if(i!=0) 
			{
				System.out.println("ORDER PLACED");
			}
			else 
			{
				System.out.println("ORDER NOT PLACED");
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
	}

	public void orderDetails(int custId) 
	{
		try 
		{
			String getProduct="Select * from orderfood where ordercustid=?";
			pstmt=con.prepareStatement(getProduct);
			pstmt.setInt(1, custId);
			rs=pstmt.executeQuery();
			System.out.println("ITEMID"+"\t"+"ITEMNAME"+"\t"+"ITEMVID");
			System.out.println("=======================================");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getInt(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getInt(5)+"\t"+rs.getString(6));
			}
			System.out.println("=======================================");
		}
		catch(SQLException e) 
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
	}
	
	
	
}
