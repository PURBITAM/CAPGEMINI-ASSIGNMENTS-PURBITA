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
//		System.out.print("Enter Vendor Id : ");
//		itemVid=sc.nextInt();
	}
	public void insertItem(int vId)
	{
		try 
		{
			String insertData="insert into item values(?,?,?)";
			pstmt=con.prepareStatement(insertData);
			readItemDetails();
			pstmt.setInt(1,itemId);
			pstmt.setString(2,itemName);
			pstmt.setInt(3,vId);
			
			int i = pstmt.executeUpdate();
			if(i!=0) 
			{
				System.out.println("data inserted successfully");
			}
			else 
			{
				System.out.println("data is not inserted successfully");
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

	public void updateItem(int vId, int itmId) 
	{
		try 
		{
			String updateProduct="update item set itemName=? where itemId=?";
			pstmt=con.prepareStatement(updateProduct);
			pstmt.setInt(2,itmId);
			System.out.print("Enter Item Name : ");
			String pname=sc.nextLine();
			pstmt.setString(1, pname);
			
			int psu=pstmt.executeUpdate();
			if(psu!=0)
			{
				System.out.println("Customer details updated successfully");
			}
			else
			{
				System.out.println("Customer details not updated successfully");
			}
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

	public void deleteItem(int vId, int itmId) 
	{
		try 
	    {
	        String deleteProduct = "delete from item where itemId = ?";
	        pstmt = con.prepareStatement(deleteProduct);
	        pstmt.setInt(1,itmId);
	        int i = pstmt.executeUpdate();
	        if(i != 0) {
	            System.out.println("product deleted successfully");
	        }else {
	            System.out.println("product not deleted  successfully");
	        }
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }finally {
	            try {
	                pstmt.close();
	                //rs.close();
	            } catch (SQLException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }

	        }
	}

	public void getItem(int vId) 
	{
		try 
		{
			String getProduct="Select * from item where itemVid=?";
			pstmt=con.prepareStatement(getProduct);
			pstmt.setInt(1, vId);
			rs=pstmt.executeQuery();
			System.out.println("ITEMID"+"\t"+"ITEMNAME"+"\t"+"ITEMVID");
			System.out.println("=======================================");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
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
	
	public void getAllItem() 
	{
		try 
		{
			String getProduct="Select * from item";
			pstmt=con.prepareStatement(getProduct);
			rs=pstmt.executeQuery();
			System.out.println("ITEMID"+"\t"+"ITEMNAME"+"\t"+"ITEMVID");
			System.out.println("=======================================");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
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
